package Java9_1;

import java.util.Scanner;

public class Study1_Class2 {

	public static void main(String[] args) { //Ŭ���� ���������� ������ ����ϰ� �������� 
		Score s = new Score();
		
	}
}
class Score //���� ���� 
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
    	
    	System.out.println("1.�����Է�"); 
    	System.out.println("2.�������"); 
    	System.out.println("3.����"); 
    	System.out.print("���� : "); 
    
    	int select = sc.nextInt(); 
    	if(select == 1)
    	{
    		
    		input();
    		
    	}
    	
    	else if(select == 2)
    	{
    		output();
    	}
    	else if(select == 3) {System.out.println( "���α׷� ����"); break;}
    	
    }
	
	}
	void input()
	{
		
		System.out.print("���� : " ); kor = sc.nextInt();
		  System.out.print("���� : " ); eng = sc.nextInt(); 
		  System.out.print("���� : " ); met = sc.nextInt();
		  tot = kor+eng+met; avg=tot/3; 
	}
	void output()
	{
		System.out.println(  "���� :" + tot + "���" + avg );
	}
}