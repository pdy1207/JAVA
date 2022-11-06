package day01;

public class Method_Study5 {
	public static void main(String[] args) {
		
		String name = getName("홍길도");
		System.out.println("1번정답 : "+name);
		int age = getAge(5);
		System.out.println("2번정답 : "+age);
	}
//문제1. getName 메소드를 호출하고 변수에 대입하시오
//	(주의 : 파라미터 값이 있음!)
	public static String getName(String name) {
		return name;
	}
//문제2. getAge 메소드를 호출하고 변수에 대입하시오
	//*****리턴타입, 메소드 이름, 파라미터(매개변수,인자값) ******
	public static int getAge(int age) {
		return age; 
	}
}
