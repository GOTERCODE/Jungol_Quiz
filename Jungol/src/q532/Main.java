package q532; //�� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", ��� 3.0 �̻��̸� "B", �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
