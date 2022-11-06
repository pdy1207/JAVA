package account;

public class Account implements AccountImple{
	
	int 통장잔고 = 0; //필드변수(전역변수)
	String 이름 = "박도영";
	
	@Override
	public void 계좌를조회하다() {
		System.out.println(this.이름 + " 님 계좌를 조회하겠습니다.");
		System.out.println("현재 통장잔고는 " + this.통장잔고 + "원 입니다.");
		
//문제1. 통장잔고를 조회하였을 때 통장잔고가 10만원 이하면 
//"고객님 상품하나 추천해 드릴까요? " 문구 출력하기.
		
		final int MAX_MONEY = 100000; // 방법 2. if안에 100000넣을 수 있지만 이게 더 클린 한 코드
		//상속
		if(this.통장잔고<=MAX_MONEY) {
			System.out.println("고객님 상품하나 추천 해 드릴까요?");
		}

		
	}
	
//문제2. 수입이 발생하면 통장잔고에 금액 추가   
	@Override
	public void 수입이있다(int money) {
		this.통장잔고 = this.통장잔고 + money;
//		this.통장잔고 += money; 방법2
		System.out.println(money + " 원 수입 발생!");
		
	}
	
//문제3. 지출이 발생하면 통장잔고 금액 마이너스
	//지출 로직 구현!
//문제4. 통장잔고 보다 지출이 많으면 이러다 다 ~ 죽어 출력 
//		조건) 통장잔고에 돈이 빠져나가면 x	//@: 어노테이션
	@Override
	public void 지출이있다(int money) {
		System.out.println(money+"원 지출 발생!");
//		this.통장잔고 -= money; 방법2.
		if(this.통장잔고<money) {	//통장잔고보다 지출이 많으면 출력
//			System.out.println("이러다 다 죽어!");
			System.out.println("통장잔고가 부족합니다.");
		}else { // 통장잔고보다 지출이 많지 !않으면! 빠져나감
			this.통장잔고 = this.통장잔고 - money;			
		}
	} 
}
