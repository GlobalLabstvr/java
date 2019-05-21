package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OperatorprocedanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OperatorprocedanceApplication.class, args);
		//Precedence example
		System.out.println("10*6-3=" + (10*6-3));
		//precedence example
		System.out.println("10*(6-3)=" +(10*(6-3)));
		//precedence example
		System.out.println("6/2-1=" +(6/2-1));
		//associately example
		System.out.println("10-3+5=" +(10-3+5));
		//associately example
		System.out.println("10-6-5=" +(10-6-5));
		//Example
		int x=5;
		System.out.println("10-4 /--x -5=" +(10-4/--x-5));
	
		
		
	}

}
