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
	{	System.out.println("<�����α��������α׷�>");
		while(true)
		{
			System.out.println("1.�α��Է�");
			System.out.println("2.�α�����");
			System.out.println("3.����");
			System.out.print("���� : "); int select = sc.nextInt();
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
				System.out.println("���α׷� ����"); break;
			}
		}
	}
	void space()
	{
		System.out.print("����(���� : ��) : "); ingu[0]=sc.nextInt();
		System.out.print("�߱�(���� : ��) : ");ingu[1]=sc.nextInt();
		System.out.print("����(���� : ��) : "); ingu[2]=sc.nextInt();
		System.out.print("������(���� : ��) : "); ingu[3]=sc.nextInt();
		System.out.print("�����(���� : ��) : "); ingu[4]=sc.nextInt();
		
		tot = ingu[0]+ingu[1]+ingu[2]+ingu[3]+ingu[4];
	}
	void to()
	{
		
				System.out.println("����"+ingu[0]+" �� "+" / �߱�"+ingu[1]+" �� "+" / ���� "+ingu[2]+" �� "+ " / ������ "+ingu[3]+" �� " + " / ����� : "+ingu[4]+" �� ");
				
				System.out.println("���� �� �α� : " +tot+"�� ��");
				
			
	}
		
		
}
