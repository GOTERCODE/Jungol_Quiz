package q595;

public class Main {

	public static void main(String[] args) { // ���ڿ��� "Hong Gil Dong"���� �ʱ�ȭ �� �� 3������ 6�������� ���ڸ� ���ʷ� ����Ͻÿ�.
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
