package sortInterface;

public class Person {
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

}
