package Java9;

public class Study1_class 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.speak();
		System.out.println("강사 이름 : " + t.name);
		
		Study2_class t2 = new Study2_class();
		t2.speak();
		System.out.println("강사 이름 : " + t2.name);
	}

}
class Test
{
	String name="최강사";
	int age=12;
	void speak() { System.out.println("강사가 말한다!");}
	void study() { System.out.println("학생이 공부한다!");}
}