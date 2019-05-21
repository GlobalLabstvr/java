package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OpertorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpertorsApplication.class, args);
		//assignment operator
		int i=20;
		double d=10.1;
		//additive operator
		System.out.println("i+d="+(i+d));
		//subraction operator
		System.out.println("i-d="+(i-d));
		//multiplication operator
		System.out.println("i*d="+(i*d));
		//division operator
		System.out.println("i/d="+(i/d));
		//reminder or module operator
		System.out.println("i%d="+(i%d));
	
		}
}
