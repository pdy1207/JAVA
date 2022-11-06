package day04;

import java.util.ArrayList;
import java.util.List;

public class List문제 {
	public static void main(String[] args) {
		List<카페> list = new ArrayList<카페>();
		카페 스벅 = new 카페();
		스벅.set메뉴이름("아메리카노");
		스벅.set가격(4000);
		
		카페 스벅1 = new 카페();
		스벅1.set메뉴이름("에스프레소");
		스벅1.set가격(3000);
		
		카페 스벅2= new 카페();
		스벅2.set메뉴이름("바닐라라떼");
		스벅2.set가격(5000);
		
		list.add(스벅);
		list.add(스벅1);
		list.add(스벅2);
		
//		1. list.get(i).get메뉴이름();
//		카페 st = list.get(0); 0번째 원소 호출
//		st.get메뉴이름(); 	   
		
		for(카페 x : list) { //보통 출력하려고하는 for문 
			System.out.println(x.get메뉴이름()+" , "+x.get가격());
			if("바닐라라떼".equals(x.get메뉴이름())) {
				String 바꿀이름 = "카페모카";
				x.set메뉴이름(바꿀이름);
				System.out.println(바꿀이름); //list안에 넣어야하기때문에 잘못됨! 
			}
		}
		for(int i=0; i<list.size(); i++) { //삭제 수정 하려는 for문 
			String 메뉴이름 = list.get(i).get메뉴이름(); // 메소드 체이닝 
			if("바닐라라떼".equals(메뉴이름)) {
				list.get(i).set메뉴이름("카페모카");
			}
			System.out.println("결과 :"+list.get(i).get메뉴이름());
		}
		
		
	}
}
/*
1. 필드 변수 getter setter 메소드 생성
2. 에스프레소 3000원, 아메리카노 4000원, 라떼 4500원 객체 생성
3. 생성한 객체 list에 담기
4. list에 있는 모든 원소 출력하기
5. list에 라떼가 있으면 카페모카로 이름 수정
 */
class 카페{
	private String 메뉴이름; //ex) 아메리카노, 라떼, 녹차 등등 
	private int 가격;
	private int 포인트적립;
	public void set메뉴이름(String 메뉴이름) {
		this.메뉴이름 = 메뉴이름;
	}
	public String get메뉴이름() {
		return 메뉴이름;
	}
	public void set가격(int 가격) {
		
		this.가격 = 가격;
	}
	public int get가격() {
		return 가격;
	}
	public void set포인트적립(int 포인트적립) {
		this.포인트적립 = 포인트적립;
	}
	public int get포인트적립() {
		return 포인트적립;
	}
}
