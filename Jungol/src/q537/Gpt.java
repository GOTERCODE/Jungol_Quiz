package q537;

import java.util.Scanner;

public class Gpt {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int number;
	        // ����ڷκ��� 100 ������ ���� ������ �Է¹޴� �κ�
	        do {

	            while (!sc.hasNextInt()) {
	                sc.next(); // ���� ��ū ��������
	            }
	            // ���� �Է� �ޱ�
	            number = sc.nextInt();
	            // �Էµ� ���� ���ǿ� ���� ���� ��� ���Է� ��û
	            if (number > 100 || number <= 0) {

	            }
	        } while (number > 100 || number <= 0);

	        int sum = 0;
	        int i = 1;
	        // 1���� �Էµ� ���������� ���� ���ϴ� �κ�
	        while (i <= number) {
	            sum += i;
	            i++;
	        }

	        // ���� ����ϴ� �κ�
	        System.out.println(sum);
	        sc.close();
	    }
	

	

}


