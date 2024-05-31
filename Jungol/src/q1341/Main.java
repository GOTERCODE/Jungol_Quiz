package q1341;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		sc.close();

		if (s > e) {
			for (int i = s; i >= e; i--) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d", i * j);
					System.out.print("   ");
					if (j % 3 == 0) {
						System.out.println("");
					}
				}
				System.out.println("");
			}
		}

		if (s < e) {
			for (int i = s; i <= e; i++) {
				for (int j = 1; j < 10; j++) {
					System.out.print(i + " * " + j + " = ");
					System.out.printf("%2d", i * j);
					System.out.print("   ");
					if (j % 3 == 0) {
						System.out.println("");
					}
				}
				System.out.println("");
			}
		}

		if (s == e) {

			for (int j = 1; j < 10; j++) {
				System.out.print(s + " * " + j + " = ");
				System.out.printf("%2d", s * j);
				System.out.print("   ");
				if (j % 3 == 0) {
					System.out.println("");
				}
			}
			System.out.println("");

		}

	}

}
