package Java6;

import java.util.Scanner;

public class study2_배열3_응용4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int max=3; // 변수 값 선언   
		 String name [ ] = new String [max];
		 String pho [ ] = new String [max];
		 String add [ ] = new String [max];
		 int select;
		 while(true)
		    {
			 {
		    	System.out.println("1.정보 입력"); 
		    	System.out.println("2.정보 출력"); 
		    	System.out.println("3.정보 검색"); 
		    	System.out.println("4.종료"); 
		    	System.out.print("선택 : "); 
		    	
		    	select = sc.nextInt(); 
		    	
		    	if(select == 1) { 
		    		for(int i=0; i < name.length; i++) 
		    						{
		    					  System.out.print(i + 1+  "번 이름 : " ); name [ i ] = sc.next();
		    					  System.out.print(i + 1+ "번 전번 : " ); pho[ i ] = sc.next();
		    					  System.out.print(i + 1+ "번 주소 : " ); add[ i ] = sc.next();
		    						}		  
		    	} //
		    	else if (select == 2) 
		    	{ 
		    		for(int i=0; i < name.length; i++)
		    		{
		    		System.out.println( i + 1 +"번"+" 이름 : " + name[ i ] + " / 전번 : " + pho[ i ] + " / 주소 : " + add[ i ] );
		    		}
		    	} // 
		    	else if (select == 3) 
		    		{
		    			System.out.print( "검색 이름 : "); 
		    			String search = sc.next();
		    			for(int i=0; i < name.length; i++)
		    			{
		    				if(search.equals(name[i])) // 이름 검색 
		    					{
		    						{
		    						System.out.println(i+1+"번"+ name[ i ] +" / "+ pho[ i ] +" / " +  add[ i ] ); 
		    						}
		    					}
		    		    }
		    			
		    	}
		    	else if (select == 4) 
		    	{
		    		System.out.println("프로그램 종료");	break;
		    	}
		    	else 
		    	{ 
		    		System.out.println("1~4만 입력해주세요!"); 
		    	}
		    		
			 }
		    }
	 }
		 
}
	



