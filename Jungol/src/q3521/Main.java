package q3521;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int aCNT = sc.nextInt(); // 1
		int bCNT = sc.nextInt(); // 2
		int cCNT = sc.nextInt(); // 4
		int dCNT = sc.nextInt(); // 8
		int eCNT = sc.nextInt(); // 16
		int CNT = 0;
		int N = sc.nextInt();

		sc.close();

		while (true) {
			if (N > 16 && eCNT >= 1) {
				N -= 16;
				eCNT--;
				CNT++;
			} else if (N >= 8 && dCNT >= 1) {
				N -= 8;
				dCNT--;
				CNT++;
			} else if (N >= 4 && cCNT >= 1) {
				N -= 4;
				cCNT--;
				CNT++;
			} else if (N >= 2 && bCNT >= 1) {
				N -= 2;
				bCNT--;
				CNT++;
			} else if (N >= 1 && aCNT >= 1) {
				N -= 1;
				aCNT--;
				CNT++;
			} else if (N == 0) {
				System.out.println(CNT);
				break;
			} else {
				System.out.println("impossible");
				break;
			}
		}

	}

}
