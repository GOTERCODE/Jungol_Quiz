package q125;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) { // 정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
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
