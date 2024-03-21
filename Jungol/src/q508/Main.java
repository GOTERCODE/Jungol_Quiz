package q508;

public class Main {

	public static void main(String[] args) {
		System.out.println("      item     count     price");
		System.out.println("       pen        20       100");
		System.out.println("      note         5        95");
		System.out.println("    eraser       110        97");

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- 단순 타이핑 출력

		var penc = 20;
		var penp = 100;
		var notec = 5;
		var notep = 100;
		var eraserc = 110;
		var eraserp = 97;

		System.out.println("      item     count     price");
		System.out.println("       pen" + "        " + penc + "       " + penp);

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- 변수 선언을 통한 출력

		System.out.println("      item     count     price \n"
				+ "       pen        20       100 \n"
				+ "      note         5        95  \n"
				+ "    eraser       110        97");

		System.out.println("-------------------------------------------------------------------");
		// ----------------------------------------------------------------- 줄바꿈 문자 사용 출력
		
		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
		System.out.println("-------------------------------------------------------------------");
		// -----------------------------------------------------------------
		
		
	}

}
