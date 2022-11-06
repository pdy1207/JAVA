package Java3;

import java.util.Scanner;

public class Study1_제어IF {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);   //if ~ else 활용 제어문
		  
		  int age;
		  
		  System.out.print("나이를 입력 : ");
		  age = sc.nextInt();
		  
		  if (age >= 18 )
		  {
			  System.out.println("성인입니다!");
		  }
		  else 
		  {
			  System.out.println("청소년입니다!");
			  	  }
		  
		}
}
                          










