package day04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMap {
	public static void main(String[] args) {
		��� m = new ���();
//		m.����̸� = "���缮";  ����! ���� : �ʵ庯���� public �ƴ� private!
//		����1. �ʵ庯���� ������ �� �� �ְ� ������ �����Ͻÿ�.
//		��, ���������ڴ� �ǵ��� ����
		m.set�̸�("���缮");
		String �̸� = m.get�̸�();
		System.out.println("�̸� => " + �̸�);
		m.set����(25);
		int ���� = m.get����();
		System.out.println("���� => " + ����);
		
		
		List<���> list = new ArrayList<���>();
		list.add(m);
		
		��� m2 = new ���();
		m2.set�̸�("������");
		m2.set����(40);
		
		list.add(m2);
		
		for(��� x : list) {
			System.out.println(x.get�̸�()+" , "+x.get����());
		}
//����2. �Ϲ� for������ list �ȿ� �ִ� ���ҵ� ����ϱ�
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).get�̸�()+" , "+list.get(i).get����());
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("1", m); //���缮
		map.put("2", m2); //������
		
//		(���) : cast
		��� ���1 = (���) map.get("1");
		System.out.println("�̸� : " + ���1.get�̸�()); // ���缮 �̸�
		System.out.println("���� : " + ���1.get����()); // ���缮 ���� 
	}
}
class ���{
	private String ����̸�; //�ʵ� ����
	public void set�̸�(String ����̸�) {
		this.����̸� = ����̸�;
	}
	public String get�̸�() {
		return this.����̸�;
	}
	
	private int �������;
	
	public void set����(int ����) {
		this.������� = ����;
	}
	public int get����() {
		return this.�������;
	}
}