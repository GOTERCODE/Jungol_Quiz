package q528; //������ �Է¹޾� ù �ٿ� �Է� ���� ���ڸ� ����ϰ� ��° �ٿ� �����̸� ��minus�� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sci = new Scanner(System.in);
		int i1 = sci.nextInt();

		sci.close();

		if (i1 >= 0) {
			System.out.println(i1);
		} else {
			System.out.println(i1 + "\n" + "minus");
		}
	}
}
