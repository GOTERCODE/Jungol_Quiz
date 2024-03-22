package q532; //두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		double n1 = sc1.nextDouble();
		double n2 = sc2.nextDouble();

		sc1.close();
		sc2.close();

		if (n1 >= 4.0) {
			if (n2 >= 4.0) {
				System.out.println("A");

			} else if (n1 >= 3.0) {
				if (n2 >= 3.0) {
					System.out.println("B");
				} else {
					System.out.println("C");
				}
			}
		}
	}
}
