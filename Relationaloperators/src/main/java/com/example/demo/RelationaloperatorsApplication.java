package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RelationaloperatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationaloperatorsApplication.class, args);
		int a=20;
		int b=30;
		//greater than operator
		System.out.println(" is a>b :"+(a>b));
		//greater than or equal to operator
		System.out.println("is a>=b:" +(a>=b));
		//less than operator
		System.out.println(" is a<b:" +(a<b));
	    //less than or equal to operator
		System.out.println("is a<=b:" +(a<=b));
		//not equal operator
		System.out.println("is a!=b:" +(a!=b));
		//equality operator
		System.out.println(" is a==b:" +(a==b));
	}

}
