package Java7;

import java.util.Scanner;

public class study2_���� {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int MAX=2;
		 int BAN=2;// ���� �� ����   
		 String name [ ][ ] = new String [BAN][MAX];
		 String pho [ ][ ] = new String [BAN][MAX];
		 String add [ ][ ] = new String [BAN][MAX];
		 int select;
		 while(true)    
		 {
		    	meau();
		    	select = sc.nextInt(); 
		    	
		    	if(select == 1) 
		    	{ 
		    		for(int ban=0; ban < BAN; ban++) //�� �ҹ��� ���α׷��� ������ �ν��Ҽ��ְ�
		    		{
				    		for(int i=0; i < MAX; i++) 
				    						{
				    					  System.out.print(ban + 1 + "��" + (i+1) + "�� �̸� : " ); name[ ban ][ i ] = sc.next();
				    					  System.out.print(ban + 1 + "��" + (i+1) + "�� ���� : " ); pho[ ban ][ i ] = sc.next();
				    					  System.out.print(ban + 1 + "��" + (i+1) +"�� �ּ� : " ); add[ ban ][ i ] = sc.next();
				    						}		  
		    		}
		    		
		    	}	//
		    	else if (select == 2) 
		    	{ 
		    		for(int ban=0; ban < BAN; ban++) 
		    			
		    		{
			    		for(int i=0; i < MAX; i++)
			    		{
			    		System.out.println( ban + 1 + "��" + (i+1) +"��" + name[ ban ][ i ] + " / " + pho[ ban ][ i ] + " / " + add[ ban ][ i ] );
			    		}
		    		}
		    	} // 
		    	else if (select == 3) 
		    		{
		    			System.out.print( "�˻� �̸� : "); 
		    			String search = sc.next();
		    			for(int ban=0; ban < BAN; ban++) 
		    			{
		    			for(int i=0; i < MAX; i++)
		    			{
		    				if(search.equals(name[i])) // �̸� �˻� 
		    					{
		    						{
		    						System.out.println(i+1+"��"+ name[ i ] +" / "+ pho[ i ] +" / " +  add[ i ] ); 
		    						}
		    					}
		    		    }
		    			
		    	}
		    		}
		    	else if (select == 4) 
		    	{
		    		System.out.println("���α׷� ����");	break;
		    	}
		    	else 
		    	{ 
		    		System.out.println("1~4�� �Է����ּ���!"); 
		    	}
		    		
			 }
		 }
			
			static void meau()
			{
				System.out.println("1.���� �Է�"); 
		    	System.out.println("2.���� ���"); 
		    	System.out.println("3.���� �˻�"); 
		    	System.out.println("4.����"); 
		    	System.out.print("���� : "); 
			}
	
	 }
		 

	