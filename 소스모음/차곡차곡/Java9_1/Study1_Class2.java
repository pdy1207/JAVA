package Java9_1;

import java.util.Scanner;

public class Study1_Class2 {

	public static void main(String[] args) { //클래스 쓰는이유가 메인을 깔끔하게 쓰는이유 
		Score s = new Score();
		
	}
}
class Score //연산 변경 
{
	int kor;
	int eng;
	int met;
	int tot;
	int avg;
	Scanner sc = new Scanner(System.in);
	Score(){
	while(true)
    {
    	
    	System.out.println("1.점수입력"); 
    	System.out.println("2.점수출력"); 
    	System.out.println("3.종료"); 
    	System.out.print("선택 : "); 
    
    	int select = sc.nextInt(); 
    	if(select == 1)
    	{
    		
    		input();
    		
    	}
    	
    	else if(select == 2)
    	{
    		output();
    	}
    	else if(select == 3) {System.out.println( "프로그램 종료"); break;}
    	
    }
	
	}
	void input()
	{
		
		System.out.print("국어 : " ); kor = sc.nextInt();
		  System.out.print("영어 : " ); eng = sc.nextInt(); 
		  System.out.print("수학 : " ); met = sc.nextInt();
		  tot = kor+eng+met; avg=tot/3; 
	}
	void output()
	{
		System.out.println(  "총점 :" + tot + "평균" + avg );
	}
}