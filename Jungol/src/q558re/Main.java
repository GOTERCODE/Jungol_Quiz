package q558re;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[100];
		int idx = 0;

		while (true) {
			ar[idx] = sc.nextInt();
			if (ar[idx] == 0) {
				break;
			}

			idx++;

		}
		sc.close();

		for (int i = idx - 1; i >= 0; i--) {
			System.out.print(ar[i] + " "); 			
													//	���������� �Էµ� �� 0�� �����ؾ� �ϹǷ� idx - 1 ������ �ο��Ͽ� ���������� �Էµ� �ε����� �ٷ� �պ��� ����ϵ��� �Ѵ�
		}											//	�� ���� �Է°� ����� ���� i ������ ������ �Էµ� ��ŭ �����ϵ��� �� idx ���������� ������ �Ѵ�

	}
}
