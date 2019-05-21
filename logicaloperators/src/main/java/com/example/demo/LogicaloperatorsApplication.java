package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaloperatorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogicaloperatorsApplication.class, args);
		int a=20;
		int b=30;
		int c=100;
		//conditional operator AND
		System.out.println("CONDITIONAL AND...");
		System.out.println("True && True =" +((b>a) && (c>b)));
		System.out.println("True && False=" + ((a==20 )&& (a>b)));
		System.out.println("False && True =" + ((b==45) && (c>a)));
		System.out.println("False && False=" + (false && (c>1000)));
		//conditional operator OR
		System.out.println("CONDITIONAL OR...");
		System.out.println("True || True =" + ((b>a)|| (c>b)));
		System.out.println("True || False=" + ((a==20 )|| (a>b)));
		System.out.println("False || True =" + ((b==45)|| (c>a)));
		System.out.println("False || False=" + (false || (c>1000)));
		//Terenary oprator
		int minval= a < b? a:b;
		System.out.println("\n minimum value a and b using ternary operator is:" + minval);
		
		
		
		
		
		
	}

}
