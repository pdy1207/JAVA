package Java6;

import java.util.Scanner;

public class study2_�迭3_����3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String name="", add="",pho="";		// �߿�
		  //�ֹι�ȣ ���� string
		 int select;
		 
		 while(true)
		    {
		    	System.out.println("1.���� �Է�"); 
		    	System.out.println("2.���� ���"); 
		    	System.out.println("3.���� �˻�"); 
		    	System.out.println("4.����"); 
		    	System.out.print("���� : "); 
		    	
		    	select = sc.nextInt(); 
		    	
		    	if(select == 1) { 
		    					  System.out.print("�̸� : " ); name = sc.next();
		    					  System.out.print("���� : " ); pho = sc.next();
		    					  System.out.print("�ּ� : " ); add = sc.next();
		    	}
		    	else if (select == 2) { 
		    		System.out.println( "�̸� : " + name + " ���� : " + pho + " �ּ� : " + add );
		    	}
		    	else if (select == 3) {
		    		
		    	}
		    	else if (select == 4) {
		    		System.out.println("���α׷� ����");	break;
		    	}
		    	else { 
		    		System.out.println("1~4�� �Է����ּ���!");
		    	}
		    		
		    }
		 }
		 
	}
	



