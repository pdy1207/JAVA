package Java9_1;

import java.util.Scanner;

public class Study1_Class5 { 

	public static void main(String[] args) { //����������α׷�
		
		Account a = new Account(); 
		
		
	}
}

class Account 
{
	int MAX = 100; //�迭 �ѹ��� �����ϱ� ���ؼ� ����
	String name[]= new String[MAX];
	String acc[]= new String[MAX]; //���� / ��й�ȣ String
	String pass[] = new String[MAX];
	int mon[] = new int[MAX];
	int count=0;
	Scanner sc = new Scanner(System.in);

	Account()
	{
		while(true)
		{
		System.out.println("1. ���»���");
		System.out.println("2. ������ȸ");
		System.out.println("3. �Ա��ϱ�");
		System.out.println("4. ����ϱ�");
		System.out.println("5. ��ü������ȸ");
		System.out.println("6. ���α׷�����");
		System.out.print("���� : ");
		int select = sc.nextInt();
		if(select == 1 )
		{
			input();
		}
		else if(select == 2 )
		{
			output();
		}
		else if(select == 3 )
		{
			 selecct();
		}
		else if(select == 4 )
		{
			accCreate();
		}
		else if(select == 5 )
		{
			selectall();
		}
		else if(select == 6 )
		{
			System.out.println("���α׷� ����"); break;
		}
		
		}
	}

	void input()
	{
		System.out.print("���¹�ȣ : "); acc[count] = sc.next();
		System.out.print("��й�ȣ : "); pass[count] = sc.next();
		System.out.print("�̸� : "); name[count] = sc.next();
		System.out.print("�ܾ� : "); mon[count] = sc.nextInt();
		count++; //�Ѱ� �߰��� ���� ó�� 
		
	}
	void output()
	{
		System.out.print("��ȸ�Ͻ� ���¹�ȣ : "); String ac = sc.next();
		System.out.print("��й�ȣ : "); String pw = sc.next();
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				if(pass[i].equals(pw))
				{
					System.out.println("\n�ܾ� :" +mon[i]+ "��\n");
				}
			}
			
		}
		
	}
	void selecct()
	{
		System.out.print("���¹�ȣ : "); String ac = sc.next(); 
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				System.out.print("�Աݾ� : "); int b = sc.nextInt();
				mon[i] +=b; 
				//mon[i] = mon[i]+b; //�ݾ׿� �����ǰ� �ϱ����ؼ� 
				System.out.println("�Աݵ� �ݾ� : " + b + " / �� ���� �ݾ� : " + mon[i]);
			}
			
		}
		
	}
	void accCreate()
	{
		System.out.print("���¹�ȣ : "); String ac = sc.next(); 
		System.out.print("��й�ȣ : "); String pw = sc.next();
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				if(pass[i].equals(pw))
				{
				System.out.print("��ݾ� : "); int c = sc.nextInt();
				mon[i]-=c;
				System.out.println("��ݵ� �ݾ� : " + c + " / �� ���� �ݾ� : " + mon[i]);
				}
			}
			
		}
	}
		void selectall()
		{
			for(int i=0; i<count; i++)
			{
				System.out.println("\n���¹�ȣ : " + acc[i]);
				System.out.println("/���� �� �� : " + name[i]);
				System.out.println("/�ܾ�:" + mon[i]+"��\n");
			}
	}
}
