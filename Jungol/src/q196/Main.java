package q196;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		info[] persons = new info[3];

		for (int i = 0; i < 3; i++) {
			String name = sc.next();
			String num = sc.next();
			String address = sc.next();

			persons[i] = new info(name, num, address);
		}
		sc.close();
		Arrays.sort(persons, Comparator.comparing(info::getName));

		System.out.print("name : ");
		System.out.println(persons[0].getName());
		System.out.print("tel : ");
		System.out.println(persons[0].getNum());
		System.out.print("addr : ");
		System.out.println(persons[0].getAddress());

	}

}

class info {
	private String name;
	private String num;
	private String address;

	public info(String name, String num, String address) {
		this.name = name;
		this.num = num;
		this.address = address;
	}

	public void print() {
		System.out.println(name + " " + num + " " + address);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}