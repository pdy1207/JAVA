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
		System.out.print("�� ���� ���ϱ�(1~6) : "+dice);
		
		while(true)
		{	
			int my = (int)(Math.random()*6+1);
			
			try {
				Thread.sleep(1000);
				System.out.println(count+"ȸ�õ�!!!"+"��ǻ�� �� : "+my);
				
			} catch (InterruptedException e) {}
			
//	
//			int my = (int)(Math.random()*6+1);
//			try {
//				sleep(500);
//				System.out.println(count+"ȸ�õ�!!!"+"��ǻ�� �� : "+my);
//			} catch (InterruptedException e) {}
			if(dice == my)
			{
				System.out.println("\n���� ����\n"); break;
			}
			else
			{
				System.out.println("\nƲ��\n"); 
			}
		count++;
		
		}
		
	}
}







































