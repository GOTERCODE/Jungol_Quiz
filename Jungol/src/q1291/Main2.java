package q1291;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	
		
		
		do {
			int s = sc.nextInt();
			int e = sc.nextInt();
			
			if ((2 <= s && s <=9 ) && (2<= e&& e<=9)) {
				break;
			}else {
				System.out.println("INPUT ERROR!");
			}
			
			
		}
		
		sc.close();
		
		
		if (s < e) { // s�� e���� �������
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i <= e; i++) {
					// System.out.print(i+" * "+j+" = " + i*j + " ");
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
				}
				System.out.println("");
			}
		} else { // s�� e���� ū���
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i >= e; i--) {
					System.out.printf("%d * %d = %2d   ", i, j, i * j);
				}
				System.out.println("");
			}
		}
	}

}
