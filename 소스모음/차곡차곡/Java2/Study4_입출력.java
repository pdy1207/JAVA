package Java2;

import java.util.Scanner; //������ ���� Ŭ�� �� ���� �ٷ� �ڵ��ϼ� 

public class Study4_����� {

	public static void main(String[] args) {
		//�Է� Scanner 

				Scanner sc = new Scanner(System.in);
				
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.next();  
				
				System.out.print("������ �Է��ϼ��� : ");
				int age = sc.nextInt();
				
				System.out.print("�� Ű�� �Է��ϼ��� : ");
				double height = sc.nextDouble(); 
				
				System.out.println("�� �̸��� : " + name); 
				System.out.println("�� ���̴� : " + age+ " ��"); 
				System.out.println("�� Ű�� : " + height+ " cm"); 
				
				
			
	}
}
