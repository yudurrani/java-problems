package sortInterface;

//Person(String name, int age, int height)

public class Sort {

	public static void main(String[] arrgs) {
		Person[] students = new Person[5];
		students[0] = new Person("Yasir", 32, 78);
		students[1] = new Person("Safia", 22, 75);
		students[2] = new Person("Zaid", 25, 79);
		students[3] = new Person("Aizah", 32, 58);
		students[4] = new Person("Ayesha", 21, 78);

		int minAge = 0;

		sort(students);
		
		House[] houses = new House[3];
		
		Room master = new Room(12, 12, 3, 1, "Wood");
		Room dinning = new Room(15, 15, 2, 0, "Marble");
		Room dinning2 = new Room(105, 15, 2, 0, "Marble");
		Room dinning3 = new Room(225, 15, 2, 0, "Marble");

		houses[0]= new House("Toronto", 3, true, true, 4);

		houses[0].addRoom(master);
		houses[0].addRoom(dinning);
		houses[0].addRoom(dinning2);

		houses[1]= new House("Toronto", 3, true, true, 4);

		houses[1].addRoom(master);
		
		
		houses[2]= new House("Toronto", 3, true, true, 4);

		houses[2].addRoom(dinning2);
		
		
		for (int x=0; x<5; x++) {
			
			System.out.println(students[x].age);
		}
		System.out.println("About to sort houses");
		for(House h : houses) {
			System.out.println(h.getArea());
		}
		sort(houses);
		for(House h : houses) {
			System.out.println(h.getArea());
		}
		

	}
	
	public static void sort(SortComparable[] sortables) {
		for (int x = 0; x < sortables.length; x++) {

			for (int y = x; y < sortables.length; y++) {

				if (sortables[y].isLessThan(sortables[x])) {
					SortComparable temp = sortables[x];
					sortables[x] = sortables[y];
					sortables[y] = temp;
				}
				
					
			}
		}
	}

	
}
