package Java9_3;

import java.util.Scanner;
public class Thread2_Rad_thread2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int my;
		
		
		System.out.print("내 숫자 정하기(1~6) : ");
		my = sc.nextInt();
		
		int dice = (int)(Math.random()*6+1);
		System.out.println("컴퓨터가 랜덤으로 나온 수 : "+dice);
		
		if(my == dice)
		{
			System.out.println("\n숫자를 정확히 맞췄습니다.\n");
			System.out.println("\n내가 정한 수 : "+ my+"/ 컴퓨터 수 "+ dice);
		}
		else 
		{
			System.out.println("\n안타깝지만 틀렸습니다!\n");
			System.out.println("\n내가 정한 수 : "+ my+"/ 컴퓨터 수 "+ dice);
		}
		
		
	}
}
