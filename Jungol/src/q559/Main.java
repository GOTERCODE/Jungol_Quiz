package q559; //1�ݺ��� 6�ݱ����� ��������� ������ �� �� ���� �� ��ȣ�� �Է¹޾� �� �� ��������� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

//�ݺ� ��������� �ʱⰪ���� 1�ݺ��� ���ʷ� 85.6 79.5 83.1 80.0 78.2 75.0���� �ʱ�ȭ�ϰ� ����� �Ҽ� �� ��° �ڸ����� �ݿø��Ͽ� �Ҽ� ù°�ڸ����� �Ѵ�.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cls = new Scanner(System.in);
		double[] scores = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 }; // ����Ÿ�� score ������ ������ �迭����� ���ÿ� �ʱ�ȭ
		int cls1 = cls.nextInt(); // ù��° �� �Է�
		int cls2 = cls.nextInt(); // �ι�° �� �Է�

		cls.close();

		double sum = scores[cls1 - 1] + scores[cls2 - 1]; // scores�� �Ҵ�� ��������� �ε��� ���� �Էµ� ����(��)���� -1�̴� | �ش� �ε����� �Ҵ�� ����
															// ���ϴ� ����

		System.out.println(sum); // ����� ���� ����Ѵ�
	}

}
