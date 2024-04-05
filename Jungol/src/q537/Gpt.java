package q537;

import java.util.Scanner;

public class Gpt {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int number;
	        // 사용자로부터 100 이하의 양의 정수를 입력받는 부분
	        do {

	            while (!sc.hasNextInt()) {
	                sc.next(); // 다음 토큰 가져오기
	            }
	            // 정수 입력 받기
	            number = sc.nextInt();
	            // 입력된 값이 조건에 맞지 않을 경우 재입력 요청
	            if (number > 100 || number <= 0) {

	            }
	        } while (number > 100 || number <= 0);

	        int sum = 0;
	        int i = 1;
	        // 1부터 입력된 정수까지의 합을 구하는 부분
	        while (i <= number) {
	            sum += i;
	            i++;
	        }

	        // 합을 출력하는 부분
	        System.out.println(sum);
	        sc.close();
	    }
	

	

}


