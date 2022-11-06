package day02;

public class Class_Game {
	public static void main(String[] args) {
		게임 유저1 = new 게임(); //클래스 생성
		
		int 고블린데미지 = 60; //몬스터한대맞다 라는 메소드에 데미지 값을 60 설정 
		유저1.몬스터한대맞다(고블린데미지); //유저1 이라는 메소드 변수에 데미지를 입음
		//유저1.체력 = > 체력 필드변수 접근 
		System.out.println("유저의 현재 체력은 = > "+ 유저1.체력); // class에 체력100 변수에 데미지를 입음
		
		int 물약 = 10;
		유저1.체력회복물약(물약);
		System.out.println("유저의 현재 체력은 = > "+유저1.체력);
/*------------------------------------------------------------------------------------------------------*/
		유저1.레벨업();
		System.out.println("레벨업 : "+ 유저1.레벨+" ! ");
		
		유저1.직업을선택하다("전사");
		
		유저1.레벨업();
	
		유저1.내정보조회();
	}
}
class 게임{ //클래스는 주제 
	String 유저아이디;
	String 캐릭터직업;
	int 체력=100;
	int 레벨;
	public void 몬스터한대맞다(int 데미지) {
		//데미지 받았을때 체력이 깍이는 로직( this 이용할것 ) 
		this.체력 = this.체력 - 데미지;
	}
//문제1. 체력을회복하다 메소드 작성 
	public void 체력회복물약(int 물약) {
		this.체력 = this.체력 + 물약;
	}
	public void 레벨업() {
		this.레벨++;
		
	}
	public void 직업을선택하다(String 직업이름) {
		this.캐릭터직업 = 직업이름;
		System.out.println("당신의 직업은 " + 직업이름 + "입니다. ");
	}
	
	public void 내정보조회() {
		int 레벨 = this.레벨;
		String 직업 = this.캐릭터직업;
		System.out.println("레벨 : " + 레벨 + " 직업 : "+직업);
	}
	
	
	
	
}
