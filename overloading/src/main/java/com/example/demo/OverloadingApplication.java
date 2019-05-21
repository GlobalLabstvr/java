package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OverloadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OverloadingApplication.class, args);
		
		maths obj = new maths();
		maths obj2 = new maths(10,40);
		
		System.out.println(obj.addition(10,20));
		System.out.println(obj.addition(10.3,20));
		System.out.println(obj.addition(30,20,60));
		
		
	}

}
