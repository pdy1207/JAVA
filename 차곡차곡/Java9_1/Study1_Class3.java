package Java9_1;

import java.util.Scanner;

public class Study1_Class3 {

	public static void main(String[] args) { 
		Calc c = new Calc();
		
	}
}
class Calc
{
	int su1, su2, result; //첫번째 수, 두번째수, 결과 저장용변수
	String yon; //연산자입력변수
	Scanner sc = new Scanner(System.in);
	Calc(){
		while(true)
		{
			System.out.println("1. 계산하기");
			System.out.println("2. 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			if(select == 1)
			{
				System.out.print("첫번째 수 :"); su1 = sc.nextInt();
				System.out.print("연산자(+,-,*,/) : "); yon = sc.next();
				System.out.print("두번째 수 : "); su2 = sc.nextInt();
				if(yon.equals("+"))
				{
					add(su1,su2);
				}
				else if(yon.equals("-"))
					
				{
					min(su1,su2);
				}
				else if(yon.equals("*"))//String 으로 yon변수 정하여서
									//받아서 yon String이니  equals 문자열로 받으니 equals로 사용
				{
					mul(su1,su2);
				}
				else if(yon.equals("/"))
				{
					div(su1,su2);
				}
			}
			else if(select == 2)
			{
				System.out.println("프로그램 종료!"); break;
			}
		}
	}

		void add(int su1, int su2) 
		{ 	result = su1 + su2;
			System.out.println("결과 : "+(su1+su2));
		}
		void min(int su1 ,int su2) 
		{	result = su1 - su2;
			System.out.println("결과 : "+(su1-su2));
		}
		void mul(int su1, int su2) 
		{	result = su1 * su2;
			System.out.println("결과 : "+(su1*su2));
		}
		void div(int su1, int su2) 
		{	result = su1 / su2;
			System.out.println("결과 : "+(su1/su2));
		} //메서드는 기능 
}




