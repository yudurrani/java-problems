package loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BasketBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // for scanning inputs

		System.out.println("");
		System.out.println("                                \" Welcome to StatsMania \"            ");
		System.out.println("");

		System.out.println(" How many players do you want to check : ");
		int n = scan.nextInt();

		String[] names = new String[n];
		int[] avgRebounds = new int[n];
		int[] avgPoints = new int[n];
		int[] avgAssists = new int[n];

		Map<String, String> nRebounds = new HashMap();
		Map<String, String> nPoints = new HashMap();
		Map<String, String> nAssists = new HashMap();

		for (int i = 0; i < n; i++) {

			System.out.println(" Enter your " + (i + 1) + " Player First name ");

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

		while (true) {
			System.out.println("Do you want to seach by Player Name or Stats Category (Ans in : name or stats)");

			String chk = scan.next();
			boolean name = false;
			boolean stats = true;
			if (chk.equals("name")) {
				name = true;
			}

			if (name) {

				System.out.println("Enter Players Name to see his stats:");

				String chkName = scan.next();

				if (nRebounds.containsKey(chkName)) {
					System.out.println(chkName + ":");
					System.out.println("   Rebounds   |   Points   |   Assists");
					System.out.println("     " + nRebounds.get(chkName) + "            " + nPoints.get(chkName)
							+ "             " + nAssists.get(chkName));

				}

				else
					System.out.println("Not found");

			}

			else {

				System.out.println("Enter which stats you want to see: 	rebounds, points or assists ");

				String chkStats = scan.next();

				if (chkStats.equals("rebounds")) {
					System.out.println(chkStats + " for players are:");

					for (int i = 0; i < n; i++) {
						System.out.println("");
						System.out.println("	PLAYER NAME	|	REBOUNDS");
						System.out.println("	" + names[i] + "				"+ avgRebounds[i]);

					}
				}
				
				if (chkStats.equals("points")) {
					
					System.out.println(chkStats + " for players are:");

					for (int i = 0; i < n; i++) {
						
						System.out.println("");
						System.out.println("	PLAYER NAME	|	POINTS");

						System.out.println("	" + names[i] + "				" + avgPoints[i]);

					}
				}
				
				if (chkStats.equals("assists")) {
					System.out.println(chkStats + " for players are:");

					for (int i = 0; i < n; i++) {
						
						System.out.println("");
						System.out.println("	PLAYER NAME	|	ASSISTS");

						System.out.println("	" + names[i] + "				"+ avgAssists[i]);

					}
				}
			}

		}
	}
}
