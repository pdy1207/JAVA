package Java9_3;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {	
		Login2 l = new Login2();
	}
}
class Login2{
	Scanner sc = new Scanner(System.in);
	private String id = "admin";
	private String pw = "1004";	
	int MAX=100;
	String memberId[] = new String[MAX];
	String memberPw[] = new String[MAX];
	String memberName[] = new String[MAX];
	String memberHp[] = new String[MAX];
	int count=0;//ȸ������ ī��Ʈ�Ѵ�...
	Login2()
	{
		while(true)
		{
			System.out.println("1.�α���");
			System.out.println("2.ȸ������");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("���̵�:"); String inputId = sc.next();
				System.out.print("��й�ȣ:"); String inputPw = sc.next();
				login(inputId,inputPw);
			}
			else if(sel == 2) { join();}
			else if(sel == 3) {
				System.out.println("���α׷�����.");
				break;}
		}
		
	}
	void join()
	{
		System.out.println("�ű�ȸ������");
		System.out.print("���̵�:"); memberId[count] = sc.next();
		System.out.print("���:"); memberPw[count] = sc.next();
		System.out.print("�̸�:"); memberName[count] = sc.next();
		System.out.print("����:"); memberHp[count] = sc.next();
		count++;
	}
	
	void login(String id, String pw) {
		
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("�����ڷ� �α��εǾ����ϴ�.");
				
				while(true)
				{
					System.out.println("1.ȸ����ü����");
					System.out.println("2.�α׾ƿ�");
					System.out.println("3.����");
					System.out.print("����:"); int sel = sc.nextInt();
					if(sel == 1) {
						
						for(int i=0; i< count; i++)
						{
						  System.out.println(i+1+"�� "+memberId[i]+"/"+memberName[i]+"/"+memberHp[i]);
						}
						
					}
					else if(sel == 2) {
						System.out.println("�α׾ƿ��Ǿ����ϴ�.");
						break;}
					else if(sel == 3) {
						System.out.println("���α׷�����.");
						System.exit(-1);}
				}
			}
		}
	}
}




