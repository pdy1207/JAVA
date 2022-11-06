package day03;

public interface StudyImple {
	
	/**
	 * @author 박도영
	 * @param name
	 * comment : 테스트 메소드 
	 */
	public void printName(String name);		
	
//문제1. 리턴타입 void 메소드이름 printAge 파라미터로 int형을 받는 메소드 작성
	public void printAge(int age);
	
//문제2. 리턴타입 void 메소드이름 printName 파라미터로 int, String을 받는 메소드 작성
	public void printName(int age, String name);
	
	public void main();

}
//	개념 : interface 에서는 정의만 가능하다.
/*--------------------특징--------------------*/	
/*
	1. 로직구현 불가능 ( if,for문 등 사용불가능 )
 	2. 인터페이스에서 생성된 메소드는 *무조권 public이다.
 	3. 인터페이스를 사용하는 클래스는 *무조권 (중요) 
 	인터페이스에서 정의된 메소드를 사용해야함.
 	4. 자바는 다중상속이 불가능해서 인터페이스로 다중상속을 구현한다.
 */
/*--------------------사용방법--------------------*/
/*
class 치킨집 implements StudyImple{

}
implements : 인터페이스를 사용하는 키워드 
*/

	