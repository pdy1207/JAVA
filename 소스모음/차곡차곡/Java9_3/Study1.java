package Java9_3;

import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
			Daejeon d = new Daejeon();

	}

}
class Daejeon
{
	Scanner sc = new Scanner(System.in);
	
	int ingu[] = new int[5];
	int tot;
	
	Daejeon()
	{	System.out.println("<대전인구조사프로그램>");
		while(true)
		{
			System.out.println("1.인구입력");
			System.out.println("2.인구보기");
			System.out.println("3.종료");
			System.out.print("선택 : "); int select = sc.nextInt();
			if(select == 1)
				
			{
				space();
			}
			else if(select == 2)
			{
				to();
			}
			else if(select == 3)
			{
				System.out.println("프로그램 종료"); break;
			}
		}
	}
	void space()
	{
		System.out.print("서구(단위 : 만) : "); ingu[0]=sc.nextInt();
		System.out.print("중구(단위 : 만) : ");ingu[1]=sc.nextInt();
		System.out.print("동구(단위 : 만) : "); ingu[2]=sc.nextInt();
		System.out.print("유성구(단위 : 만) : "); ingu[3]=sc.nextInt();
		System.out.print("대덕구(단위 : 만) : "); ingu[4]=sc.nextInt();
		
		tot = ingu[0]+ingu[1]+ingu[2]+ingu[3]+ingu[4];
	}
	void to()
	{
		
				System.out.println("서구"+ingu[0]+" 만 "+" / 중구"+ingu[1]+" 만 "+" / 동구 "+ingu[2]+" 만 "+ " / 유성구 "+ingu[3]+" 만 " + " / 대덕구 : "+ingu[4]+" 만 ");
				
				System.out.println("대전 총 인구 : " +tot+"만 명");
				
			
	}
		
		
}
