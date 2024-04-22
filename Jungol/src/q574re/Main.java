package q574re;

import java.util.Scanner;

public class Main {

	public int max(int n1, int n2, int n3) {
		int result = 0;
		
		if(n1<n2) {
			if(n2<n3) {
				result = n3;
			}else {
				result = n2;
			}
		}else {
			if(n1<n3) {
				result = n3;
			}else {
				result = n3;
			}
		}
		return result;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		sc.close();
		
		Main m;		//래퍼런스 변수 생성
		
		m = new Main();		//
		int ma = m.max(n1,n2,n3);
		System.out.println(ma);

	}

}