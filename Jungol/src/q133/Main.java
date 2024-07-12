package q133;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			double a = sc.nextInt();
			sum += a;
		}
		sc.close();
		System.out.printf("%.2f", sum / n);
	}

}
