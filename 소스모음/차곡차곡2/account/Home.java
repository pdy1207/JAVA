package account;

import java.util.Scanner; //�ڵ� ����Ʈ ctrl + Shift + o

public class Home {
	public static void main(String[] args) {
		
		Account ������ = new Account();
		
		System.out.println("�ܼ� ���α׷� ����");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[1]������ȸ [2]���� [3]���� [4]����");
			int number = sc.nextInt();
			switch(number) {
			case 1 : 
				System.out.println("������ȸ");
				������.���¸���ȸ�ϴ�(); 
				break;
			case 2 :
				System.out.println("������ �ݾ��� �Է��ϼ���!");
				int ���⵷ = sc.nextInt();
				������.�������ִ�(���⵷);
				break;
			case 3 : 
				System.out.println("���Աݾ��� �Է��ϼ���!");
				int ���� = sc.nextInt();
				������.�������ִ�(����);
				break;
			case 4 : 
				System.out.println("���α׷� ����"); System.exit(0); 
				break;
			//System.exit(0); Java ���� ����
			}
		}
		
		
	}
}
