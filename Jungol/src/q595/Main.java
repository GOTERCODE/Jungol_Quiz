package q595;

public class Main {

	public static void main(String[] args) { // 문자열을 "Hong Gil Dong"으로 초기화 한 후 3번부터 6번까지의 문자를 차례로 출력하시오.
		String name = "Hong Gil dong";
		System.out.print(name.charAt(3));
		System.out.print(name.charAt(4));
		System.out.print(name.charAt(5));
		System.out.println(name.charAt(6));
//------------------------------------------------
		System.out.println("----------------------------");
		for (int i = 3; i <= 6; i++) {
			System.out.print(name.charAt(i));
//------------------------------------------------
//			System.out.println("----------------------------");
//		System.out.print(name.substring(3,7));
			
			
			
		}

	}

}
