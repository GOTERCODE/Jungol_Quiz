package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = sc.nextInt();


		sc.close();
		
		if (s.equals("M")) {			////String type �񱳿�����
			if (a >= 18) {
				System.out.println("MAN");
			} else if (a < 18) {
				System.out.println("BOY");
			}

		} 
		

		if (s.equals("F")) {	  		//String type �񱳿�����
			if (a >= 18) {
				System.out.println("WOMAN");
			} else if (a < 18){
				System.out.println("GIRL");
			}
		}
	}

}

/*
 * ���ڴ� 'M' ���ڴ� 'F'�� ��Ÿ����� �ϰ� 18�� �̻��� �����̶�� ����.
 * 
 * ����('M', 'F')�� ���̸� �Է¹޾� "MAN"(���γ���), "WOMAN"(���ο���), "BOY"(�̼��Ⳳ��),
 * "GIRL"(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 */

