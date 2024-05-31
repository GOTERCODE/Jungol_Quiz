package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 0; i < 10; i++) {
			if ((i + 1) % 2 == 0) {
				sum += arr[i];
			} else {
				avg += arr[i];
			}

		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : " + "%.1f\n", avg / (arr.length / 2));

	}

}
