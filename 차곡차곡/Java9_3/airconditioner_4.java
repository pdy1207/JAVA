package Java9_3;

import java.util.Scanner;

public class airconditioner_4 {

	public static void main(String[]args) {
			Air a = new Air();
			a.start();
	}
	
}
class Air extends Thread
{
	int com=30; //현재 온도 
				//변수 선언은 밖에서 while 안에서 하면 자꾸 돌기때문에
	Scanner sc = new Scanner(System.in);
	int select;
	int ssss=28;

	public void run()
	{
		while(true)
			{

					System.out.println("[현재온도 : "+com+"도"+ " / 설정온도 : "+ssss+"도"+"]");
					System.out.println("1.에어컨 가동");
					System.out.println("2.온도 설정");
					System.out.println("3.종료");
					System.out.print("선택 : "); select = sc.nextInt();
						if(select == 1)
							{	
								System.out.println("에어컨이 가동됩니다.");
								input();
							}
						else if(select == 2)
							{
								System.out.println("[현재 설정 온도 "+com+" 도 ]" );
								System.out.print("설정온도를 입력하세요 : " ); ssss=sc.nextInt();
							}
						else if(select == 3)
							{
								System.out.println("프로그램 종료"); break; 
							}
			
			}
	}
	
	
	void input()
	{
		while(com>=ssss)
		{
			
		int co = (int)(Math.random()*2);
			try {
				com=com-co;//0~1랜덤으로 나온수 누적
				System.out.println("[현재 온도 : " + com + " 도 "+" / 설정온도 : "+ssss+" 도 ]");
				Thread.sleep(250);
				} catch (InterruptedException e) {}
					if(com==ssss)
					{
						System.out.println("설정온도 입니다."); break;
					}
			
		}
	}
	
}






































