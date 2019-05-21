package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InheritanceApplication.class, args);
		
		dog  dogobj = new dog();
		livingbeing livingbeingobj =new livingbeing();
		animal animalobj=new animal();
		cat catobj=new cat();
	
		
		//Behaviour of living being
	     livingbeingobj.breath();
		 livingbeingobj.respond();
		//Behaviour of animal
		animalobj.sleep();
		animalobj.walk();
		//behaviour of dog
		dogobj.bark();
		//behaviour of cat
		catobj.meow();
		
		
	}

}
