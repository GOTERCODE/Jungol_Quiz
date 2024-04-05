package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char st = sc.next().charAt(0);
		sc.close();
		String out;
		if(st == 'A') {
			out = "Excellent";
		}else if(st == 'B') {
			out = "Good";
		}else if(st == 'C') {
			out = "Usually";
		}else if(st == 'D') {
			out = "Effort";
		}else if(st == 'F') {
			out = "Failure";
		}else {
			out = "error";
		}
		System.out.println(out);
		/*
		switch(st) {
		case 'A':
		out = "Excellent";
		case 'B':
		out = "Good";
		case 'C':
		out = "Usually";
		case 'D':
		out = "Effort";
		case 'F':
		out = "Failure";
		default:
		out = "error";
		}
		System.out.println(out);*/
	}
}









/*
 * 영문 대문자를 입력받아 
 * 
 * 'A'이면 “Excellent”, 
 * 
 * 'B'이면 “Good”, 
 * 
 * 'C'이면 “Usually”, 
 * 
 * 'D'이면 “Effort”, 
 * 
 * 'F'이면 “Failure”, 
 * 
 * 그 외 문자이면 “error” 라고 출력하는 프로그램을 작성하시오.
 */