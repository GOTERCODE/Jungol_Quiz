package q129;

import java.util.Scanner;

public class Main2 {
	public static double area(double base, double height) {

		double ret = base * height / 2;
		return ret;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean B = true;

		while (B) {
			System.out.print("Base = ");
			double base = sc.nextDouble();
			System.out.print("Height = ");
			double height = sc.nextDouble();

			System.out.printf("Triangle width = " + "%.1f", area(base, height));
			System.out.println("");

			System.out.print("Continue? ");
			String st = sc.next();

			if (st.equals("Y") || st.equals("y")) {

			} else {
				B = false;
			}
		}
		sc.close();
	}
}
