package q616;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		sc.close();
		double a = (x1 + x2 + x3)/3;
		double b = (y1 + y2 + y3)/3;
		System.out.print("(");
		System.out.printf("%.1f",a);
		System.out.print(",");
		System.out.printf("%.1f",b);
		System.out.print(")");
	}
}


/*
삼각형의 세 꼭지점의 정수 좌표를 입력받아 삼각형의 무게중심의 실수 좌표를 구하여 

소수 첫째자리까지 출력하는 프로그램을 작성하시오.

*
*세 꼭지점이 (x1 y1), (x2 y2), (x3 y3)인 삼각형의 무게중심 = ((x1+x2+x3)/3 (y1+y2+y3)/3)
*
*/