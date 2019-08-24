package com.shoppingcart.Ecart;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class EcartApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(EcartApplication.class, args);
		
	}

}
