package q614re;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		
		studentInfo s1 = new studentInfo();
		studentInfo s2 = new studentInfo(school, grade);
		
	}
}

class studentInfo {
	private String school;
	private int grade;
		
	public studentInfo() {
		this.school =  "Jejuelementary";
		this.grade = 6;
		
	}

	
	public studentInfo(String school, int grade) {
		this.school = school;
		this.grade = grade;
		
	}

	public void print() {
		System.out.println(grade + " grade in" + school + " School");
	}


}

