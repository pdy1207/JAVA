package day01;

public class Ifelse_Study2 {

	public static void main(String[] args) { //main을 만들고 ctrl+spacebar하면 자동완성
		
		
//1. 문자열 비교
		
		String name ="홍길동"; //class 대문자 즉 String 은 class String 
		
//	문제1. 이름이 홍길동 이라면 로그인 완료 출력!
		
		if("홍길동".equals(name) ) {
			System.out.println("로그인 완료!"); //System 역시 클래스 임!
		}
		// 	name == "홍길동" 문자를 비교하는게 아니다. !!!***!!!
		//	String이 클래스 이기 때문에 equals메소드를 사용하여 비교해야함.
		//	"홍길동".equals(name); 도 가능 
		
//문제2. else를 사용하지말고 홍길동이 아니라면 로그인 실패 출력
		
		if(!"홍길동".equals(name)) { //느낌표는 부정의 의미 홍길동이 아니라면 출력하라
			System.out.println("로그인 실패"); 
		}
		
// 결론 3 줄요약 : else 최대한 쓰지 말자! else는 편하지만 코드가 길어지면 보기 어렵다.
		
							/*-------------------------------boolean-------------------*/
		
//2. boolean 으로 if/else 사용 법
		
//문제3. isLogin이 true면 로그인 완료 isLogin이 false면 로그인실패 (단, else사용 x)
		
		boolean isLogin = true; 		// boolean 변수는 앞에 is/has 온다.
//tip)		boolean을 flag 값 이라고 부르기도 함.
		if(isLogin) {
			System.out.println("로그인 완료");
		}
		if(!isLogin) {
			System.out.println("로그인 실패");	
		}
// isLogin == true (x)
		
		
		
		
	}

}
