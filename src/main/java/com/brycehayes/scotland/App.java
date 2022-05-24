package com.brycehayes.scotland;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer 
{
    public static void main( String[] args ) throws Exception {
    	SpringApplication.run(App.class, args);
        //System.out.println( "Hello Spring Boot" );
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}
}
