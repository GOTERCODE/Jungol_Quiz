package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		do { int inp = sc.nextInt();
		if(inp == 1) {
			break;
		}else if(inp % 3 == 0) {
			System.out.println(inp/3);
		}	
		}while(true);
		
		sc.close();
		
		
		


			
			
	}
}
	

	
	
	/*for (int i = 0; i < 1;) {
	if (inp % 3 == 0) {
		System.out.println(inp / 3);
		
	} else if ((inp % 3) != 0) {
		

	} else if (inp == -1) {
		i++;
		break;
		
	}*/
	
	
	//---------------------------------------
	
/*
 * ������ �Է¹޾Ƽ� 3�� ����� �ƴ� ��쿡�� �ƹ� �۾��� ���� �ʰ�
 * 
 * 3�� ����� ��쿡�� 3���� �������� ����ϴ� �۾��� �ݺ��ϴٰ�
 * 
 * -1�� �ԷµǸ� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */