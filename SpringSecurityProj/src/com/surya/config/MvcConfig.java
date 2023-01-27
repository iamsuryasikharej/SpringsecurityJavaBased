package com.surya.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@EnableWebMvc
@ComponentScan("com.surya.controllers")
public class MvcConfig extends WebMvcConfigurerAdapter {
	@Bean
public ViewResolver configureViewResolver()
{
	InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
	internalResourceViewResolver.setPrefix("/WEB-INF/");
	internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
}
}
