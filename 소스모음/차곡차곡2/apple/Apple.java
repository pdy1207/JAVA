package apple;

public class Apple implements Applemple{
	
	int 사과수량 = 0; 	//필드변수 (초기값)
	int 포인트 = 0;		//필드변수
	
	//문제 1번정답 
	public Apple() {//생성자( == 리턴타입이 없는 메소드)
		this.사과수량 = 5; //사과수량이라는 필드변수를 초기화 함
	}
	@Override
	public void 사과수량조회하다() {
		System.out.println("현재 사과 수량은 ? " + this.사과수량);
		
	}
	@Override
	public void 사과를먹다(int 수량) {
		if(this.사과수량 < 수량) {
			System.out.println("사과 구매해주세요.");
		}else {
			this.사과수량 = this.사과수량 - 수량;
			System.out.println("사과 냠냠");
		}
		
	}
	@Override
	public void 사과를구매하다(int 수량) { //문제 2 번 정답 
		if(수량 <= 15) {
			this.사과수량 = this.사과수량 + 수량;
			System.out.println("사과를 구매하였습니다.");
			if(10<=수량) {
				this.포인트 = this.포인트 + 1000;
			}
		}else {
			 System.out.println("사과 구매 불가"); 
		}
	}
	@Override
	public void 포인트조회() {
		System.out.println("현재 포인트 입니다 : "+this.포인트);
		if(this.포인트 >=2000) {
			System.out.println("수박을 구매하실 수 있습니다!");
		}
	}
	
	
}
	
	

