package Java9_1;

public class Study1_Class {

	public static void main(String[] args) {
		AAA a = new AAA();
		AAA b = new AAA(111,"������"); 

	}
}
class AAA
{
	int gold = 100000;
	String name = "ȫ�浿";
	AAA()
	{
		System.out.println("�̸� : "+ name + " / ������ : " + gold);
	}
	AAA(int gold, String name)
	{
		this.gold = gold; this.name=name;
		System.out.println("�̸� : "+ name + " / ������ : " + gold);
	}
}