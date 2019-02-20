package sortInterface;

public class Person implements SortComparable{
	protected String name;
	protected  int age;
	protected  int height;
	protected  String education;

	Person(String name, int age, int height, String education){
		this.name=name;
		this.age= age;
		this.height=height;
		this.education=education;
	}
	
	Person(String name, int age, int height){
		this.name=name;
		this.age= age;
		this.height=height;
	
	}
	
	// the function should get us the current age
	public int getAge() {
		return age;
	}
	
	public void setAge(int auyiguiyg) {
		this.age=auyiguiyg;
		
	}

	@Override
	public boolean isLessThan(Object o) {
		// TODO Auto-generated method stub
		if(!(o instanceof Person)) {
			return false;
		}
		Person c = (Person)o;
		return this.getAge() < c.getAge();
	}

}
