package Java2;

import java.util.Scanner;

public class Study6_����2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);//�Է�
		  
		  int apl, //����ڽ��� ����
		  box, //����ڽ�����
		  pri, //�������
		  tot, //��� �Ѱ���
		  sell; //�Ǹŵ� ����
		  
		  System.out.print("����ڽ��簹�� : "); apl = sc.nextInt();
		  System.out.print("����ڽ����� : "); box = sc.nextInt();
		  System.out.print("������� : "); pri = sc.nextInt();
		  tot = apl * box ; 	//�Ѱ��� ���
 		  System.out.println("�Ѱ��� : " + tot +"��" + " / �Ѱ����� : " + (pri*tot) + "��");
 		  
 		 System.out.println("�ǸŵȻ������ :  "); sell = sc.nextInt();
 		  sell = tot - sell;
 		 
 		 
 		    
 		 System.out.println("�������� : " +sell +  "��"+ " / �Ǹűݾ� : " +(sell * pri)+ "��");
			
	}
}
                          //������ ������ �־���ϸ�, �Ѱ��� �� �ڽ� ������ �ڽ��簹�� , �������� ������ �ְ� �Ѱ��� �����ϰ�
                          //�Ѱ��ݰ� �Ǹűݾ� �⺻ ������ݿ� �Ѱ��� ���ϰ� �ǸŴ� �⺻���ݿ� �Ǹŵ� ������� ���ϸ� �ȴ�.




                                
                                










