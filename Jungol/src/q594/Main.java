package q594;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {					// ���ڿ��� �Է¹��� �� �� ���ڿ��� �̾ �� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���ڿ��� ���̴� 100�����̴�.
		Scanner strInp = new Scanner(System.in);				// �Է°� heap ������ �Ҵ�
		String str = strInp.nextLine();							// [stack] str = [heap] strInp
		strInp.close();
		System.out.println(str + str);

	}
}