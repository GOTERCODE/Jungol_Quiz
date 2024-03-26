package q515;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner A = new Scanner(System.in);

		double weightInp = A.nextDouble();

		A.close();

		if (weightInp > 88.45) {
			System.out.println("Heavyweight");
		} else if (weightInp <= 50.80) {
			System.out.println("Flyweight");
		} else if (weightInp <= 61.23) {
			System.out.println("Lightweight");
		} else if (weightInp <= 72.57) {
			System.out.println("Middleweight");
		} else if (weightInp <= 88.45) {
			System.out.println("Cruiserweight");

		}
	}
}

/*
 * 복싱체급은 몸무게가
 * 
 * 50.80kg 이하를 Flyweight, 
 * 
 * 61.23kg 이하를 Lightweight, 
 * 
 * 72.57kg 이하를 Middleweight, 
 * 
 * 88.45kg 이하를 Cruiserweight, 
 * 
 * 88.45kg 초과를 Heavyweight
 * 
 * 라고 하자.
 * 
 *  
 * 
 * 몸무게를 입력받아 체급을 출력하는 프로그램을 작성하시오.
 */