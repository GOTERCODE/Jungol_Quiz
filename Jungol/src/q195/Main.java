package q195;

import java.util.Scanner;

public class Main {



		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			String tel = sc.next();
			String addr = sc.next();
			sc.close();
			
			
			
			 Info info = new Info(name, tel, addr);
		        info.print(); 
			
			
			
		}
		
		class Info{
			private String name;
			private String tel;
			private String addr;
			
			public Info(String name, String tel, String addr) {
				this.name = name;
				this.tel = tel;
				this.addr = addr;
				
				
			}
			public void print() {
				System.out.println("name : " + name);
				System.out.println("tel : " + tel);
				System.out.println("addr : " + addr);
				
			}
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getTel() {
				return tel;
			}

			public void setTel(String tel) {
				this.tel = tel;
			}

			public String getAddr() {
				return addr;
			}

			public void setAddr(String addr) {
				this.addr = addr;
			}

		}
}

/*
 * �̸��� ��ȭ��ȣ, �ּҸ� ������ϴ� ����ü�� �����Ͽ� 1���� �ڷḦ �Է¹ް� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ������ ���̴� 100��
 * ���ϴ�.
 */