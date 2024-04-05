package q617;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		info[] persons = new info[5]; // 5개의 info 객체를 저장할 배열 생성

		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();

			persons[i] = new info(name, height); // 입력된 정보로 객체 생성하여 배열에 저장

			
			
		}
		Arrays.sort(persons, Comparator.comparingInt(info::getheight).reversed());	//입력받은 키를 큰 순서대로 배열
		sc.close();
		persons[4].print();	//키가 가장 작은 자리의 배열을 출력
		
	        

		
	}

}

class info {
	private String name;

	private int height;

	public info(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public void print() {
		System.out.print(name + " " + height);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}
}

/* 5명의 이름과 키를 입력받아 키가 가장 작은 사람의 이름과 키를 출력하는 프로그램을 작성하시오. */
