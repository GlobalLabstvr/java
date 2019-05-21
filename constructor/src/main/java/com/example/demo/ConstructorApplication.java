package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import maths.maths;

@SpringBootApplication
public class ConstructorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConstructorApplication.class, args);
		int a = 0;
	
		maths.obj = new  maths(10,5);	
	  
	  a=Object.addition();	
	  System.out.println(a);
	}

}
