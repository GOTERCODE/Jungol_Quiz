package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // ������ �Է¹޾� 1���� �Է¹��� ���������� ���ʴ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
	// while
		int i=1;
		while(i <= inp) {
			System.out.print(i + " ");
			i++;
			
	/* for

		for(int j=1;j<=inp;j++) {
			System.out.print(j + " ");
		} */
	
			
	/* 	do ~ while
			int k = 1;
			do {
			System.out.print(k + " ");
			}while(k++ < inp);
		*/	
		}
	}
}
