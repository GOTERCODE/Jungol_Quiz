package q599;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		String stre = st.replaceAll("[^A-z]","");

		System.out.println(stre.toUpperCase());

	}

}


/*���ڿ��� �Է¹޾� ���ĺ� ���ڸ� ��� �빮�ڷ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

���ڿ��� ���̴� 100�����̴�.*/