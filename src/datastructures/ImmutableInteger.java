package datastructures;

public class ImmutableInteger {

	int immutableValue;
	
	int add;
	int sub;

	public ImmutableInteger(int immu) {
		immutableValue = immu;
	}
// get value
	// add value
	// subtract value
	
	int getValue() {
		return immutableValue;
	}
	
	ImmutableInteger addValue(int i) {
		return new ImmutableInteger(immutableValue + i) ;
	}
	
	ImmutableInteger subtractValue(int i) {
		return new ImmutableInteger(immutableValue - i) ;
	}
}
