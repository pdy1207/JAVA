package day02;

public class Class_Study1 {

	/*Ŭ������ ���� �޼ҵ�� ���� */
//��� �ڹ� Ŭ������ ����Ʈ�� Object�� ��ӹ޴´�.
//static �޼ҵ忡�� static �޼ҵ�� new�� ����ؼ� �ҷ��� �޼ҵ常 ��밡�� 
	public static void main(String[] args) {
/* 
Ŭ������ �޼ҵ�ó�� ������ ����ϴ�
Ŭ������ �޼ҵ�ó�� ����� �и��Ϸ��� ���� ����.
Ŭ������ ��ü������(JAVA, C++, Python, JavaScript ...) ���� �ִ� ����!
main�Լ����� PizzaStore class�� ȣ���ϰ� �ʹ� (new)
*/ 
		PizzaStore pizza = new PizzaStore();
//new PizzaStore(); PizzaStoreŬ������ �ҷ����ڴ�.
//�ٸ� Ŭ������ �ִ� �޼ҵ峪 ������ ����� ���� new�� �� ����Ѵ�.		
		pizza.makePizza();

//���� 1. eatPizza �޼ҵ带 ȣ���ؼ� "ġ�� ���ڸ� �Դ�" ȣ�� 
		pizza.eatPizza("ġ������");
		
//PizzaStore pizza = new PizzaStore(); �� ��� ����
//PizzaStore�� �ִ� �޼ҵ� 2���� ����� �� �ִ� ����� ������?
		new PizzaStore().eatPizza("ġ������");

		
//���� 2. DwŬ������ ȣ���ϰ�, Dw Ŭ������ ���ǵ� �޼ҵ带 ��� ����Ͻÿ�.
		Dw d = new Dw(); //dwŬ���� ȣ�� ���1.
		d.����ϴ�();
		d.�����ϴ�();
		d.����������("�ڵ���","�ڹ�");
		new Dw().����ϴ�(); //���2.
		new Dw().�����ϴ�();
		System.out.println(new Dw().����������("�ڵ���", "�ڹ�"));
		
	}
}
/*Ŭ���� �̸� �տ��� �빮�� 
public class �� �ڹ� ���Ͽ��� �ϳ��� �� �� ����*/
class PizzaStore{
	public void makePizza() {
		System.out.println("���ڸ� �����.");
	}
	public void eatPizza(String pizzaName) {
		System.out.println(pizzaName + "�� �Դ�.");
	}
}
class Dw{ //Dw�� Ŭ���� �̸� (����)
	//Dw Ŭ���� �ȿ��� Dw�� �����ִ� ����(�޼ҵ�)�� �´�.
	public void ����ϴ�() {
		System.out.println("���� ���!");
	}
	public void �����ϴ�() {
		System.out.println("���� ����!");
	}
//���� 3. ������ ���� �޼ҵ� ȣ�� 
	public String ����������(String �������̸�,String �������̸�) {
		return �������̸�+ "��" + �������̸�+"��(��) �˷��ִ�.";
	}
}