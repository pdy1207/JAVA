package Java6;

import java.util.Scanner;

public class study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int a,b,c; //������ ���� ����
		int tot=0, avg=0; //���� ��� 
		while(true)
		{
		System.out.println("1. ���� �Է� "); 
		System.out.println("2.���� ��� "); 
		System.out.println("3. ���� ");
		System.out.print("���� : "); 
		
		select = sc.nextInt();
		if(select == 1) { System.out.print("�������� �Է� : "); a= sc.nextInt(); 
								System.out.print("�������� �Է� : "); b= sc.nextInt(); 
								System.out.print("�������� �Է� : "); c= sc.nextInt(); 
								tot = a + b + c;
								avg = tot/3;	}
    	else if (select == 2) {  System.out.println("���� : "+tot+" / ��� : "+avg); 
    				}
    	else if (select == 3) {
    		System.out.println("���α׷� ����");   	
    		break; }
		
		}
		
	}

}


