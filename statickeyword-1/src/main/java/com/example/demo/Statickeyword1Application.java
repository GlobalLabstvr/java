package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Statickeyword1Application {

	public static void main(String[] args) {
		SpringApplication.run(Statickeyword1Application.class, args);
		
		
		car obj = new car(7, 1.8F,4);
		car obj1 = new car(5, 1.7F,4);
		car obj2 = new car(6, 1.4F,4);
		car obj3 = new car(5, 1.7F,4);
		
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
		
	}

}
