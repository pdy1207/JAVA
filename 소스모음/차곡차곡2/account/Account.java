package account;

public class Account implements AccountImple{
	
	int �����ܰ� = 0; //�ʵ庯��(��������)
	String �̸� = "�ڵ���";
	
	@Override
	public void ���¸���ȸ�ϴ�() {
		System.out.println(this.�̸� + " �� ���¸� ��ȸ�ϰڽ��ϴ�.");
		System.out.println("���� �����ܰ�� " + this.�����ܰ� + "�� �Դϴ�.");
		
//����1. �����ܰ� ��ȸ�Ͽ��� �� �����ܰ� 10���� ���ϸ� 
//"���� ��ǰ�ϳ� ��õ�� �帱���? " ���� ����ϱ�.
		
		final int MAX_MONEY = 100000; // ��� 2. if�ȿ� 100000���� �� ������ �̰� �� Ŭ�� �� �ڵ�
		//���
		if(this.�����ܰ�<=MAX_MONEY) {
			System.out.println("���� ��ǰ�ϳ� ��õ �� �帱���?");
		}

		
	}
	
//����2. ������ �߻��ϸ� �����ܰ� �ݾ� �߰�   
	@Override
	public void �������ִ�(int money) {
		this.�����ܰ� = this.�����ܰ� + money;
//		this.�����ܰ� += money; ���2
		System.out.println(money + " �� ���� �߻�!");
		
	}
	
//����3. ������ �߻��ϸ� �����ܰ� �ݾ� ���̳ʽ�
	//���� ���� ����!
//����4. �����ܰ� ���� ������ ������ �̷��� �� ~ �׾� ��� 
//		����) �����ܰ� ���� ���������� x	//@: ������̼�
	@Override
	public void �������ִ�(int money) {
		System.out.println(money+"�� ���� �߻�!");
//		this.�����ܰ� -= money; ���2.
		if(this.�����ܰ�<money) {	//�����ܰ��� ������ ������ ���
//			System.out.println("�̷��� �� �׾�!");
			System.out.println("�����ܰ� �����մϴ�.");
		}else { // �����ܰ��� ������ ���� !������! ��������
			this.�����ܰ� = this.�����ܰ� - money;			
		}
	} 
}
