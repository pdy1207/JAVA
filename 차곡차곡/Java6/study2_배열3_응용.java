package Java6;

import java.util.Scanner;

public class study2_�迭3_���� {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int age[ ] = new int [ 5 ];
		for (int i = 0; i < age.length; i++)
		{
			System.out.print( i + 1+"�� �л� ���� : ");
			age[ i ] = sc.nextInt();
		}
		for(int i=0; i < age.length; i++)
		{
			System.out.println( i + 1 +"�� �л� ���̴�" + age[ i ] + "�� �Դϴ�!");
		}
	}

}


