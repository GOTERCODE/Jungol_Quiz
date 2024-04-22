package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		int n = sc.nextInt();
	
		while (0<=n && n <=100) {
			
			
			
			if (n <= 100) {
				sum += n;
				count++;
				
			} else {
				double avg = sum/count;
				System.out.println("sum : " + sum);
				System.out.printf("avg : " + ("%.1f"),avg);
				break;
			}
			
		}
		sc.close();
	}

}

/*
 * 0 부터 100 까지의 정수를 계속 입력받다가 범위를 벗어나는 수가 입력되면 
 * 
 * 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램을 작성하시오.
 * 
 * (평균은 반올림하여 소수 첫째자리까지 출력한다.)
 */