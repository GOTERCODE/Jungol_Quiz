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


/*10���� ������ �Է¹޾� 100 �̸��� �� �� ���� ū ���� 100 �̻��� �� �� ���� ���� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

(�ԷµǴ� ������ ������ 1�̻� 10,000 �̸��̴�. ���� �ش��ϴ� ���� ���� ������ 100 �� ����Ѵ�.)*/