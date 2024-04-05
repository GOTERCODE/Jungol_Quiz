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
 * 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고
 * 
 * 3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가
 * 
 * -1이 입력되면 종료하는 프로그램을 작성하시오.
 */