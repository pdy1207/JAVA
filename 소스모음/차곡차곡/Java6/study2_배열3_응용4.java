package Java6;

import java.util.Scanner;

public class study2_�迭3_����4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int max=3; // ���� �� ����   
		 String name [ ] = new String [max];
		 String pho [ ] = new String [max];
		 String add [ ] = new String [max];
		 int select;
		 while(true)
		    {
			 {
		    	System.out.println("1.���� �Է�"); 
		    	System.out.println("2.���� ���"); 
		    	System.out.println("3.���� �˻�"); 
		    	System.out.println("4.����"); 
		    	System.out.print("���� : "); 
		    	
		    	select = sc.nextInt(); 
		    	
		    	if(select == 1) { 
		    		for(int i=0; i < name.length; i++) 
		    						{
		    					  System.out.print(i + 1+  "�� �̸� : " ); name [ i ] = sc.next();
		    					  System.out.print(i + 1+ "�� ���� : " ); pho[ i ] = sc.next();
		    					  System.out.print(i + 1+ "�� �ּ� : " ); add[ i ] = sc.next();
		    						}		  
		    	} //
		    	else if (select == 2) 
		    	{ 
		    		for(int i=0; i < name.length; i++)
		    		{
		    		System.out.println( i + 1 +"��"+" �̸� : " + name[ i ] + " / ���� : " + pho[ i ] + " / �ּ� : " + add[ i ] );
		    		}
		    	} // 
		    	else if (select == 3) 
		    		{
		    			System.out.print( "�˻� �̸� : "); 
		    			String search = sc.next();
		    			for(int i=0; i < name.length; i++)
		    			{
		    				if(search.equals(name[i])) // �̸� �˻� 
		    					{
		    						{
		    						System.out.println(i+1+"��"+ name[ i ] +" / "+ pho[ i ] +" / " +  add[ i ] ); 
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
	 }
		 
}
	



