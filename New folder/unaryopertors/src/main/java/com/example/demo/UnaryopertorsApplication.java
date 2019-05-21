package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnaryopertorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnaryopertorsApplication.class, args);
		//unary plus operators
		int a=+20;
		//unary minus operators
		int b=-20;
		//increment operator(post increment) a=a+1		
		System.out.println("a++="+a++);
		System.out.println("value to 'a' post increment=" + a);
		//increment operator pre increment
		System.out.println("++a="+ ++a);
		//resetting a value a back to 20
		a=+20;
		//decrement operator (post decrement) a=a-1
		System.out.println("a--="+ a--);
		System.out.println("value to 'a' post decrement=" + a);
		//decrement operator pre decrement
		System.out.println("--a="+ --a);
		//logical compliment operator
		System.out.println("is a>b :"+ (a>b));
		System.out.println("logical compliment a>b :"+ !( a>b));
		
	}

}
