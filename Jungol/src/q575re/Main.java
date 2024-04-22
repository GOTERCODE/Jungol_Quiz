package q575re;

import java.util.Scanner;



public class Main {
	public int jpow(int n1,int n2) {
		int result = 1;
		
		for(int i=0;i<n2;i++) {
			result *= n1;
		}
		return result;
	}

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		sc.close();
		
		Main main = new Main();
		int result = main.jpow(n1,n2);
		System.out.println(result);
	}

}
