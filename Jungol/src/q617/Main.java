package q617;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		info[] persons = new info[5]; // 5���� info ��ü�� ������ �迭 ����

		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			int height = sc.nextInt();

			persons[i] = new info(name, height); // �Էµ� ������ ��ü �����Ͽ� �迭�� ����

			
			
		}
		Arrays.sort(persons, Comparator.comparingInt(info::getheight).reversed());	//�Է¹��� Ű�� ū ������� �迭
		sc.close();
		persons[4].print();	//Ű�� ���� ���� �ڸ��� �迭�� ���
		
	        

		
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

/* 5���� �̸��� Ű�� �Է¹޾� Ű�� ���� ���� ����� �̸��� Ű�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
