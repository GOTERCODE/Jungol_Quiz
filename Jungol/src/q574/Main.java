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

/*�� ���� ������ ���޹޾� �ִ밪�� ���Ͽ� �����ϴ� �Լ��� �ۼ��ϰ�,

�� ������ �Է¹޾� �ִ밪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/