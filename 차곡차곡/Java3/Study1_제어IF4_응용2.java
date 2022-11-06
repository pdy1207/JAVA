package Java3;
import java.util.Scanner;
public class Study1_제어IF4_응용2 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  
		  
		 int tot , a, b, c;
		 //입력을 다 받아야함. 입력하는 갯수만큼 안보이는것들은 다시 입력
		 System.out.print("국어 : ");
		 a = sc.nextInt();
		 System.out.print("영어 : ");
		 b = sc.nextInt();
		 System.out.print("수학 : ");
		 c = sc.nextInt();
		 
		 tot = (a+b+c)/3;
		 
		 if( tot < 101 && tot >= 90)    {System.out.println(" 참잘했어요!! ");}
		 else if (tot < 90 && tot >= 80 ) {System.out.println("우수합니다!! ");}
		 else {System.out.println("힘내세요!");}
		 		 
		  
		  }
	}

                          
            









