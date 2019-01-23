package loops;

public class PrintStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


 		for (int add = 0; add < 6; add++) {

			for (int space = 0; space < 5-add; space++) {

				System.out.print(" ");
			}

			for (int width = 0; width < add; width++) {

				System.out.print("* ");

			}
			System.out.println("");

		}
	}

}
//String x = nRebounds.get(chkName);
//String y = nPoints.get(chkName);
//String z = nAssists.get(chkName);
//
//int [] total= new int[3];
//
//total[0] = Integer.valueOf(x);
//total[1] = Integer.valueOf(y);
//total[2] = Integer.valueOf(z);