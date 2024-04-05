package q614;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String School1 = "Jejuelementary";
		int grade1 = 6;
				
		Scanner sc = new Scanner(System.in);
		String School2 = sc.next();
		int grade2 = sc.nextInt();
		
		sc.close();
		
		StudentIfo studentIfo = new StudentIfo();
		
		// 객체에 멤버 변수 값 설정
		studentIfo.setSchool1(School1);
		studentIfo.setGrade1(grade1);
		studentIfo.setSchool2(School2);
		studentIfo.setGrade2(grade2);
		
		// 객체의 print 메소드 호출
		studentIfo.print();


	}

}

class StudentIfo {
	private String School1;
	private int grade1;
	private String School2;
	private int grade2;

	public void print() {
		
		System.out.print(grade1 + " grade in ");
		System.out.println(School1 + " School");
		
		System.out.print(grade2 + " grade in ");
		System.out.println(School2 + " School");
	}
	
	public String getSchool1() {
		return School1;
	}
	
	public void setSchool1(String School1) {
	    this.School1 = School1;
	}
	public String getchool2() {
		return School2;
	}
	
	public void setSchool2(String School2) {
		this.School2 = School2;
	}
	public int getGrade1() {
		return grade1;
	}
	
	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}
	public int getGrade2() {
		return grade2;
	}
	
	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}
	
}




/*"학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후,

한 개의 변수는 학교명에 "Jejuelementary", 학년에 "6"으로 각각 초기화하고 

다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.

 학교명은 20자 이하의 영문자이다.*/

//입력 Seogwipomiddle  1

//출력 6 grade in Jejuelementary School
//1 grade in Seogwipomiddle School