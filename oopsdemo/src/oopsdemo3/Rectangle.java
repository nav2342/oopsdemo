package oopsdemo3;

public class Rectangle implements Shape { //implementing Shape interface

		private double width;
		private double height;
		

	public Rectangle(double width, double height) {
			this.width = width;
			this.height = height;
		}

	@Override
	public void draw() {
		System.out.println("Drawing rectangle");
		
	}

	@Override
	public double getArea() {
		return this.height*this.width;
	} 
}
