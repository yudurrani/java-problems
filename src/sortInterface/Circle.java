package sortInterface;

public class Circle {
	
	double lineThickness;
	double radius;
	String color;
	
	Circle(double radius, String color){
		this.lineThickness=1;
		this.radius=radius;
		this.color=color;
		
	}
	
	Circle(double lineThickness, double radius, String color){
		this.lineThickness=lineThickness;
		this.radius=radius;
		this.color=color;
		
	}
	
	public double getlineThickness() {
		return lineThickness;
		
	}
	
	public void setlineThickness(double value) {
		this.lineThickness=value;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double value) {
		this.radius=value;
		
	}
	
	public String getColor(){
		return color;
	}
	
	public void setColor(String value) {
		this.color=value;
	}
	
	public double getDiameter() {
		return radius*2;
	}
}
