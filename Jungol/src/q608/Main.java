package q608;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();

		boolean cB = false;
		boolean abB = false;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) == 'c') {
				cB = true;
			}

			if (st.charAt(i) == 'a') {
				if (i != st.length() - 1 && st.charAt(i + 1) == 'b') {
					abB = true;
				}
			}
		}

		if (cB == true) {
			System.out.print("Yes ");
		} else {
			System.out.print("No ");
		}

		if (abB == true) {
			System.out.print("Yes ");
		} else {
			System.out.print("No ");
		}

	}

}
