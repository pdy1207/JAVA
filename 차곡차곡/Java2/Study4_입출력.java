package Java2;

import java.util.Scanner; //빨간색 전구 클릭 맨 윗줄 바로 자동완성 

public class Study4_입출력 {

	public static void main(String[] args) {
		//입력 Scanner 

				Scanner sc = new Scanner(System.in);
				
				System.out.print("이름을 입력하세요 : ");
				String name = sc.next();  
				
				System.out.print("나이을 입력하세요 : ");
				int age = sc.nextInt();
				
				System.out.print("내 키을 입력하세요 : ");
				double height = sc.nextDouble(); 
				
				System.out.println("내 이름은 : " + name); 
				System.out.println("내 나이는 : " + age+ " 살"); 
				System.out.println("내 키는 : " + height+ " cm"); 
				
				
			
	}
}
