package Java9_3;

import java.util.Scanner;

public class Thread2_Rad_thread3 {

	public static void main(String[]args) {
		AAA a = new AAA();
		
		a.start();
		
	
	}
	
}
class AAA extends Thread{
Scanner sc = new Scanner(System.in);
	public void run() {
		int count=0;
		int dice = sc.nextInt();
		System.out.print("내 숫자 정하기(1~6) : "+dice);
		
		while(true)
		{	
			int my = (int)(Math.random()*6+1);
			
			try {
				Thread.sleep(1000);
				System.out.println(count+"회시도!!!"+"컴퓨터 수 : "+my);
				
			} catch (InterruptedException e) {}
			
//	
//			int my = (int)(Math.random()*6+1);
//			try {
//				sleep(500);
//				System.out.println(count+"회시도!!!"+"컴퓨터 수 : "+my);
//			} catch (InterruptedException e) {}
			if(dice == my)
			{
				System.out.println("\n숫자 맞춤\n"); break;
			}
			else
			{
				System.out.println("\n틀림\n"); 
			}
		count++;
		
		}
		
	}
}







































