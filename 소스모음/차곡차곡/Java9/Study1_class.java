package Java9;

public class Study1_class 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		t.speak();
		System.out.println("���� �̸� : " + t.name);
		
		Study2_class t2 = new Study2_class();
		t2.speak();
		System.out.println("���� �̸� : " + t2.name);
	}

}
class Test
{
	String name="�ְ���";
	int age=12;
	void speak() { System.out.println("���簡 ���Ѵ�!");}
	void study() { System.out.println("�л��� �����Ѵ�!");}
}