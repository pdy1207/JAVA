package Java7;

import java.util.Scanner;

public class study2_응용 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int MAX=2;
		 int BAN=2;// 변수 값 선언   
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
		    		for(int ban=0; ban < BAN; ban++) //대 소문자 프로그램이 구별을 인식할수있게
		    		{
				    		for(int i=0; i < MAX; i++) 
				    						{
				    					  System.out.print(ban + 1 + "반" + (i+1) + "번 이름 : " ); name[ ban ][ i ] = sc.next();
				    					  System.out.print(ban + 1 + "반" + (i+1) + "번 전번 : " ); pho[ ban ][ i ] = sc.next();
				    					  System.out.print(ban + 1 + "반" + (i+1) +"번 주소 : " ); add[ ban ][ i ] = sc.next();
				    						}		  
		    		}
		    		
		    	}	//
		    	else if (select == 2) 
		    	{ 
		    		for(int ban=0; ban < BAN; ban++) 
		    			
		    		{
			    		for(int i=0; i < MAX; i++)
			    		{
			    		System.out.println( ban + 1 + "반" + (i+1) +"번" + name[ ban ][ i ] + " / " + pho[ ban ][ i ] + " / " + add[ ban ][ i ] );
			    		}
		    		}
		    	} // 
		    	else if (select == 3) 
		    		{
		    			System.out.print( "검색 이름 : "); 
		    			String search = sc.next();
		    			for(int ban=0; ban < BAN; ban++) 
		    			{
		    			for(int i=0; i < MAX; i++)
		    			{
		    				if(search.equals(name[i])) // 이름 검색 
		    					{
		    						{
		    						System.out.println(i+1+"번"+ name[ i ] +" / "+ pho[ i ] +" / " +  add[ i ] ); 
		    						}
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
			
			static void meau()
			{
				System.out.println("1.정보 입력"); 
		    	System.out.println("2.정보 출력"); 
		    	System.out.println("3.정보 검색"); 
		    	System.out.println("4.종료"); 
		    	System.out.print("선택 : "); 
			}
	
	 }
		 

	