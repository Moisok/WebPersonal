package es.proyecto.webpersonal.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityAppConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource seguridadDataSource; 
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.jdbcAuthentication().dataSource(seguridadDataSource);
	}
	
	//Metodo encargado de configurar nuestra seguridad web (login logout etc.....)
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//http.authorizeRequests().anyRequest().authenticated().and().formLogin()
		http.authorizeRequests()
		.antMatchers("/adminzone/**") 
		.hasAnyRole("ADMINISTRADOR")//Aqui le decimos que solo los administradores pueden ir  a /administradores
		.and().formLogin()
		.and().csrf().disable();
	}
}
