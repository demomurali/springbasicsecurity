package com.example.springbasicsecurity;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class SpringbasicsecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbasicsecurityApplication.class, args);
	}

	
	  //@Bean
			public CommandLineRunner commandLineRunner(ApplicationContext ctx){
				return (args) -> {
					System.out.println("ctx.getBeanDefinitionCount()"+ctx.getBeanDefinitionCount());	
							Arrays.stream(ctx.getBeanDefinitionNames())
							.sorted()
							.forEach(name->System.out.println(name));
				};
		  }
}
