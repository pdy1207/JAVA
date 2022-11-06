package Java3;
import java.util.Scanner;
public class Study1_제어Switch2_응용 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  
		  
		  String grade;
		  System.out.print("학점을 입력하시오 : ");
		  grade = sc.next();
		  
		    switch(grade)
		  {
		  case "A" :  System.out.println("90이상~100점입니다.");break;
		  case "B" :  System.out.println("80점~90점미만입니다.");break;
		  case "C" :  System.out.println("70점~80점미만입니다.");break;
		  case "F" : System.out.println("70점미만입니다."); break; 
		  }	  
		      }	  
		  }
	

                          
            









