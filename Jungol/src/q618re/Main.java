package q618re;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private String name;
	private int height;
	private double weight;

	public Person(String name,int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void print
	{

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Person[] p  = new Person[5];
		
		for(int i = 0; i< p.length;i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			
			p[i] = new Person(name, height, weight);
		}
sc.close();
for (int i=0;i<p.lenght;i++) {
	p[i].print();
}
Arrays.sort(p, new Comparatro<person>() {
	@Override
	public int compare(Person o1, Person o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		
		int strlen = Math.min(name1.length(), name2.length());
		for (int i = 0; i<strlen; i++) {
			if(name1.charAt(i))
		}
		
	}
}

	}

}
