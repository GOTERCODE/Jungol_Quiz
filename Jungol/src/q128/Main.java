package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = 0;
		boolean b = true;
		while (b) {
			int n = sc.nextInt();

			if (n % 5 != 0 && n % 3 != 0) {

				count++;

			} else if (n == 0) {
				System.out.println(count);
				b = false;

			}

		}
		sc.close();
	}

}

/* 0 �� �Էµ� ������ ������ ��� �Է¹޾� 3�� ����� 5�� ����� ������ ������ ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */