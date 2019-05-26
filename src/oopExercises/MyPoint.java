package oopExercises;

public class MyPoint {
	
	private int x= 0;
	private int y= 0;
	
	public MyPoint() {
		
	}
	
	public MyPoint(int xi, int yi) {
		this.x= xi;
		this.y= yi;
		
	}
	
	public int getX(){
		
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX( int i) {
		this.x = i;
		
	}
	
	public void setY( int i) {
		this.x = i;
	}
	
	public int[] getXY(){
		
		int[] twoNumbers= new int[] {x,y};
				
		return twoNumbers;
	}
	
	public void setXY(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
		return "(" + x + "," + y +")";
	}
	
	public double distance(int xi, int yi) {
		double a = Math.pow((x-xi), 2);
		double b = Math.pow ((y-yi), 2);
		
		double c = Math.sqrt(a+b);
		
		return c;
	}
	
	public double distance(MyPoint another) {
		double a = Math.pow((x-another.getX()), 2);
		double b = Math.pow ((y-another.getY()), 2);
		
		double c = Math.sqrt(a+b);
		
		return c;
			
	}
	
	public double distance() {
		double a = Math.pow(x, 2);
		double b = Math.pow (y, 2);
		
		double c = Math.sqrt(a+b);
		
		return c;
		
	}
}
