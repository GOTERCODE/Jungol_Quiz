package q215;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		sc.close();

		String stA = new String();
		String stB = new String();

		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) <= 57 && a.charAt(i) >= 48) {
				stA += a.charAt(i);
			} else {
				break;
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) <= 57 && b.charAt(i) >= 48) {
				stB += b.charAt(i);
			} else {
				break;
			}
		}

		int intA = Integer.parseInt(stA);
		int intB = Integer.parseInt(stB);

		System.out.println(intA * intB);

	}
}