
package Java9_2;

import java.util.Scanner;

public class Bban extends Score {
	Scanner sc = new Scanner(System.in);
	int mus,art,tot,avg;
	Bban()
	{
		System.out.println("<<국영수음미 구하기>>");
		while(true)
		{
			System.out.println("1. 점수입력");
			System.out.println("2. 점수출력");
			System.out.println("3. 종료");
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
			if(select == 3)
			{
				System.out.println("프로그램 종료"); break;
			}
		}
	}
		void input()
		{
			super.input();
			System.out.print("음악 : "); mus = sc.nextInt();
			System.out.print("미술 : "); art = sc.nextInt();
			tot=kor+eng+mat+mus+art; avg=tot/5;
			
		}
		void output()
		{
			System.out.println("총점 : " + tot + " / 평균 : " + avg);
		}


}
