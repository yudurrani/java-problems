package sortInterface;

import java.util.ArrayList;
import java.util.HashMap;

public class House implements HouseInterface,SortComparable {
	String location;
	ArrayList<Room> rooms;
	int floors;
	boolean basement, garden, isLocked;
	int carParking;
	HashMap<String, Person> persons;

	House(String location, int floors, boolean basement, boolean garden, int carParking) {
		this.location = location;
		this.floors = floors;
		this.basement = basement;
		this.garden = garden;
		this.carParking = carParking;
		rooms = new ArrayList<Room>();
		persons = new HashMap<String, Person>();
	}

	public void addRoom(Room anyRoom) {
		rooms.add(anyRoom);
	}

	public int totalRooms() {
		return rooms.size();
	}

	public boolean isLocked() {
		return isLocked;

	}

	public void lock() {
		isLocked = true;
	}

	public void unlock() {
		isLocked = false;
	}

	public void walkIn(Person person) {

		if (isLocked == false) {
			persons.put(person.name, person);

		}

		else
			System.out.println("The House is locked");

	}

	public void walkOut(String name) {
		if (checkName(name) == false) {
			System.out.println("No person found");
			return;
		}
		
		if (isLocked == false) {
			persons.remove(name);
		}
		else
			System.out.println("You cannot leave the locked house" + name);
		
	}

	public boolean checkName(String name) {
		return persons.containsKey(name);
	}

	public double getArea() {
		// rooms.get(1) will give second value in the array, which is a Room object
		// rooms.size() will give size of array
		double totalArea = 0;
		for (int x = 0; x < rooms.size(); x++) {
			totalArea += rooms.get(x).getRoomSize();
		}
		return totalArea;
	}
	@Override
	public int noOfPeople() {
		// TODO Auto-generated method stub
		return persons.size();
	}

	@Override
	public boolean hasGarden() {
		return garden;
	}

	@Override
	public int hasParking() {
		// TODO Auto-generated method stub
		return carParking;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}
	public static void main(String[] args) {

		Room master = new Room(12, 12, 3, 1, "Wood");
		Room dinning = new Room(15, 15, 2, 0, "Marble");
		Person dad = new Person("Ali", 65, 165);
		Person mom = new Person("ama", 55, 156);
		Person tommy = new Person("Tommy", 30, 165);

		House myHouse = new House("Toronto", 3, true, true, 4);

		myHouse.addRoom(master);
		myHouse.addRoom(dinning);
		myHouse.walkIn(dad);
		myHouse.walkIn(mom);
		myHouse.lock();
		myHouse.walkIn(tommy);
		myHouse.walkOut(tommy.name);
		
		myHouse.walkOut("ama");
		myHouse.unlock();
		myHouse.walkOut(mom.name);
		myHouse.walkOut(mom.name);
		System.out.println(myHouse.getArea());
		
		HouseInterface mansion = new Mansion("2874 Gardenview cres");
		HouseInterface house2 = myHouse;
		
		System.out.println(mansion.getArea());
		System.out.println(house2.getArea());
		mansion.walkIn(dad);
		house2.walkIn(mom);
		
		System.out.println(mansion.getClass().getName());
		System.out.println(house2.getClass().getName());

	}

	@Override
	public boolean isLessThan(Object o) {
		// TODO Auto-generated method stub
		return this.getArea() < ((House)o).getArea();
	}

	

}
