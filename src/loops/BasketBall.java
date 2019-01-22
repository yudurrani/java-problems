package loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // for scanning inputs

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

		System.out.println("Thanks ! The stats has been added successfully");
		System.out.println("");

		while (true) {
			System.out.println("");
			System.out.println("What do you like to do :-");
			System.out.println("");
			System.out.println("	1-To check Player Record: type record");
			System.out.println("	2-To check which player is Statistical leader of the category: type stats");
			System.out.println("	3-To update the stats of any player: type update");
			System.out.println("	4-To compare 2 Players Statiscally on a basis of category: type compare");
			System.out.println("	5-To know the Best player compared to all : type best");

			String chk = scan.next();

			if (chk.equals("record")) {

				System.out.println("Enter Players Name to see his stats:");

				String chkName = scan.next();

				if (nRebounds.containsKey(chkName)) {
					System.out.println(chkName + ":");
					System.out.println("   Rebounds   |   Points   |   Assists");
					System.out.println("     " + nRebounds.get(chkName) + "            " + nPoints.get(chkName)
							+ "             " + nAssists.get(chkName));

				}

			}

			if (chk.equals("stats")) {

				System.out.println("Enter which stats you want to see: 	rebounds, points or assists ");

				String chkStats = scan.next();

				if (chkStats.equals("rebounds")) {
					System.out.println(chkStats + " for players are:");
					System.out.println("");
					System.out.println("	PLAYER NAME	|	REBOUNDS");

					for (int i = 0; i < n; i++) {

						System.out.println("	" + names[i] + "			" + avgRebounds[i]);
						System.out.println("");

					}

					System.out.println("The statistical leader in this category with" + maxx(avgRebounds) + "is");
				}

				if (chkStats.equals("points")) {

					System.out.println(chkStats + " for players are:");
					System.out.println("");
					System.out.println("	PLAYER NAME	|	POINTS");

					for (int i = 0; i < n; i++) {

						System.out.println("");

						System.out.println("	" + names[i] + "			" + avgPoints[i]);

					}
				}

				if (chkStats.equals("assists")) {
					System.out.println(chkStats + " for players are:");
					System.out.println("");
					System.out.println("	PLAYER NAME	|	ASSISTS");

					for (int i = 0; i < n; i++) {

						System.out.println("");

						System.out.println("	" + names[i] + "			" + avgAssists[i]);

					}
				}
			}

			if (chk.equals("update")) {

				System.out.println("Select player do you want to update:");

				for (int i = 0; i < n; i++) {

					System.out.println("");

					System.out.println((i + 1) + ", " + names[i]);
				}

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

			}

			if (chk.equals("compare")) {

				System.out.println("Enter Players Name to see his stats:");

			}

			if (chk.equals("best")) {

				System.out.println("Enter Players Name to see his stats:");

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
}
