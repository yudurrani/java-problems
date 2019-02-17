package sortInterface;

public class Employee extends Person {
	
	int id;
	String position;
	int ability;
	
	
	
	Employee(String name, int id, String position, int ability, int height, String education, int age){
		super(name, age, height, education);
		this.id=id;
		this.position=position;
		this.ability=ability;
	}
	
	public void print() {
		System.out.println(name + age + " "+ height + education + id + position+ ability);
	}
}
