package q613;

import java.util.Scanner;

public class Main {
    public String name;
    public String school;
    public int grade;
    
    // 생성자 정의
    public Main(String name, String school, int grade) {
        this.name = name;
        this.school = school;
        this.grade = grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String Sn = sc.next();
        String Ss = sc.next();
        int Sg = sc.nextInt();
        sc.close();
        
        
        Main student = new Main(Sn, Ss, Sg);
        
//        student.name = Sn;
//        student.school = Ss;
//        student.grade = Sg;
        
        System.out.println("Name : " + student.name);
        System.out.println("School : " + student.school);
        System.out.println("Grade : " + student.grade);

    }
}