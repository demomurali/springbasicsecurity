package com.example.springbasicsecurity.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.savedrequest.NullRequestCache;
/*import org.springframework.session.ExpiringSession;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.SessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;
import org.springframework.web.servlet.config.annotation.CorsRegistry;*/

@Configuration
@EnableWebSecurity
//@EnableSpringHttpSession
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	
	
	@Autowired
	private AuthenticationEntryPoint authEntryPoint;
	 
    @Autowired
    protected void configure(AuthenticationManagerBuilder builder) throws Exception {
    	 builder.inMemoryAuthentication()
         .withUser("admin")
         .password("{noop}password")
         .roles("USER");
    }
    
///*   
   @Override
	protected void configure(HttpSecurity http) throws Exception {
	   super.configure(http);
		http.authorizeRequests()
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic()
				.authenticationEntryPoint(authEntryPoint);
	}
//*/
   
   
   
	
}





/*
 * 
 *  @Bean
    public HttpSessionStrategy httpSessionStrategy() {
        return new HeaderHttpSessionStrategy();
    }
    
    @Bean
	public SessionRepository<ExpiringSession> inmemorySessionRepository() {
		return new MapSessionRepository();
	}*/
