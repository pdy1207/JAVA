package Java9_1;

import java.util.Scanner;

public class Study1_Class3 {

	public static void main(String[] args) { 
		Calc c = new Calc();
		
	}
}
class Calc
{
	int su1, su2, result; //ù��° ��, �ι�°��, ��� ����뺯��
	String yon; //�������Էº���
	Scanner sc = new Scanner(System.in);
	Calc(){
		while(true)
		{
			System.out.println("1. ����ϱ�");
			System.out.println("2. ����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			if(select == 1)
			{
				System.out.print("ù��° �� :"); su1 = sc.nextInt();
				System.out.print("������(+,-,*,/) : "); yon = sc.next();
				System.out.print("�ι�° �� : "); su2 = sc.nextInt();
				if(yon.equals("+"))
				{
					add(su1,su2);
				}
				else if(yon.equals("-"))
					
				{
					min(su1,su2);
				}
				else if(yon.equals("*"))//String ���� yon���� ���Ͽ���
									//�޾Ƽ� yon String�̴�  equals ���ڿ��� ������ equals�� ���
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
				System.out.println("���α׷� ����!"); break;
			}
		}
	}

		void add(int su1, int su2) 
		{ 	result = su1 + su2;
			System.out.println("��� : "+(su1+su2));
		}
		void min(int su1 ,int su2) 
		{	result = su1 - su2;
			System.out.println("��� : "+(su1-su2));
		}
		void mul(int su1, int su2) 
		{	result = su1 * su2;
			System.out.println("��� : "+(su1*su2));
		}
		void div(int su1, int su2) 
		{	result = su1 / su2;
			System.out.println("��� : "+(su1/su2));
		} //�޼���� ��� 
}




