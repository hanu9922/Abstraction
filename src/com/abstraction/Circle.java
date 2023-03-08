package com.abstraction;

public class Circle extends Shape {
	public void printArea() {
		System.out.println("\n*** Finding the Area of Cricle ***");
		System.out.print("Enter Radius: ");
		int radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}

}
