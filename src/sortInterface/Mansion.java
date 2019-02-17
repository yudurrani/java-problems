package sortInterface;

import java.util.HashMap;

public class Mansion implements HouseInterface{

	Room[] rooms;
	HashMap<String, Person> persons;
	String location;
	
	public Mansion(String location) {
		rooms = new Room[15];
		for(int i =0 ;i < rooms.length; i++) {
			rooms[i] = new Room(200, 200, 10, 1, "Marble");
		}
		persons = new HashMap<String, Person>();
		this.location = location;
		
		
		
	}
	@Override
	public int totalRooms() {
		// TODO Auto-generated method stub
		return rooms.length;
	}

	@Override
	public double getArea() {
		
		int totalArea=0;
		for(int x=0; x<rooms.length; x++) {
			totalArea += rooms[x].getRoomSize();
			
		}
		return totalArea;
		
	}

	@Override
	public int noOfPeople() {
		// TODO Auto-generated method stub
		return persons.size();
	}

	@Override
	public void walkIn(Person value) {
		// TODO Auto-generated method stub
		persons.put( value.name, value );
	}

	@Override
	public void walkOut(String name) {
		// TODO Auto-generated method stub
		persons.remove(name);
		
	}

	@Override
	public boolean hasGarden() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int hasParking() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

}
