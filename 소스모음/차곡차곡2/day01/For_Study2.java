package day01;

public class For_Study2 {

	public static void main(String[] args) {

//���� 1. 1 ~ 10������ �� ���� ���Ͻÿ�.
		
		int tot =0;
		for(int i=1; i<=10; i++) {
			tot+=i; // tot = tot+i;
		}
		System.out.println("1 ~ 10������ ���� = > "+tot);
		
//���� 2. 1 ~ 10���� �� ¦�� ����? 
		
		int result =0; //���� �������� ������ ����, �ʱⰪ�� ���� 
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) result++; //if �߰�ȣ ���� ����! 
		}
		System.out.println("1 ~ 10������ ¦�� = >" + result);
			
		
		
		
	}


}
