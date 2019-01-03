package part1;

import java.text.DecimalFormat;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat formatter = new DecimalFormat("#.###");
		System.out.println(formatter.format(6.6666));
		System.out.println(formatter.format(6.6663));

	}

}
