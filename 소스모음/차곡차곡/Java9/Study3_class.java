package Java9;

import java.util.Scanner;

public class Study3_class {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int select;
		Fan f = new Fan();
		System.out.println("[[[ ��ǳ�� ���� ����]]]");
		System.out.println("��ǳ�� �� : " + f.name);
		System.out.println("���� : "+ f.power + " / ȸ�� : "+ f.rotate  );
		System.out.println("�ӵ� : " + f.fanspeed  + " / ���� : " + f.headControl  );
		System.out.println("1. �����ѱ�");
		System.out.println("2. ����");
		System.out.print("���� : "); select = sc.nextInt();
		
		if(select == 1) 
		{
			System.out.println("\n��ǳ�� ������ �����ϴ�!\n" );
			 f.power = true;}
		else if(select == 2)
		{
			System.out.println("���α׷� ����."); 
		}
		
		
		while(f.power)
		{	
			System.out.println("[[[ ��ǳ�� ���� ����]]]");
			System.out.println("��ǳ�� �� : " + f.name);
			System.out.println("���� : "+f.power + " / ȸ�� : "+f.rotate  );
			System.out.println("�ӵ� : "+f.fanspeed + " / ���� : "+f.headControl  );
			System.out.println("1. ȸ������");
			System.out.println("2. �ӵ�����");
			System.out.println("3. ��������");
			System.out.println("4. ����"); 
			System.out.print("���� : "); select = sc.nextInt();
			
			if(select == 1) 
			{  System.out.println("��ǳ�� ȸ���� �����ֽ��ϴ�");
			System.out.print("��ǳ�� ȸ���� �ѽðڽ��ϱ�? ( Y , N)");
			String ok = sc.next();
				if (ok.equals("y") | ok.equals("Y"))
				{
					System.out.println("��ǳ�� ȸ���� ���۵Ǿ����ϴ�.");
					f.rotate = true;
				}
				else 
				{
					System.out.println("��ǳ�Ⱑ ȸ���� ���մϴ�.");
				}
				}
			else if(select == 2)
			{
				 System.out.println("���� �ӵ��� �����Դϴ�.");
				 System.out.println(" ǳ�� ���� (0. ���� 1. ��ǳ 2. ��ǳ 3.��ǳ)");
				 int ok = sc.nextInt();
				 if(ok == 0)
				 {
					 System.out.println("��ǳ�Ⱑ �������ϴ�."); f.fanspeed = 0;
				 }
				 else if(ok == 1)
				 {
					 System.out.println("��ǳ �Դϴ�."); f.fanspeed = 1;
				 }
				 else if(ok == 2)
				 {
					 System.out.println("��ǳ �Դϴ�."); f.fanspeed = 2;
					 }
				 else if(ok == 3)
				 {
					 System.out.println("��ǳ �Դϴ�."); f.fanspeed = 3
							 ;
				 }
				 
				 
			}
			else if(select == 3)
			{
				
				System.out.println("���� �Ʒ� �����Դϴ�.");
				System.out.println("��带 �ø��ðڽ��ϱ�? ( Y , N)");
				String ok = sc.next();
				
				if (ok.equals("y") | ok.equals("Y"))
				{
					System.out.println("��ǳ�� ��尡 ���� �ö󰩴ϴ�.");
					f.headControl = true;
				}
				else 
				{
					System.out.println("��� ����");
				}
			}
			else if(select == 4)
			{
				 System.out.println("���α׷� ����"); break;
			}
			
			
			
		}
		
	}

}
class Fan{
	boolean power = false; //����
	boolean rotate = false; //ȸ��
	int fanspeed = 0; //0 ���� 1: ��ǳ 2: ��ǳ 3: ��ǳ 
	boolean headControl = false; //������
	String name = "����̵� ��ǳ��"; // �̸�
	
	
	void power() 
	{
		System.out.println("������ �������ϴ�!");
	}
	void rotate() 
	{ 
		System.out.println("ȸ����� �Դϴ�.");
	}
	void fanspeed() 
	{ 
		System.out.println("���� ��ǳ�Դϴ�");
		
	}
	void headControl() 
	{
		System.out.println("���� ���� ����");	
	}
	void name() {
		System.out.println("�̸��� ���� �Ǿ����ϴ�");
	
	
	}	
}

