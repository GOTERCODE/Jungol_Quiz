package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		char[] cha = st.toCharArray();
		
		int i;
		int j;
			
		for(i=st.length()-1; i>0;i--) {
			System.out.print(cha[i]);
			if(i==0) {
				for(j=0;j<st.length()-1;j++) {
					System.out.print(cha[j]);
				}
				}
			}
		
		
	}
}
		
		
		
		
	
	

//if(i==st.length()-1) {
//	i = 0;
//	for(i=0;i<st.length();i++) {
//		System.out.print(cha[i]);
//	}