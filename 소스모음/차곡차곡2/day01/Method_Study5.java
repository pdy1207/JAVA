package day01;

public class Method_Study5 {
	public static void main(String[] args) {
		
		String name = getName("ȫ�浵");
		System.out.println("1������ : "+name);
		int age = getAge(5);
		System.out.println("2������ : "+age);
	}
//����1. getName �޼ҵ带 ȣ���ϰ� ������ �����Ͻÿ�
//	(���� : �Ķ���� ���� ����!)
	public static String getName(String name) {
		return name;
	}
//����2. getAge �޼ҵ带 ȣ���ϰ� ������ �����Ͻÿ�
	//*****����Ÿ��, �޼ҵ� �̸�, �Ķ����(�Ű�����,���ڰ�) ******
	public static int getAge(int age) {
		return age; 
	}
}
