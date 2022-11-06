package Java6;

import java.util.Scanner;

public class study2_IF문 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("이름을 입력하세요 : ");
		 
		 String name = sc.next();
		 
		 if(name.equals("홍길동"))
		 {
			 System.out.println("홍길동이 맞습니다!!");
			 
		 }
		 else
		 {
			 System.out.println("홍길동이 아닙니다.");
		 }
	 }
		 
}
	



