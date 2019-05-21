package com.example.demo;

public class cat extends  animal {
	public void meow() {
		System.out.println("Meow..");
	}
	public void run() {
		System.out.println("Running at 10km/hour");
	}
	public void run(int speed) {
		System.out.println("Dog is chasing:running faster at speed" +speed + "km/hour..");
		
	}
	public void scream() {
		System.out.println("scream like a cat..");
	}
	
}
