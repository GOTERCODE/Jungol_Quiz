package q571; //���ڿ� "~!@#$^&*()_+|" �� ����ϴ� �Լ��� �ۼ��ϰ� ������ �Է¹޾� �Է¹��� ����ŭ �Լ��� ȣ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Main {
	public static void printStr() {

		System.out.println("~!@#$^&*()_+|");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i;
		for (i = sc.nextInt(); i > 0; i--) {
			printStr();
			sc.close();
		}

	}

}
