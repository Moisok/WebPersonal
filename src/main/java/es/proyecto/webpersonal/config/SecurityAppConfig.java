package es.proyecto.webpersonal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityAppConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests (authorizeRequests -> 
                authorizeRequests
                    .requestMatchers("/administradores/**").hasRole("ADMINISTRADOR")
            )
	            .formLogin(loginConfigurer ->
	            loginConfigurer
	                .loginPage("/administracionlogin")
	                .permitAll()
	                .defaultSuccessUrl("/administracion") // URL después del inicio de sesión exitoso
		        )
		        .logout(logoutConfigurer ->
		            logoutConfigurer
		                .logoutUrl("/administracionlogin")
		                .logoutSuccessUrl("/administracion") // URL después del cierre de sesión exitoso
		        )
		        .exceptionHandling(exceptionHandlingConfigurer ->
		            exceptionHandlingConfigurer.accessDeniedPage("/administracionerror")
		        );
    }
}


