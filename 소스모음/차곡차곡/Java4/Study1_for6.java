package Java4;
import java.util.Scanner;
public class Study1_for6 {
	public static void main(String[] args) {		

		
		Scanner sc = new Scanner(System.in);		
		int score,tot=0; //입력받는 점수,총점 tot=0으로 지정
		
		for(int i = 0; i<5; i++)
		{
		System.out.print(i+1+"번학생점수(1~100) : " );
		score = sc.nextInt();
		tot = tot+score;
		}
		System.out.print("총점수는 = "+tot );
	}
}










