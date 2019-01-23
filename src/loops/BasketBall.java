package loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketBall {
	static Scanner scan = new Scanner(System.in); // for scanning inputs

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("");
		System.out.println("                                \" Welcome to Stats De Le BasketBall \"            ");
		System.out.println("");

		System.out.println("Number of Players you want to enter : ");
		int n = scan.nextInt();

		String[] names = new String[n];
		int[] avgRebounds = new int[n];
		int[] avgPoints = new int[n];
		int[] avgAssists = new int[n];

		Map<String, String> nRebounds = new HashMap();
		Map<String, String> nPoints = new HashMap();
		Map<String, String> nAssists = new HashMap();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter your " + (i + 1) + " Player name ");

			String name = scan.next();

			System.out.println(name + " Avg. Rebounds ");

			int agRebounds = scan.nextInt();

			System.out.println(name + " Avg. Points ");

			int agPoints = scan.nextInt();

			System.out.println(name + " Avg. Assists ");

			int agAssists = scan.nextInt();

			nRebounds.put(name, Integer.toString(agRebounds));
			nPoints.put(name, Integer.toString(agPoints));
			nAssists.put(name, Integer.toString(agAssists));

			names[i] = name;
			avgRebounds[i] = agRebounds;
			avgPoints[i] = agPoints;
			avgAssists[i] = agAssists;

		}

		System.out.println(" Cool! The numbers have been added successfully");
		System.out.println("");

		while (true) {

			option(); // to display the options user have

			String chk = scan.next();

			if (chk.equals("record")) {

				record(nRebounds, nPoints, nAssists);
			}

			if (chk.equals("stats")) {

				System.out.println("Enter which stats you want to see: 	rebounds, points or assists ");

				String chkStats = scan.next();
				System.out.println(chkStats + " for players are:");

				if (chkStats.equals("rebounds")) {
					rebounds(names, avgRebounds);
				}
				if (chkStats.equals("points")) {

					points(names, avgPoints);

				}

				if (chkStats.equals("assists")) {

					assists(names, avgAssists);

				}

			}

			if (chk.equals("update")) {

				System.out.println("Select which of the player you want to update:");

				for (int i = 0; i < n; i++) {

					System.out.println("");

					System.out.println((i + 1) + ", " + names[i]);
				}

				update(nRebounds, nPoints, nAssists, names, avgRebounds, avgPoints, avgAssists);

			}

			if (chk.equals("compare")) {

				System.out.println("Enter 1st player's name you want to compare");
				String player1 = scan.next();
				System.out.println("Enter 2nd player's name you want to compare");
				String player2 = scan.next();
				System.out.println("Enter the category name: rebounds, points or assists");
				String chkStats = scan.next();

				if (chkStats.equals("rebounds")) {
					comrebounds(player1, player2, nRebounds);
				}

				if (chkStats.equals("points")) {

					compoints(player1, player2, nPoints);
				}

				if (chkStats.equals("assists")) {

					comassists(player1, player2, nAssists);

				}

			}

			if (chk.equals("best")) {

				bestplayer(names, avgRebounds, avgPoints, avgAssists);
			}

		}

	}

	public static int maxx(int[] mx) {

		int max = Integer.MIN_VALUE;

		for (int x = 0; x < mx.length; x++) {

			max = Math.max(max, mx[x]);

		}
		return max;
	}

	public static int Sum(int[] mx) {

		int total = 0;

		for (int x = 0; x < mx.length; x++) {

			total = mx[x] + total;

		}
		return total;
	}

	public static void option() {

		System.out.println("");
		System.out.println("What do you like to do :-");
		System.out.println("");
		System.out.println("	- To check Player Record: type record");
		System.out.println("	- To search the stats category: type stats");
		System.out.println("	- To update the stats of any player: type update");
		System.out.println("	- To compare 2 Players Statiscally on a basis of category: type compare");
		System.out.println("	- To know the Best player compared to all : type best");

	}

	public static void record(Map<String, String> nRebounds, Map<String, String> nPoints,
			Map<String, String> nAssists) {

		System.out.println("Enter Players Name to see his stats:");

		String chkName = scan.next();

		if (nRebounds.containsKey(chkName)) {

			System.out.println(chkName + ":");
			System.out.println("   Rebounds   |   Points   |   Assists ");
			System.out.println("     " + nRebounds.get(chkName) + "            " + nPoints.get(chkName)
					+ "             " + nAssists.get(chkName));

		}
	}

	public static void rebounds(String[] names, int[] avgRebounds) {

		System.out.println("");
		System.out.println("	PLAYER NAME	|	REBOUNDS");
		System.out.println("");

		for (int i = 0; i < names.length; i++) {

			System.out.println("	" + names[i] + "			" + avgRebounds[i]);

		}

	}

	public static void points(String[] names, int[] avgPoints) {

		System.out.println("");
		System.out.println("	PLAYER NAME	|	POINTS");

		for (int i = 0; i < names.length; i++) {

			System.out.println("");

			System.out.println("	" + names[i] + "			" + avgPoints[i]);
		}

	}

	public static void assists(String[] names, int[] avgAssists) {

		System.out.println("");
		System.out.println("	PLAYER NAME	|	ASSISTS");

		for (int i = 0; i < names.length; i++) {

			System.out.println("");

			System.out.println("	" + names[i] + "			" + avgAssists[i]);

		}

	}

	public static void update(Map<String, String> nRebounds, Map<String, String> nPoints, Map<String, String> nAssists,
			String[] names, int[] avgRebounds, int[] avgPoints, int[] avgAssists) {

		System.out.println("Select which of the player you want to update:");

		String upd = scan.next();

		System.out.println(upd + " Avg. Rebounds ");

		int agRebounds = scan.nextInt();

		System.out.println(upd + " Avg. Points ");

		int agPoints = scan.nextInt();

		System.out.println(upd + " Avg. Assists ");

		int agAssists = scan.nextInt();

		nRebounds.put(upd, Integer.toString(agRebounds));
		nPoints.put(upd, Integer.toString(agPoints));
		nAssists.put(upd, Integer.toString(agAssists));

		// problem in finding the array number for desired update

		for (int x = 0; x < names.length; x++) {

			if (upd.equals(names[x])) {

				avgRebounds[x] = agRebounds;
				avgPoints[x] = agPoints;
				avgAssists[x] = agAssists;

			}

		}
		System.out.println(" The Player has been updated successfully");

	}

	public static void comrebounds(String player1, String player2, Map<String, String> nRebounds) {

		System.out.println(" Rebounds for these players are:");
		System.out.println("");
		System.out.println("	PLAYER NAME	|	REBOUNDS");
		String a = " ";
		String b = " ";

		if (nRebounds.containsKey(player1)) {
			System.out.println("	" + player1 + "			" + nRebounds.get(player1));
			a = nRebounds.get(player1);
		}

		if (nRebounds.containsKey(player2)) {
			System.out.println("	" + player2 + "	     " + nRebounds.get(player2));
			b = nRebounds.get(player2);
		}

		if (Integer.valueOf(a) > Integer.valueOf(b)) {
			System.out.println("");

			System.out.println("The statistical leader in this category with Avg of " + Integer.valueOf(a) + " is  * "
					+ player1 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!  I knew that");

		}

		else {
			System.out.println("");
			System.out.println("The statistical leader in this category with avg of " + Integer.valueOf(b) + " is  * "
					+ player2 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!!  I knew that");
		}

	}

	public static void compoints(String player1, String player2, Map<String, String> nPoints) {

		System.out.println("Points for players are:");
		System.out.println("");
		System.out.println("	PLAYER NAME	|	POINTS");
		String a = " ";
		String b = " ";
		if (nPoints.containsKey(player1)) {
			System.out.println("	" + player1 + "			" + nPoints.get(player1));

			a = nPoints.get(player1);

		}

		if (nPoints.containsKey(player2)) {
			System.out.println("	" + player2 + "			" + nPoints.get(player2));

			b = nPoints.get(player2);
		}

		if (Integer.valueOf(a) > Integer.valueOf(b)) {
			System.out.println("");

			System.out.println("The statistical leader in this category with Avg of " + Integer.valueOf(a) + " is  * "
					+ player1 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!!  I knew that");

		}

		else {
			System.out.println("");
			System.out.println("The statistical leader in this category with avg of " + Integer.valueOf(b) + " is  * "
					+ player2 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!!  I knew that");
		}

	}

	public static void comassists(String player1, String player2, Map<String, String> nAssists) {
		System.out.println(" Assists for players are:");
		System.out.println("");
		System.out.println("	PLAYER NAME	|	ASSISTS");
		String a = " ";
		String b = " ";

		if (nAssists.containsKey(player1)) {
			System.out.println("	" + player1 + "			" + nAssists.get(player1));
			a = nAssists.get(player1);
		}

		if (nAssists.containsKey(player2)) {
			System.out.println("	" + player2 + "			" + nAssists.get(player2));
			b = nAssists.get(player2);
		}

		if (Integer.valueOf(a) > Integer.valueOf(b)) {
			System.out.println("");

			System.out.println("The statistical leader in this category with Avg of " + Integer.valueOf(a) + " is  * "
					+ player1 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!!  I knew that");

		}

		else {
			System.out.println("");
			System.out.println("The statistical leader in this category with avg of " + Integer.valueOf(b) + " is  * "
					+ player2 + " *");
			System.out.println("");
			System.out.println(" ohh Boy !!!  I knew that");
		}
	}

	public static void bestplayer(String[] names, int[] avgRebounds, int[] avgPoints, int[] avgAssists) {
		System.out.println("Here is the stats table:-");
		System.out.println("	Names	|	Rebounds	|	Points	|	Assists		| 	TOTAL");

		int total = 0;
		int[] besti = new int[names.length];
		for (int i = 0; i < names.length; i++) {

			total = (Integer.valueOf(avgRebounds[i]) + Integer.valueOf(avgPoints[i]) + Integer.valueOf(avgAssists[i]));

			System.out.println("");

			System.out.println("	" + names[i] + "		" + avgRebounds[i] + "			" + avgPoints[i]
					+ "		 " + avgAssists[i] + "			" + total);

			besti[i] = total;

		}

		System.out.println(" ");
		System.out.println(" ");
		int highestTotal = maxx(besti);

		for (int x = 0; x < names.length; x++) {

			if (besti[x] == highestTotal) {

				System.out.println(" The Best Player will be the one with total score and that will be " + names[x]);

			}
		}
	}
}