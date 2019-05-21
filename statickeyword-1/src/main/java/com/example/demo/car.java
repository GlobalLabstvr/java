package com.example.demo;

public class car {
	int wheelcount=4;
	
	int gearcount=0;
	
	float height=0.0F;
	
	
	car(int gearcount,float height,int wheelcount) {
		this.gearcount=gearcount;
		this.height=height;
		this.wheelcount=wheelcount;
		
	}
	
	void display() {
		System.out.println("gearcount/height/wheelcount/:"+  gearcount +"/" + height + "/" + wheelcount +");
		
	}
}
