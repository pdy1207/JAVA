package day01;

public class Method_Study2 {
	//���� 4. �Ķ���Ͱ��� myId�� ���ؼ� ������ true
	public static boolean isUserId(String userId) {
		String myId = "apple";
		if(myId.equals(userId))return true; //equals ��������! 
		if(!myId.equals(userId))return false;
			return true;
		
	}
	//���� 5.(���̵� ��) x�� y�� ���� ���� ���࿡ 100�� ������ 0�� ����
	public static int getSum(int x, int y) {
		int tot = x + y;
		if(tot > 100) return 0;
		return tot;
	}
	//���� 6. �ĸ����Ͱ��� ȫ�浿�̶�� name�� �����ϰ�, �ƴ϶�� null ����
	public String getName(String name) {
		if(name.equals("ȫ�浿"))return name;
		return null;
	}
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
}
