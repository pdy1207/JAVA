package Java9_1;

import java.util.Scanner;

public class Study1_Class5 { 

	public static void main(String[] args) { //은행계좌프로그램
		
		Account a = new Account(); 
		
		
	}
}

class Account 
{
	int MAX = 100; //배열 한번에 관리하기 위해서 변수
	String name[]= new String[MAX];
	String acc[]= new String[MAX]; //계좌 / 비밀번호 String
	String pass[] = new String[MAX];
	int mon[] = new int[MAX];
	int count=0;
	Scanner sc = new Scanner(System.in);

	Account()
	{
		while(true)
		{
		System.out.println("1. 계좌생성");
		System.out.println("2. 계좌조회");
		System.out.println("3. 입금하기");
		System.out.println("4. 출금하기");
		System.out.println("5. 전체계좌조회");
		System.out.println("6. 프로그램종료");
		System.out.print("선택 : ");
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
			System.out.println("프로그램 종료"); break;
		}
		
		}
	}

	void input()
	{
		System.out.print("계좌번호 : "); acc[count] = sc.next();
		System.out.print("비밀번호 : "); pass[count] = sc.next();
		System.out.print("이름 : "); name[count] = sc.next();
		System.out.print("잔액 : "); mon[count] = sc.nextInt();
		count++; //한개 추가시 증가 처리 
		
	}
	void output()
	{
		System.out.print("조회하실 계좌번호 : "); String ac = sc.next();
		System.out.print("비밀번호 : "); String pw = sc.next();
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				if(pass[i].equals(pw))
				{
					System.out.println("\n잔액 :" +mon[i]+ "원\n");
				}
			}
			
		}
		
	}
	void selecct()
	{
		System.out.print("계좌번호 : "); String ac = sc.next(); 
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				System.out.print("입금액 : "); int b = sc.nextInt();
				mon[i] +=b; 
				//mon[i] = mon[i]+b; //금액에 누적되게 하기위해서 
				System.out.println("입금된 금액 : " + b + " / 총 계좌 금액 : " + mon[i]);
			}
			
		}
		
	}
	void accCreate()
	{
		System.out.print("계좌번호 : "); String ac = sc.next(); 
		System.out.print("비밀번호 : "); String pw = sc.next();
		for(int i=0; i<count; i++)
		{
			if(acc[i].equals(ac))
			{
				if(pass[i].equals(pw))
				{
				System.out.print("출금액 : "); int c = sc.nextInt();
				mon[i]-=c;
				System.out.println("출금된 금액 : " + c + " / 총 계좌 금액 : " + mon[i]);
				}
			}
			
		}
	}
		void selectall()
		{
			for(int i=0; i<count; i++)
			{
				System.out.println("\n계좌번호 : " + acc[i]);
				System.out.println("/계좌 주 명 : " + name[i]);
				System.out.println("/잔액:" + mon[i]+"원\n");
			}
	}
}
