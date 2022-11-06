package Java6;

import java.util.Scanner;

public class study2_배열3_응용3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String name="", add="",pho="";		// 중요
		  //주민번호 전번 string
		 int select;
		 
		 while(true)
		    {
		    	System.out.println("1.정보 입력"); 
		    	System.out.println("2.정보 출력"); 
		    	System.out.println("3.정보 검색"); 
		    	System.out.println("4.종료"); 
		    	System.out.print("선택 : "); 
		    	
		    	select = sc.nextInt(); 
		    	
		    	if(select == 1) { 
		    					  System.out.print("이름 : " ); name = sc.next();
		    					  System.out.print("전번 : " ); pho = sc.next();
		    					  System.out.print("주소 : " ); add = sc.next();
		    	}
		    	else if (select == 2) { 
		    		System.out.println( "이름 : " + name + " 전번 : " + pho + " 주소 : " + add );
		    	}
		    	else if (select == 3) {
		    		
		    	}
		    	else if (select == 4) {
		    		System.out.println("프로그램 종료");	break;
		    	}
		    	else { 
		    		System.out.println("1~4만 입력해주세요!");
		    	}
		    		
		    }
		 }
		 
	}
	



