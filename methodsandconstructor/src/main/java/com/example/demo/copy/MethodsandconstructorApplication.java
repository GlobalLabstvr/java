package com.example.demo.copy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MethodsandconstructorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MethodsandconstructorApplication.class, args);
		maths obj1=new maths(10,40);
		maths obj2=new maths(20,20);
		
		maths obj3=obj1;
		maths obj4=obj3;
		
		maths obj5=new maths (obj1.x,obj1.y);
		
		System.out.println(obj1.addition());
		System.out.println(obj2.addition());
		System.out.println(obj3.addition());
		System.out.println(obj4.addition());
		System.out.println(obj5.addition());
		
		
		
		
		
	}

}
