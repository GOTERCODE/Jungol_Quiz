package q109;

import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Araay {
	Scanner sc = new Scanner(System.in);
int[] inp = new int[3];

for (int i = 0; i < inp.lenght; i++) {
	inp[i] = sc.nextInt();}
sc.close();
//	for(int i = 0;i<inp.lenfgt;i++)
//	{

//	}

	int sum = 0;
	
	for(int i = 0;i<inp.lenght;i++){
		sum += inp[i];}
	
	
	System.out.println("sum = "+sum);

	}
}
