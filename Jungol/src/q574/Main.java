package q574;


import java.util.Scanner;



public class Main {

	public static int N(int n1,int n2,int n3){



		int max = n1;
		if(max < n2) {
			max = n2;
		}
		if(max < n3) {
			max = n3;
		}
		System.out.println(max);
		return max;
	}
	
	public static void main(String[] args) {
		int n1,n2,n3;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		sc.close();
		 N(n1, n2, n3);
	}

}

/*세 개의 정수를 전달받아 최대값을 구하여 리턴하는 함수를 작성하고,

세 정수를 입력받아 최대값을 출력하는 프로그램을 작성하시오.*/