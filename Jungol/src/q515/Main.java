package q515;

import java.util.Scanner;		//Scanner class = ����� �Է�

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	//ù��° ���� ����� �Է� ���� ����
		int b = sc.nextInt();
		
		sc.close();
		
		int c = a * b;		// ���� c(ù��° ���� ��) ����
		int d = a / b;
		
		System.out.println(a + " * " + b + " = " + c);
		System.out.println(a + " / " + b + " = " + d);
		//--------------------------------------------------- ���� �غ� ��ȿ������ ��� _ �����(c,d) ���� ����
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " * " + b + " = " + (a / b));
		//--------------------------------------------------- �����(c,d) ��¹� ��ü�� ���� ����
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		//--------------------------------------------------- �����(c,d) ���ڿ� ��� ���� ����
	}
}