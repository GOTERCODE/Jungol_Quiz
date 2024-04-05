package q533;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		int a = sc.nextInt();
		sc.close();
		
		if(a >= 18) {
			if(s == 'M') {
				System.out.println("MAN");
				
			}else {
				System.out.println("WOMAN");
			}
			
			}else {
				if (s == 'M') {
					System.out.println("BOY");
				
			}else {
				System.out.println("GIRL");
			}
			
		}
		
	}
}


