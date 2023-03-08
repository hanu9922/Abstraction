package com.abstraction;

public class Rectangle extends Shape {
	public void printArea() {
		System.out.println("*** Finding the Area of Rectangle ***");
		System.out.print("Enter length and breadth: ");
		 int length = input.nextInt();
		 int breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
	

}
