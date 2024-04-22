package q195;

import java.util.Scanner;

class person {
	private String name;
	private String tel;
	private String addr;
	
	public person(String name, String tel, String addr) {
		this.name = name;
		this.tel = tel;
		this.addr =addr;
	}
	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + addr);
		
	}
}

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addr = sc.next();
		sc.close();
		
		person p = new person(name,tel,addr);
		p.print();
		
	}

}
