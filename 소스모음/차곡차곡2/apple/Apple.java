package apple;

public class Apple implements Applemple{
	
	int ������� = 0; 	//�ʵ庯�� (�ʱⰪ)
	int ����Ʈ = 0;		//�ʵ庯��
	
	//���� 1������ 
	public Apple() {//������( == ����Ÿ���� ���� �޼ҵ�)
		this.������� = 5; //��������̶�� �ʵ庯���� �ʱ�ȭ ��
	}
	@Override
	public void ���������ȸ�ϴ�() {
		System.out.println("���� ��� ������ ? " + this.�������);
		
	}
	@Override
	public void ������Դ�(int ����) {
		if(this.������� < ����) {
			System.out.println("��� �������ּ���.");
		}else {
			this.������� = this.������� - ����;
			System.out.println("��� �ȳ�");
		}
		
	}
	@Override
	public void ����������ϴ�(int ����) { //���� 2 �� ���� 
		if(���� <= 15) {
			this.������� = this.������� + ����;
			System.out.println("����� �����Ͽ����ϴ�.");
			if(10<=����) {
				this.����Ʈ = this.����Ʈ + 1000;
			}
		}else {
			 System.out.println("��� ���� �Ұ�"); 
		}
	}
	@Override
	public void ����Ʈ��ȸ() {
		System.out.println("���� ����Ʈ �Դϴ� : "+this.����Ʈ);
		if(this.����Ʈ >=2000) {
			System.out.println("������ �����Ͻ� �� �ֽ��ϴ�!");
		}
	}
	
	
}
	
	

