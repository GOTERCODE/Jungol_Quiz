package q126;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inp = 0;
		int odd = 0;
		int even = 0;
		
		do {
			inp = sc.nextInt();
			if(inp == 0) {
				break;
			}
			if(inp%2==0)
			{even++;
			
			}else {
			
				odd++;
			}
			
		} while (inp != 0);
		sc.close();
	System.out.println("odd : " + odd);
	System.out.println("even : " + even);
		
	}
}

/*
 * 0 �̻��� �������� �������� ���еǾ� �ݺ������� �־�����.
 * 
 * 0�� �ԷµǸ� �ݺ����� ���߰� �� ������ �Է¹��� ���鿡 ���Ͽ�
 * 
 * Ȧ���� ������ ¦���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * 
 * 
 * 9 7 10 5 33 65 0 odd : 5 even : 1
 *
 */