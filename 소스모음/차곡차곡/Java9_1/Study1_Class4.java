package Java9_1;

import java.util.Scanner;

public class Study1_Class4 { //���԰��� ���α׷�

	public static void main(String[] args) { 
		Friends F = new Friends();
		
	}
}
class Friends
{
	
	int max = 100;
	String name[] = new String[max];
	String pho[] = new String[max];
	String add[] = new String[max];
	String sex[] = new String[max];
	int age[] = new int[max];
	int count=0;
	//boolean man = true;
	Scanner sc = new Scanner(System.in);
	Friends()
	{
		while(true)
		{
			System.out.println("1. ģ���߰� "); 
			System.out.println("2. ģ����ü���� "); 
			System.out.println("3. ���� "); 
			System.out.print("���� : "); 
			int select = sc.nextInt();
			if(select == 1)
			{
				input();
			}
			else if(select == 2)
			{
				output();
			}
			else if(select == 3)
			{
				System.out.println("���α׷� ����"); break;
				
			}
		}
	}	
	
	
void input()
{
	System.out.print("�̸� : "); name[count] = sc.next();
	System.out.print("���� : "); pho[count] = sc.next();
	System.out.print("���� : "); add[count] = sc.next();
	System.out.print("���� : "); sex[count] = sc.next();
	System.out.print("���� : "); age[count] = sc.nextInt();
	count++;
}
void output()
{
	for(int i=0; i<count; i++)
	{
		System.out.println(i+1+" �� "+name[i]+" / "+pho[i]+" / "+add[i]+" / "+sex[i]+" / "+age[i]);
	}
}
}

