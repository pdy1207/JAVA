package day02;

public class Class_Study1 {

	/*클래스는 주제 메소드는 동사 */
//모든 자바 클래스는 디폴트로 Object를 상속받는다.
//static 메소드에는 static 메소드와 new를 사용해서 불러온 메소드만 허용가능 
	public static void main(String[] args) {
/* 
클래스도 메소드처럼 개념이 비슷하다
클래스도 메소드처럼 기능을 분리하려고 나온 개념.
클래스는 객체지향언어(JAVA, C++, Python, JavaScript ...) 에만 있는 개념!
main함수에서 PizzaStore class를 호출하고 싶다 (new)
*/ 
		PizzaStore pizza = new PizzaStore();
//new PizzaStore(); PizzaStore클래스를 불러오겠다.
//다른 클래스에 있는 메소드나 변수를 사용할 때는 new를 꼭 써야한다.		
		pizza.makePizza();

//문제 1. eatPizza 메소드를 호출해서 "치즈 피자를 먹다" 호출 
		pizza.eatPizza("치즈피자");
		
//PizzaStore pizza = new PizzaStore(); 이 방법 말고
//PizzaStore에 있는 메소드 2개를 사용할 수 있는 방법이 있을까?
		new PizzaStore().eatPizza("치즈피자");

		
//문제 2. Dw클래스를 호출하고, Dw 클래스에 정의된 메소드를 모두 출력하시오.
		Dw d = new Dw(); //dw클래스 호출 방법1.
		d.출근하다();
		d.지각하다();
		d.수업을배우다("박도영","자바");
		new Dw().출근하다(); //방법2.
		new Dw().지각하다();
		System.out.println(new Dw().수업을배우다("박도영", "자바"));
		
	}
}
/*클래스 이름 앞에는 대문자 
public class 는 자바 파일에서 하나만 올 수 있음*/
class PizzaStore{
	public void makePizza() {
		System.out.println("피자를 만들다.");
	}
	public void eatPizza(String pizzaName) {
		System.out.println(pizzaName + "를 먹다.");
	}
}
class Dw{ //Dw는 클래스 이름 (주제)
	//Dw 클래스 안에는 Dw랑 연관있는 행위(메소드)만 온다.
	public void 출근하다() {
		System.out.println("오늘 출근!");
	}
	public void 지각하다() {
		System.out.println("오늘 지각!");
	}
//문제 3. 수업을 배우다 메소드 호출 
	public String 수업을배우다(String 선생님이름,String 교과목이름) {
		return 선생님이름+ "이" + 교과목이름+"를(을) 알려주다.";
	}
}