package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PassbyvalueApplication {

	public static void main(String[] args) {
		SpringApplication.run(PassbyvalueApplication.class, args);
		
		examplecls obj=new examplecls();
		Maths mathsobj=new maths(5,5);
		
		
		int x=10;
		obj.example1(x);
		System.out.println(x);
		
		obj.example2(mathsobj);
		System.out.println(mathsobj.addition());
		
		obj.example3(mathsobj);
		System.out.println(mathsobj.addition());
		
		
		
	}

}
