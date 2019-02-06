package pairs;

public class PairVar implements Pair {
	
	private int x;
	private int y;
	
	PairVar(int firstValue, int secondValue){
		x= firstValue;
		y= secondValue;
		
	}
	
	
	
	
	public int getSecond() {
		return y;
	}

	
	public void setFirst(int firstVal) {
		x = firstVal ;
		
	}
	
	public void setSecond(int secondVal) {
		y= secondVal;
	}




	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		return x;
	}
}
