package Java3;
import java.util.Scanner;
public class Study1_����IF4_����2 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);  
		  
		 int tot , a, b, c;
		 //�Է��� �� �޾ƾ���. �Է��ϴ� ������ŭ �Ⱥ��̴°͵��� �ٽ� �Է�
		 System.out.print("���� : ");
		 a = sc.nextInt();
		 System.out.print("���� : ");
		 b = sc.nextInt();
		 System.out.print("���� : ");
		 c = sc.nextInt();
		 
		 tot = (a+b+c)/3;
		 
		 if( tot < 101 && tot >= 90)    {System.out.println(" �����߾��!! ");}
		 else if (tot < 90 && tot >= 80 ) {System.out.println("����մϴ�!! ");}
		 else {System.out.println("��������!");}
		 		 
		  
		  }
	}

                          
            









