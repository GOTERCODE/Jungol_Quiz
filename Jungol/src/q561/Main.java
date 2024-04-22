package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] inp = new int[10];
		for(int i =0;i<inp.length;i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();
		for(int i=0;i < inp.length; i++) {

		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < inp.length; i++) {
			if(inp[i]<100&&inp[i]>max) {
				max = inp[i];
			}
			if (inp[i]>=100&&inp[i]<min) {
				min = inp[i];
				
			}
		}
		System.out.println(max + " " + min);
		
	}
	
}


/*10개의 정수를 입력받아 100 미만의 수 중 가장 큰 수와 100 이상의 수 중 가장 작은 수를 출력하는 프로그램을 작성하시오.

(입력되는 정수의 범위는 1이상 10,000 미만이다. 만약 해당하는 수가 없을 때에는 100 을 출력한다.)*/