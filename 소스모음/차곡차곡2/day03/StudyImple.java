package day03;

public interface StudyImple {
	
	/**
	 * @author �ڵ���
	 * @param name
	 * comment : �׽�Ʈ �޼ҵ� 
	 */
	public void printName(String name);		
	
//����1. ����Ÿ�� void �޼ҵ��̸� printAge �Ķ���ͷ� int���� �޴� �޼ҵ� �ۼ�
	public void printAge(int age);
	
//����2. ����Ÿ�� void �޼ҵ��̸� printName �Ķ���ͷ� int, String�� �޴� �޼ҵ� �ۼ�
	public void printName(int age, String name);
	
	public void main();

}
//	���� : interface ������ ���Ǹ� �����ϴ�.
/*--------------------Ư¡--------------------*/	
/*
	1. �������� �Ұ��� ( if,for�� �� ���Ұ��� )
 	2. �������̽����� ������ �޼ҵ�� *������ public�̴�.
 	3. �������̽��� ����ϴ� Ŭ������ *������ (�߿�) 
 	�������̽����� ���ǵ� �޼ҵ带 ����ؾ���.
 	4. �ڹٴ� ���߻���� �Ұ����ؼ� �������̽��� ���߻���� �����Ѵ�.
 */
/*--------------------�����--------------------*/
/*
class ġŲ�� implements StudyImple{

}
implements : �������̽��� ����ϴ� Ű���� 
*/

	