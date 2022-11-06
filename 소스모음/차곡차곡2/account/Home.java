package account;

import java.util.Scanner; //자동 임포트 ctrl + Shift + o

public class Home {
	public static void main(String[] args) {
		
		Account 내계좌 = new Account();
		
		System.out.println("콘솔 프로그램 시작");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("[1]계좌조회 [2]지출 [3]수입 [4]종료");
			int number = sc.nextInt();
			switch(number) {
			case 1 : 
				System.out.println("계좌조회");
				내계좌.계좌를조회하다(); 
				break;
			case 2 :
				System.out.println("지출할 금액을 입력하세요!");
				int 지출돈 = sc.nextInt();
				내계좌.지출이있다(지출돈);
				break;
			case 3 : 
				System.out.println("수입금액을 입력하세요!");
				int 수입 = sc.nextInt();
				내계좌.수입이있다(수입);
				break;
			case 4 : 
				System.out.println("프로그램 종료"); System.exit(0); 
				break;
			//System.exit(0); Java 강제 종료
			}
		}
		
		
	}
}
