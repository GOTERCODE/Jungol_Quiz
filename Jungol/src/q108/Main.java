package q108;		// 정수형 변수 한 개를 선언하여 50을 대입하고 실수형 변수 한 개를 선언하여 100.12를 대입한 후 다음과 같이 출력되는 프로그램을 작성하시오.
					//(결과값은 소수점 이하에서 반올림) 

public class Main {

	public static void main(String[] args) {
		int A = 50;
		double B = 100.12;
		
		System.out.println(B + (" * ") + A + (" = ") + Math.round(B * A) );

	}

}
