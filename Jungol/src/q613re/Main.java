package q613re;

import java.util.Scanner;

public class Main {
    public static class Student { // 내부 클래스로 변경 및 이름 변경
        public String name;
        public String school;
        public int grade;
        
        // 생성자 정의
        Student(String name, String school, int grade) {
            this.name = name;
            this.school = school;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Sn = sc.next();
        String Ss = sc.next();
        int Sg = sc.nextInt();
        sc.close();
        
        
        Student student = new Student(Sn, Ss, Sg); // 내부 클래스로 인스턴스 생성
        
        System.out.println("Name : " + student.name);
        System.out.println("School : " + student.school);
        System.out.println("Grade : " + student.grade);

    }
}