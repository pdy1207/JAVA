package day03;

public class MyInfo implements StudyImple{
	
	/*
	�޼ҵ� �̸��� ������ �Ķ������ ����, �����Ͱ� �ٸ��� 
	= �����ε� 
	*/
	
	public void printName(String name) {
		//���⼭ ��������
		System.out.println(name + "�Դϴ�.");
		name = "�ڵ���";
	}
	public void printAge(int age) {
		
		System.out.println("���̴�"+age);
	}
	
	@Override//�������̵� : �޼ҵ� ������(�籸��)
	//�����ε� : �޼ҵ��̸��� ������ �Ķ���� Ÿ�� Ȥ�� ������ �ٸ�
	//@ : ������̼�
	
	public void printName(int age, String name) {
		
		System.out.println("���� "+age+" �̸� " + name +"�Դϴ�.");
	}
	@Override
	public void main() {
		
		
	}
	

	
	
}
