package q508;

public class Main {

	public static void main(String[] args) {
		System.out.println("      item     count     price");
		System.out.println("       pen        20       100");
		System.out.println("      note         5        95");
		System.out.println("    eraser       110        97");

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- �ܼ� Ÿ���� ���

		var penc = 20;
		var penp = 100;
		var notec = 5;
		var notep = 100;
		var eraserc = 110;
		var eraserp = 97;

		System.out.println("      item     count     price");
		System.out.println("       pen" + "        " + penc + "       " + penp);

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- ���� ������ ���� ���

		System.out.println("      item     count     price \n"
				+ "       pen        20       100 \n"
				+ "      note         5        95  \n"
				+ "    eraser       110        97");

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- �ٹٲ� ���� ��� ���
		
		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
		System.out.println("-------------------------------------------------------------------");
		// -----------------------------------------------------------------
		
		
	}

}
