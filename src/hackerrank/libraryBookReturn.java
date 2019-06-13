package hackerrank;

import java.io.*;
import java.util.*;

public class libraryBookReturn {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner scanner = new Scanner(System.in);
		int rDay = scanner.nextInt();
		int rMonth = scanner.nextInt();
		int rYear = scanner.nextInt();
		int dueDay = scanner.nextInt();
		int dueMonth = scanner.nextInt();
		int dueYear = scanner.nextInt();

		Calendar ret = Calendar.getInstance();
		ret.set(rYear - 1, rMonth - 1, rDay - 1);
		long rTime = ret.getTimeInMillis();

		Calendar due = Calendar.getInstance();
		due.set(dueYear - 1, dueMonth - 1, dueDay - 1);
		long dTime = due.getTimeInMillis();

		int diffInDays = (int) ((rTime - dTime) / (1000 * 60 * 60 * 24)) + 1;

		if ((diffInDays) <= 0) {
			System.out.println(0);
		}

		else if (diffInDays > 365) {
			int yearFine = (diffInDays / 364);
			int fine = yearFine * 10000;
			// int remainder = diffInDays % 365 ;
			// int month = remainder / 30;
			// int monthFine = month * 500 ;
			// int daysFine = (remainder % 30 ) * 15;
			System.out.println(yearFine);

		}

		else if (diffInDays > 30 && diffInDays < 366) {
			int monthFine = (diffInDays / 30) * 500;

			// int daysFine = (diffInDays % 30)* 15;
			System.out.println(monthFine);
		}

		else
			System.out.println(diffInDays * 15);

		// if ( (diffInDays)>0 && (diffInDays)<31){
		// System.out.println(15*(diffInDays));
		// }

		//

		// if (rYear > dueYear) {
		// System.out.println(10000*(rYear-dueYear));
		// } else if(rMonth > dueMonth){
		// System.out.println(500*(rMonth-dueMonth));

		// } else if(rDay > dueDay){
		// System.out.println(15*(rDay-dueDay));
		// } else {
		// System.out.println(0);
		// }

		// else if(rDay > dueDay && rYear == dueYear && rMonth == dueMonth){
		// System.out.println(15*(rDay-dueDay));
		// }

		// else if(rDay == dueDay && rYear == dueYear && rMonth > dueMonth){
		// System.out.println(500*(rMonth-dueMonth));
		// }

		// else if(rDay == dueDay && rYear > dueYear && rMonth == dueMonth){
		// System.out.println(10000*(rYear-dueYear));
		// }

	}

}
