package oopExercises;

public class Circle {

	double radius = 1.0;
	String color = "red";
	
	public Circle() {
		
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public Circle(double r, String color) {
		this.color = color;
		this.radius = r;
	}
	
	public double getRadius() {
		
		return radius;
	}
	
	public double getArea() {
		
		return 2.0*Math.PI*radius ;
	}
	
	public String getColor() {
		return color;
	}
	
	

}
