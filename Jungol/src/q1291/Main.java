package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int idx = 0;
		
		sc.close();
		Integer i[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int j = 1;
		int k = 1;
		
		
		
		
		
		for (idx = n1-1; idx <= n2-1; idx++) {
			while (j < 10) {
				
				
				System.out.print(i[idx] + " * " + j + " =  " + i[idx] * j);
				if(idx<n2-1) {
					idx=idx+1;
					System.out.println("   "+i[idx] + " * " + j + " =  " + i[idx] * j);
					
				}
				j++;
				
			}
			j=1;
		}
		
		
		
		
		
		for (idx = n2-1; idx <= n1-1; idx++) {
			while (j < 10) {
				
				for(k = j; k <= 10; k++) {
				System.out.print(i[idx] + " * " + j + " =  " + i[idx] * j);
				if(idx<n1-1) {
					idx=idx+1;
					System.out.print("   "+i[idx] + " * " + j + " =  " + i[idx] * j);
					
				}
				}
				j++;
				if(j==k) {
					System.out.println("");
				}
				if(idx==n1-1&&j==10) {
					break;
				}
				idx--;
			}
			j=1;
		}
	}
}

/*
 * 원하는 구구단의 범위를 입력받아 해당 구간의 구구단을 출력하는 프로그램을 작성하시오.
 * 
 * [처리조건]
 * 
 * (1) 구간의 처음과 끝을 입력받는다. 
 * 
 * (2) 입력된 구간은 반드시 처음 입력 값이 끝의 입력 값보다 작아야 하는 것은 아니다.
 * 
 *     즉, 입력된 구간의 범위는 증가하거나 감소하는 순서 그대로 출력되어야 한다.​ 
 */