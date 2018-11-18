package com.sample.angularfileupload;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.sample.angularfileupload")
public class AppBuilder extends SpringBootServletInitializer{

 @Autowired
 DataSource dataSource;
 
 @Override
 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
  return application.sources(AppBuilder.class);
 }

 public static void main(String[] args) {
  SpringApplication.run(AppBuilder.class, args);
 }
}