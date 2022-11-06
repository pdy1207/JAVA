package Java9;

import java.util.Scanner;

public class Study3_class {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int select;
		Fan f = new Fan();
		System.out.println("[[[ 선풍기 상태 정보]]]");
		System.out.println("선풍기 명 : " + f.name);
		System.out.println("전원 : "+ f.power + " / 회전 : "+ f.rotate  );
		System.out.println("속도 : " + f.fanspeed  + " / 높이 : " + f.headControl  );
		System.out.println("1. 전원켜기");
		System.out.println("2. 종료");
		System.out.print("선택 : "); select = sc.nextInt();
		
		if(select == 1) 
		{
			System.out.println("\n선풍기 전원이 들어갔습니다!\n" );
			 f.power = true;}
		else if(select == 2)
		{
			System.out.println("프로그램 종료."); 
		}
		
		
		while(f.power)
		{	
			System.out.println("[[[ 선풍기 상태 정보]]]");
			System.out.println("선풍기 명 : " + f.name);
			System.out.println("전원 : "+f.power + " / 회전 : "+f.rotate  );
			System.out.println("속도 : "+f.fanspeed + " / 높이 : "+f.headControl  );
			System.out.println("1. 회전설정");
			System.out.println("2. 속도조정");
			System.out.println("3. 높이조정");
			System.out.println("4. 종료"); 
			System.out.print("선택 : "); select = sc.nextInt();
			
			if(select == 1) 
			{  System.out.println("선풍기 회전이 꺼져있습니다");
			System.out.print("선풍기 회전이 켜시겠습니까? ( Y , N)");
			String ok = sc.next();
				if (ok.equals("y") | ok.equals("Y"))
				{
					System.out.println("선풍기 회전이 시작되었습니다.");
					f.rotate = true;
				}
				else 
				{
					System.out.println("선풍기가 회전을 안합니다.");
				}
				}
			else if(select == 2)
			{
				 System.out.println("현재 속도가 꺼짐입니다.");
				 System.out.println(" 풍속 설정 (0. 꺼짐 1. 약풍 2. 중풍 3.강풍)");
				 int ok = sc.nextInt();
				 if(ok == 0)
				 {
					 System.out.println("선풍기가 꺼졌습니다."); f.fanspeed = 0;
				 }
				 else if(ok == 1)
				 {
					 System.out.println("약풍 입니다."); f.fanspeed = 1;
				 }
				 else if(ok == 2)
				 {
					 System.out.println("중풍 입니다."); f.fanspeed = 2;
					 }
				 else if(ok == 3)
				 {
					 System.out.println("강풍 입니다."); f.fanspeed = 3
							 ;
				 }
				 
				 
			}
			else if(select == 3)
			{
				
				System.out.println("현재 아래 고정입니다.");
				System.out.println("헤드를 올리시겠습니까? ( Y , N)");
				String ok = sc.next();
				
				if (ok.equals("y") | ok.equals("Y"))
				{
					System.out.println("선풍기 헤드가 위로 올라갑니다.");
					f.headControl = true;
				}
				else 
				{
					System.out.println("헤드 고정");
				}
			}
			else if(select == 4)
			{
				 System.out.println("프로그램 종료"); break;
			}
			
			
			
		}
		
	}

}
class Fan{
	boolean power = false; //전원
	boolean rotate = false; //회전
	int fanspeed = 0; //0 꺼짐 1: 약풍 2: 중풍 3: 강풍 
	boolean headControl = false; //높낮이
	String name = "토네이도 선풍기"; // 이름
	
	
	void power() 
	{
		System.out.println("전원이 켜졌습니다!");
	}
	void rotate() 
	{ 
		System.out.println("회전모드 입니다.");
	}
	void fanspeed() 
	{ 
		System.out.println("현재 미풍입니다");
		
	}
	void headControl() 
	{
		System.out.println("높이 조절 변경");	
	}
	void name() {
		System.out.println("이름이 변경 되었습니다");
	
	
	}	
}

