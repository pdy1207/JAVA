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
	int count=0;//회원수를 카운트한다...
	Login2()
	{
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) {
				System.out.print("아이디:"); String inputId = sc.next();
				System.out.print("비밀번호:"); String inputPw = sc.next();
				login(inputId,inputPw);
			}
			else if(sel == 2) { join();}
			else if(sel == 3) {
				System.out.println("프로그램종료.");
				break;}
		}
		
	}
	void join()
	{
		System.out.println("신규회원가입");
		System.out.print("아이디:"); memberId[count] = sc.next();
		System.out.print("비번:"); memberPw[count] = sc.next();
		System.out.print("이름:"); memberName[count] = sc.next();
		System.out.print("전번:"); memberHp[count] = sc.next();
		count++;
	}
	
	void login(String id, String pw) {
		
		if(this.id.equals(id))
		{
			if(this.pw.equals(pw))
			{
				System.out.println("관리자로 로그인되었습니다.");
				
				while(true)
				{
					System.out.println("1.회원전체보기");
					System.out.println("2.로그아웃");
					System.out.println("3.종료");
					System.out.print("선택:"); int sel = sc.nextInt();
					if(sel == 1) {
						
						for(int i=0; i< count; i++)
						{
						  System.out.println(i+1+"번 "+memberId[i]+"/"+memberName[i]+"/"+memberHp[i]);
						}
						
					}
					else if(sel == 2) {
						System.out.println("로그아웃되었습니다.");
						break;}
					else if(sel == 3) {
						System.out.println("프로그램종료.");
						System.exit(-1);}
				}
			}
		}
	}
}




