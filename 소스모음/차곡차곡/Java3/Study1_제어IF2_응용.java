package Java3;

import java.util.Scanner;

public class Study1_제어IF2_응용 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);   //if ~ else 활용 제어문
		  
		  int grade;
		  System.out.print("중학생년을 입력하세요 : ");
		  grade = sc.nextInt();
		  if(grade == 1) { System.out.println("1학년입니다!");		}
		  else if(grade == 2) { System.out.println("2학년입니다!");		}
		  else if (grade == 3) { System.out.println("3학년입니다!");		}
		  else { System.out.println("1~3만 입력해주세요!");		}
	}
}
                          
            









