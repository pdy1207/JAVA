package Java9_3;

import java.util.Scanner;
public class Thread2_Rad_thread2 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int my;
		
		
		System.out.print("�� ���� ���ϱ�(1~6) : ");
		my = sc.nextInt();
		
		int dice = (int)(Math.random()*6+1);
		System.out.println("��ǻ�Ͱ� �������� ���� �� : "+dice);
		
		if(my == dice)
		{
			System.out.println("\n���ڸ� ��Ȯ�� ������ϴ�.\n");
			System.out.println("\n���� ���� �� : "+ my+"/ ��ǻ�� �� "+ dice);
		}
		else 
		{
			System.out.println("\n��Ÿ������ Ʋ�Ƚ��ϴ�!\n");
			System.out.println("\n���� ���� �� : "+ my+"/ ��ǻ�� �� "+ dice);
		}
		
		
	}
}
