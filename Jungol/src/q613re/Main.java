package q613re;

import java.util.Scanner;

public class Main {
    public static class Student { // ���� Ŭ������ ���� �� �̸� ����
        public String name;
        public String school;
        public int grade;
        
        // ������ ����
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
        
        
        Student student = new Student(Sn, Ss, Sg); // ���� Ŭ������ �ν��Ͻ� ����
        
        System.out.println("Name : " + student.name);
        System.out.println("School : " + student.school);
        System.out.println("Grade : " + student.grade);

    }
}