package q530; //���̸� �Է¹޾� 20�� �̻��̸� "adult"��� ����ϰ� �׷��� ������ �� ���Ŀ� ������ �Ǵ����� "�� years later"��� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner age = new Scanner(System.in);
		
		int Iage = age.nextInt();
		
		age.close();
		
		if (Iage >= 20) {
			System.out.println("adult");
			
		} else {
			System.out.println(20 - Iage + " years later");
			
		}
	}
}
