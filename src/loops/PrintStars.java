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
