package Java5;

import java.util.Scanner;

public class Study1_while6 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int select;
	    while(true)
	    {
	    	System.out.println("1.������ ���");
	    	System.out.println("2.��ǥ ���");
	    	System.out.println("3.����");
	    	System.out.print("���� : ");
	    	
	    	select = sc.nextInt();
	    	if(select == 1) 
	    	{
	    		for(int a=2 ; a < 10 ; a++ )
	  		  {
	  			  for(int u=1 ; u < 10 ; u++ )
	  			  {
	  				  System.out.println(a+"    X    "+u+"  =   "+a*u);
	  			  }
	  			  
	  			 
	  		  }
	    		}
	    	else if (select == 2) {for(int i=0 ; i < 5 ; i++)
			{
				for(int j=0 ; j <= i ; j++)
				{
					System.out.print("*");
					
				}
				System.out.println();
			}
	    		}
	    	else if (select == 3) {System.out.println("���α׷� ����");   	break; }
	    }
	}
}
	    	
	    	
	    
	    
	

	


	    
	    
	    



	
	

		
			
	


