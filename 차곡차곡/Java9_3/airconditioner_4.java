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
	int com=30; //���� �µ� 
				//���� ������ �ۿ��� while �ȿ��� �ϸ� �ڲ� ���⶧����
	Scanner sc = new Scanner(System.in);
	int select;
	int ssss=28;

	public void run()
	{
		while(true)
			{

					System.out.println("[����µ� : "+com+"��"+ " / �����µ� : "+ssss+"��"+"]");
					System.out.println("1.������ ����");
					System.out.println("2.�µ� ����");
					System.out.println("3.����");
					System.out.print("���� : "); select = sc.nextInt();
						if(select == 1)
							{	
								System.out.println("�������� �����˴ϴ�.");
								input();
							}
						else if(select == 2)
							{
								System.out.println("[���� ���� �µ� "+com+" �� ]" );
								System.out.print("�����µ��� �Է��ϼ��� : " ); ssss=sc.nextInt();
							}
						else if(select == 3)
							{
								System.out.println("���α׷� ����"); break; 
							}
			
			}
	}
	
	
	void input()
	{
		while(com>=ssss)
		{
			
		int co = (int)(Math.random()*2);
			try {
				com=com-co;//0~1�������� ���¼� ����
				System.out.println("[���� �µ� : " + com + " �� "+" / �����µ� : "+ssss+" �� ]");
				Thread.sleep(250);
				} catch (InterruptedException e) {}
					if(com==ssss)
					{
						System.out.println("�����µ� �Դϴ�."); break;
					}
			
		}
	}
	
}






































