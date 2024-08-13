package q198;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		info[] p = new info[2];

		for (int i = 0; i < 2; i++) {
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			p[i] = new info(height, weight);

		}
		sc.close();

		int heightRes = (int) ((p[0].getHeight() + p[1].getHeight()) / 2 + 5);
		System.out.print("height : ");
		System.out.print(heightRes);
		System.out.print("cm");
		System.out.println();
		double weightRes = ((p[0].getWeight() + p[1].getWeight()) / 2 - 4.5);
		System.out.print("weight : ");
		System.out.printf("%.1f", weightRes);
		System.out.print("kg");
	}
}

class info {

	private int height;
	private double weight;

	public info(int height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
