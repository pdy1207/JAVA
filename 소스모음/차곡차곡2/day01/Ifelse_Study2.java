package day01;

public class Ifelse_Study2 {

	public static void main(String[] args) { //main�� ����� ctrl+spacebar�ϸ� �ڵ��ϼ�
		
		
//1. ���ڿ� ��
		
		String name ="ȫ�浿"; //class �빮�� �� String �� class String 
		
//	����1. �̸��� ȫ�浿 �̶�� �α��� �Ϸ� ���!
		
		if("ȫ�浿".equals(name) ) {
			System.out.println("�α��� �Ϸ�!"); //System ���� Ŭ���� ��!
		}
		// 	name == "ȫ�浿" ���ڸ� ���ϴ°� �ƴϴ�. !!!***!!!
		//	String�� Ŭ���� �̱� ������ equals�޼ҵ带 ����Ͽ� ���ؾ���.
		//	"ȫ�浿".equals(name); �� ���� 
		
//����2. else�� ����������� ȫ�浿�� �ƴ϶�� �α��� ���� ���
		
		if(!"ȫ�浿".equals(name)) { //����ǥ�� ������ �ǹ� ȫ�浿�� �ƴ϶�� ����϶�
			System.out.println("�α��� ����"); 
		}
		
// ��� 3 �ٿ�� : else �ִ��� ���� ����! else�� �������� �ڵ尡 ������� ���� ��ƴ�.
		
							/*-------------------------------boolean-------------------*/
		
//2. boolean ���� if/else ��� ��
		
//����3. isLogin�� true�� �α��� �Ϸ� isLogin�� false�� �α��ν��� (��, else��� x)
		
		boolean isLogin = true; 		// boolean ������ �տ� is/has �´�.
//tip)		boolean�� flag �� �̶�� �θ��⵵ ��.
		if(isLogin) {
			System.out.println("�α��� �Ϸ�");
		}
		if(!isLogin) {
			System.out.println("�α��� ����");	
		}
// isLogin == true (x)
		
		
		
		
	}

}
