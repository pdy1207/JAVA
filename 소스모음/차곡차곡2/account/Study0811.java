package account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Study0811 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("ġ����");
//����1. list�ȿ� �ִ� �����͸� ����Ͻÿ�.(for�� ���)
		for(String ���� : list) { //�� ������ �� for�Ϲݹ� ���� 
			//for - each ��
			System.out.println("���� 1. " +����);
		}
//����2. ġ������ �����ϰ� list�ȿ� �ִ� �����͸� ����Ͻÿ�(for�� ���)
//		2. hint => remove() �޼ҵ� ���
		list.remove(1);
		for(int i=0; i<list.size(); i++) {
			String ���� = list.get(i);
		System.out.println("���� 2. "+ ����);
		}
		
		//HashMap
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "�̿��");
		map.put("2", "���ٿ�");
		map.put("3", "�̹�ȣ");
		map.put("4", "���±�");
		//map : key(�ߺ��Ұ���), value(�ߺ� ���)
		
		//������ ����ϱ�
		String �����̸� = map.get("1");
		System.out.println("����Ÿ�� : " + �����̸�);
		
		//�ǹ� MAPȰ��
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("1",100);
		map2.put("2","100");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
