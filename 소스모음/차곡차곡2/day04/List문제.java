package day04;

import java.util.ArrayList;
import java.util.List;

public class List���� {
	public static void main(String[] args) {
		List<ī��> list = new ArrayList<ī��>();
		ī�� ���� = new ī��();
		����.set�޴��̸�("�Ƹ޸�ī��");
		����.set����(4000);
		
		ī�� ����1 = new ī��();
		����1.set�޴��̸�("����������");
		����1.set����(3000);
		
		ī�� ����2= new ī��();
		����2.set�޴��̸�("�ٴҶ��");
		����2.set����(5000);
		
		list.add(����);
		list.add(����1);
		list.add(����2);
		
//		1. list.get(i).get�޴��̸�();
//		ī�� st = list.get(0); 0��° ���� ȣ��
//		st.get�޴��̸�(); 	   
		
		for(ī�� x : list) { //���� ����Ϸ����ϴ� for�� 
			System.out.println(x.get�޴��̸�()+" , "+x.get����());
			if("�ٴҶ��".equals(x.get�޴��̸�())) {
				String �ٲ��̸� = "ī���ī";
				x.set�޴��̸�(�ٲ��̸�);
				System.out.println(�ٲ��̸�); //list�ȿ� �־���ϱ⶧���� �߸���! 
			}
		}
		for(int i=0; i<list.size(); i++) { //���� ���� �Ϸ��� for�� 
			String �޴��̸� = list.get(i).get�޴��̸�(); // �޼ҵ� ü�̴� 
			if("�ٴҶ��".equals(�޴��̸�)) {
				list.get(i).set�޴��̸�("ī���ī");
			}
			System.out.println("��� :"+list.get(i).get�޴��̸�());
		}
		
		
	}
}
/*
1. �ʵ� ���� getter setter �޼ҵ� ����
2. ���������� 3000��, �Ƹ޸�ī�� 4000��, �� 4500�� ��ü ����
3. ������ ��ü list�� ���
4. list�� �ִ� ��� ���� ����ϱ�
5. list�� �󶼰� ������ ī���ī�� �̸� ����
 */
class ī��{
	private String �޴��̸�; //ex) �Ƹ޸�ī��, ��, ���� ��� 
	private int ����;
	private int ����Ʈ����;
	public void set�޴��̸�(String �޴��̸�) {
		this.�޴��̸� = �޴��̸�;
	}
	public String get�޴��̸�() {
		return �޴��̸�;
	}
	public void set����(int ����) {
		
		this.���� = ����;
	}
	public int get����() {
		return ����;
	}
	public void set����Ʈ����(int ����Ʈ����) {
		this.����Ʈ���� = ����Ʈ����;
	}
	public int get����Ʈ����() {
		return ����Ʈ����;
	}
}
