
package Java9_2;

import java.util.Scanner;

public class Aban extends Score {
	Scanner sc = new Scanner(System.in);
	int his,sci,tot,avg;
	Aban()
	{
		System.out.println("<<��������� ���ϱ�>>");
		while(true)
		{
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
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
			if(select == 3)
			{
				System.out.println("���α׷� ����"); break;
			}
		}
	}
		void input()
		{
			super.input();
			System.out.print("��ȸ : "); his = sc.nextInt();
			System.out.print("���� : "); sci = sc.nextInt();
			
			tot=kor+eng+mat+his+sci; avg=tot/5;
			
		}
		void output()
		{
			System.out.println("���� : " + tot + " / ��� : " + avg);
		}


}

