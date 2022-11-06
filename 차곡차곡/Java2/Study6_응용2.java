package Java2;

import java.util.Scanner;

public class Study6_응용2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);//입력
		  
		  int apl, //사과박스당 갯수
		  box, //사과박스갯수
		  pri, //사과가격
		  tot, //사과 총갯수
		  sell; //판매된 갯수
		  
		  System.out.print("사과박스당갯수 : "); apl = sc.nextInt();
		  System.out.print("사과박스갯수 : "); box = sc.nextInt();
		  System.out.print("사과가격 : "); pri = sc.nextInt();
		  tot = apl * box ; 	//총갯수 계산
 		  System.out.println("총갯수 : " + tot +"개" + " / 총가격은 : " + (pri*tot) + "원");
 		  
 		 System.out.println("판매된사과갯수 :  "); sell = sc.nextInt();
 		  sell = tot - sell;
 		 
 		 
 		    
 		 System.out.println("남은갯수 : " +sell +  "개"+ " / 판매금액 : " +(sell * pri)+ "원");
			
	}
}
                          //남은건 변수를 넣어야하며, 총갯수 는 박스 갯수와 박스당갯수 , 남은갯수 변수를 넣고 총갯수 빼야하고
                          //총가격과 판매금액 기본 사과가격에 총갯수 곱하고 판매는 기본가격에 판매된 사과갯수 곱하면 된다.




                                
                                










