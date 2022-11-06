package day01;

public class Method_Study4 {
	public static void main(String[] args) {
		//리턴 타입이 있으면 대입 가능 
		int array[] = getArray(); //getArray 메소드 호출
		String strarray[] = getStrArray();
		String name = printFood(); // 쓸순 있지만 대입이 불가능함 왜? 보이드 이니까 보이드 = 리턴이 없음
//문제 2. printFood 메소드를 수정해서 위  에러 로직 없애기!
		int plus = getSum(10,20);
		System.out.println("결과  : "+ plus);
		String food = getStr("국수");
		System.out.println("문제 4번 : "+food);
		String food1[] = {"국수","족발","피자"};
		String f = getStr(food1);
		System.out.println(f);
	}
	public static int[] getArray() {
		int array[] = {10,50};
		return array;
	}
//문제 1. getStrArray메소드를 main 함수에 호출하고 대입 하시오.
	public static String[] getStrArray() {
		String array[] = {"다당","쿠겐","실비김치","카라멜"};
		return array;
	}
	public static String printFood() { //printFood메인 메소드에 호출
		return "냠냠";
	}
//문제 3. 아래 메소드를 메인 메소드에 호출 후 변수에 대입하고 출력하시오.
	public static int getSum(int x, int y) {
		return x + y;
	}
//문제 4. 아래 메소드 메인메소드에 호출 후 변수 대입하고 출력하시오.
	public static String getStr (String food) {
		return food;
	}
	
//문제 5. 아래 메소드 메인메소드에 호출 후 변수 대입하고 출력하시오.
// 		조건. 파라미터로 배열을 받는데, 마지막 원소 값만 리턴하시오.
	public static String getStr(String[] food) {
		//!!!메소드 이름은 같으나 파라미터(인자, 매개변수) 타입이 다름 : 오버로딩!!!!
		
		return food[food.length-1];
	}
}
/*0804 (목)

//리턴 타입 : int 
//메소드 이름 : getWorld
//파라미터 타입 :	String
public int getWorld(String word){
	return 0;

}
//리턴 타입 : void (리턴 없음)
//메소드 이름 : getArray
//파라미터 타입 : String[]
//접근 지정자 : public
public void getArray(String[] word){

}*/