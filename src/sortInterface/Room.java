package sortInterface;

public class Room {
	
	double roomLength;
	double roomWidth;
	int roomWindows;
	int roomWashroom;
	String roomFlooring;
	
	public Room(double roomLength, double roomWidth, int roomWindows, int roomWashroom, String roomFlooring) {
		this.roomLength=roomLength;
		this.roomWidth=roomWidth;
		this.roomWindows=roomWindows;
		this.roomWashroom=roomWashroom;
		this.roomFlooring=roomFlooring;
	}
	
	public double getRoomSize() {
		return roomLength*roomWidth;
	}

}
