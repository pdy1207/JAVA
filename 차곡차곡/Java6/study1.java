package Java6;

import java.util.Scanner;

public class study1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select;
		int a,b,c; //국영수 점수 변수
		int tot=0, avg=0; //총점 평균 
		while(true)
		{
		System.out.println("1. 점수 입력 "); 
		System.out.println("2.점수 출력 "); 
		System.out.println("3. 종료 ");
		System.out.print("선택 : "); 
		
		select = sc.nextInt();
		if(select == 1) { System.out.print("국어점수 입력 : "); a= sc.nextInt(); 
								System.out.print("수학점수 입력 : "); b= sc.nextInt(); 
								System.out.print("영어점수 입력 : "); c= sc.nextInt(); 
								tot = a + b + c;
								avg = tot/3;	}
    	else if (select == 2) {  System.out.println("총점 : "+tot+" / 평균 : "+avg); 
    				}
    	else if (select == 3) {
    		System.out.println("프로그램 종료");   	
    		break; }
		
		}
		
	}

}


