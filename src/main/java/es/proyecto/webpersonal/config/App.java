package es.proyecto.webpersonal.config;


import java.beans.PropertyVetoException;
import java.util.Properties;
import java.util.logging.Logger;
import org.hibernate.SessionFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.persistence.EntityManagerFactory;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = {"es.proyecto.webpersonal"})
@PropertySource("classpath:project.properties")
public class App 
{
    @Autowired
	public Environment env;
    
    private Logger myLogger= Logger.getLogger(getClass().getName());
    
    @Bean
    public DataSource securityDataSource() {
    	ComboPooledDataSource secutiryDataSoruce = new ComboPooledDataSource();
    	try {
    		secutiryDataSoruce.setDriverClass(env.getProperty("jdbc.driver"));
    	}catch(PropertyVetoException ex) {
    		ex.printStackTrace();
    	}
    	secutiryDataSoruce.setJdbcUrl(env.getProperty("jdbc.url"));
    	secutiryDataSoruce.setUser(env.getProperty("jdbc.user"));
    	secutiryDataSoruce.setPassword(env.getProperty("jdbc.password"));
    	secutiryDataSoruce.setInitialPoolSize(getStringToInt("connection.pool.initialPoolSize"));
    	secutiryDataSoruce.setMinPoolSize(getStringToInt("connection.pool.minPoolSize"));
    	secutiryDataSoruce.setMaxPoolSize(getStringToInt("connection.pool.maxPoolSize"));
    	secutiryDataSoruce.setMaxIdleTime(getStringToInt("connection.pool.maxIdleTime"));
    	return secutiryDataSoruce;
    }
    
    @Bean
    public ViewResolver viewResolver() {
    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    	viewResolver.setPrefix("/WEB-INF/views/");
    	viewResolver.setSuffix(".jsp");
    	return viewResolver;
    }
    
    @Bean
    public LocalSessionFactoryBean sessionFactory(DataSource dataSource, Environment environment) {
    	LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    	sessionFactory.setDataSource(dataSource);
    	sessionFactory.setPackagesToScan("es.proyecto.webpersonal.entities");
    	sessionFactory.setHibernateProperties(hibernateProperties(environment));
    	return sessionFactory;
    }
    
    private Properties hibernateProperties(Environment environment) {
    	Properties properties = new Properties();
    	properties.put("hibernate.dialect", environment.getProperty("hibernate.dialect"));
    	properties.put("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
    	properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
    	return properties;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory);
        return transactionManager;
    }
    
    //Metodo para convertir un string a entero 
    private int getStringToInt(String entero) {
    	String propVal = env.getProperty(entero);
    	int propPool = Integer.parseInt(propVal);
    	return propPool;
    }
}




