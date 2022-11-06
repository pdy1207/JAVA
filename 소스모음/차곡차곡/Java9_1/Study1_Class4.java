package Java9_1;

import java.util.Scanner;

public class Study1_Class4 { //명함관리 프로그램

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
			System.out.println("1. 친구추가 "); 
			System.out.println("2. 친구전체보기 "); 
			System.out.println("3. 종료 "); 
			System.out.print("선택 : "); 
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
				System.out.println("프로그램 종료"); break;
				
			}
		}
	}	
	
	
void input()
{
	System.out.print("이름 : "); name[count] = sc.next();
	System.out.print("전번 : "); pho[count] = sc.next();
	System.out.print("지역 : "); add[count] = sc.next();
	System.out.print("성별 : "); sex[count] = sc.next();
	System.out.print("나이 : "); age[count] = sc.nextInt();
	count++;
}
void output()
{
	for(int i=0; i<count; i++)
	{
		System.out.println(i+1+" 번 "+name[i]+" / "+pho[i]+" / "+add[i]+" / "+sex[i]+" / "+age[i]);
	}
}
}

