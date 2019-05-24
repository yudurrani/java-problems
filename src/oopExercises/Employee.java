package oopExercises;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;

	public Employee( int id, String firstName, String lastName, int salary) {
	
		this.id =id;
		this.firstName =firstName;
		this.lastName =lastName;
		this.salary = salary;
	
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
		
	}
	
	public String getName() {
		return firstName +" "+ lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary =salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary( int percent) {
		int x = (int) ((((double)salary)*((double)percent/100.0)) + salary);
		setSalary(x);
		return x;
	}
	
	public String toString() {
		return String.format(" id %s name %s salary %s", id, getName(), salary);
	}
}
