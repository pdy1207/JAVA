package Java3;

import java.util.Scanner;

public class Study1_제어IF3_범위 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);   //if ~ else 활용 제어문
		  
		  int score;
		  System.out.print("1~100점사이의 수입력 : ");
		  score = sc.nextInt();
		  if(score >= 100 )                                   { System.out.println("만점입니다!"); }
		  else if (score < 100 && score >= 90) { System.out.println("90점이상 100점미만"); }
		  else if (score < 90 && score >= 80)  { System.out.println("80점이상 90점미만"); }
		  else if (score < 80 && score >= 70)  { System.out.println("70점이상 80미만"); }
		  else                                                     { System.out.println("70점 미만 과락입니다"); }
		 
		  
		  }
	}

                          
            









