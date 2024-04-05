package q616;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		sc.close();
		
		Exam dd = new Exam();
		
		Exam.setx((x1*x2*x3)/3);
		Exam.sety((y1*y2*y3)/3);
				
	}
	class Exam {
		private double x;
		private double y;
		
		public void print() {
			System.out.println(x);
			System.out.println(y);
		}
		public double getx() {
			return x;
		}
		public void x(double x) {
		    this.x = x;
		}
		public double gety() {
			return x;
		}
		public void y(double y) {
		    this.y = y;
		}
	}
	
	
}
