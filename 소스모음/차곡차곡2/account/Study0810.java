package account;

import java.util.ArrayList;
import java.util.List;

public class Study0810 {
	public static void main(String[] args) {
		//���׸��� �÷�����
		//List, Map 
		List<String> list = new ArrayList<String>(); 
		// List<String> String �� ���� �� �ִ� list
		//list�� �迭��! �迭�� �ٸ����� �迭���̸� �����Ӱ� �߰� ������ �� �ִ�.
		list.add("���");
		list.add("���");
		list.add("�ᱹ��");
		list.add("Į����");
		//���̸� �������� ��� 
		System.out.println("�迭���̴� ? " + list.size());
		//���Ҹ� �������� ���
		System.out.println(list.get(0));
//����1. �ᱹ�� ����Ͻÿ�!
		System.out.println(list.get(2));
		//��� 2
		System.out.println(list.get(list.size()-1));
		
		//�迭(List)�ϰ� for�� ģ��!
		//List ����ϱ� ( �������� ���)
		for(int i=0; i<list.size(); i++) { //�Ϲ� for�� 
			String ���� = list.get(i);
			System.out.println("�޴��̸� : " + ����);
		}
		for(String ���� : list) { //for-each (���� for��)
			System.out.println("�޴��̸� : " + ����);
		}
//����2. ���� ���� Į������ ������ Į���� �Դϴ� ����Ͻÿ�.
		for(String ���� : list) { //for-each (���� for��)
			if(����.equals("Į����" )) // "Į����".equals(����)
			System.out.println("������ Į�����Դϴ�.");
		}
		
		
		List<String> ���� = new ArrayList<String>();
		����.add("���ð�");
		����.add("��Ŵ");
		����.add("SG���ʺ�");
		����.add("VOS");
		����.add("���ð�");
		
//����3. for���� �̿��ؼ� �̸��� �ߺ��Ǵ� ���� 
		int result=0;
		String ã���̸� = "���ð�";
		for(int i=0; i<����.size(); i++) {
			String sing = ����.get(i);
			if(sing.equals(ã���̸�))
				++result;	
			//�� ++ �ٷ� �� ++ õõ�� ������ ?
		}
		System.out.println("�ߺ��Ǵ� ���� ���� ? " + result);
		
		
		
	}
}
