package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		sc.close();
		double a = (x1 + x2 + x3)/3;
		double b = (y1 + y2 + y3)/3;
		System.out.print("(");
		System.out.printf("%.1f",a);
		System.out.print(",");
		System.out.printf("%.1f",b);
		System.out.print(")");
	}
}


/*
�ﰢ���� �� �������� ���� ��ǥ�� �Է¹޾� �ﰢ���� �����߽��� �Ǽ� ��ǥ�� ���Ͽ� 

�Ҽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

*
*�� �������� (x1 y1), (x2 y2), (x3 y3)�� �ﰢ���� �����߽� = ((x1+x2+x3)/3 (y1+y2+y3)/3)
*
*/