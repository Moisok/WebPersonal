package es.proyecto.webpersonal.config;


import java.util.Properties;
import java.util.logging.Logger;

import javax.sql.DataSource;

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

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableWebMvc
@EnableTransactionManagement
@ComponentScan(basePackages = "es.proyecto.webpersonal")
@PropertySource("classpath:project.properties")
public class App 
{
    public Environment evn;
    
    private Logger myLogger= Logger.getLogger(getClass().getName());
    
    @Bean
    public ViewResolver viewResolver() {
    	InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
    	viewResolver.setPrefix("/WEB-INF/view/");
    	viewResolver.setSuffix("jsp");
    	return viewResolver();
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
    	properties.put("hibernate.show.sql", environment.getProperty("hibernate.show.sql"));
    	properties.put("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
    	return properties;
    }
    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
    	JpaTransactionManager transactionManager =  new JpaTransactionManager();
    	 transactionManager.setEntityManagerFactory(entityManagerFactory);
    	 return transactionManager;
    }
    
    
    
    
    //Definir bean para seguridad (dejar para mas tarde)
    //Tambien definir el metodo para convertir un string a entero 
    
    
}
