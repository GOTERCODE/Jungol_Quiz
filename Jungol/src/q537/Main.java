package q537;

import java.util.Scanner;

public class Main { // 100 이하의 양의 정수만 입력된다. while 문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램을 작성하시오.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();
		
		
		
		//1.for loop
		int sum1 = 0;
		for(int i=1;i<=inp;i++) {
			sum1 += i;
		}
			System.out.println(sum1);
			
			
			
		//2.while loop
		int sum2 = 0;
		int j = 1;
		while(j <= inp) {
			sum2 += j;
			j++;
		}
		System.out.println(sum2);
		
		
		
		//3.do ~ while loop
		int sum3 = 0;
		int k = 1;
		do {
			sum3 += k;
		}while(k++ < inp);
		System.out.println(sum3);
		
		}
	
	}

	

