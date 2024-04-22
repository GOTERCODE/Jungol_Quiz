package q601;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp = sc.next();
		sc.close();

		for (int i = 0; i < inp.length(); i++) {

			for (int j = inp.length() - i - 1; j < inp.length(); j++) {
				System.out.print(inp.charAt(j));
			}
			for (int j = 0; j < inp.length() - i - 1; j++) {
				System.out.print(inp.charAt(j));
			}
			System.out.println();
		}
	}
}
