package q618;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		info[] persons = new info[5];

		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();

			persons[i] = new info(name, height, weight);

		}
		sc.close();
		
		
		
		Arrays.sort(persons, Comparator.comparing(info::getName));
		System.out.println("name");
		for (int i = 0; i < 5; i++) {

			persons[i].print();

		}

		
		System.out.println();
		
		
		System.out.println("weight");
		Arrays.sort(persons, Comparator.comparingDouble(info::getweight).reversed());
	
		for (int i = 0; i < 5; i++) {
			persons[i].print();
		}

	}

}

class info {
	private String name;
	private int height;
	private double weight;

	public info(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print() {
		System.out.println(name + " " + height + " " + weight);
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

	public double getweight() {
		return weight;
	}

	public void setweight(double weight) {
		this.weight = weight;
	}
}

/*
 * 5명의 이름과 키, 몸무게를 입력받아 이름순으로 정렬하여 출력하고, 
 * 
 * 몸무게가 무거운 순으로 정렬하여 출력하는 프로그램을 작성하시오. 
 * 
 * 몸무게는 소수점이하 1자리까지 출력한다.
 */

/*
 * Lee 150 35.6 Kim 155 28.9 Sin 148 32.7 Jung 160 41.2 Park 165 38.7
 */