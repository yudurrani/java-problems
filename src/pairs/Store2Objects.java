package pairs;

public class Store2Objects<T,Z> {
	
	T x;
	Z y;
	
	Store2Objects(T x, Z y){
		
		this.x=x;
		this.y=y;
		
	}
	
	public T getx() {
		return x;
		
	}
	
	public Z gety() {
		return y;	
	}
	
	public void setx( T x) {
		this.x =x;
	}
	
	
	public void sety( Z y) {
		this.y =y;
	}

}
