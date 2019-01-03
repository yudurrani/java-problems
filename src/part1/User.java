package part1;

public class User {

	String name;
	int age;
	
	@Override
	public boolean equals(Object obj) {
		User user2 = (User) obj;
		
		boolean sameName = this.name.equals(user2.name);
		boolean sameAge = this.age == user2.age;
		
		boolean sameObject = sameName && sameAge;
		
		return sameObject;
	}
}
