package Java4;
import java.util.Scanner;
public class Study1_for6 {
	public static void main(String[] args) {		

		
		Scanner sc = new Scanner(System.in);		
		int score,tot=0; //�Է¹޴� ����,���� tot=0���� ����
		
		for(int i = 0; i<5; i++)
		{
		System.out.print(i+1+"���л�����(1~100) : " );
		score = sc.nextInt();
		tot = tot+score;
		}
		System.out.print("�������� = "+tot );
	}
}










