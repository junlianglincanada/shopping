package com.junlianglin.groupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableAsync
// entable oauth2
//@EnableResourceServer
public class ShoppingApplication {

	public static void main(String[] args) {

		SpringApplication.run(ShoppingApplication.class, args);


	}


}
