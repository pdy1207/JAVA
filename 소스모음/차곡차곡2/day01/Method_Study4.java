package day01;

public class Method_Study4 {
	public static void main(String[] args) {
		//���� Ÿ���� ������ ���� ���� 
		int array[] = getArray(); //getArray �޼ҵ� ȣ��
		String strarray[] = getStrArray();
		String name = printFood(); // ���� ������ ������ �Ұ����� ��? ���̵� �̴ϱ� ���̵� = ������ ����
//���� 2. printFood �޼ҵ带 �����ؼ� ��  ���� ���� ���ֱ�!
		int plus = getSum(10,20);
		System.out.println("���  : "+ plus);
		String food = getStr("����");
		System.out.println("���� 4�� : "+food);
		String food1[] = {"����","����","����"};
		String f = getStr(food1);
		System.out.println(f);
	}
	public static int[] getArray() {
		int array[] = {10,50};
		return array;
	}
//���� 1. getStrArray�޼ҵ带 main �Լ��� ȣ���ϰ� ���� �Ͻÿ�.
	public static String[] getStrArray() {
		String array[] = {"�ٴ�","���","�Ǻ��ġ","ī���"};
		return array;
	}
	public static String printFood() { //printFood���� �޼ҵ忡 ȣ��
		return "�ȳ�";
	}
//���� 3. �Ʒ� �޼ҵ带 ���� �޼ҵ忡 ȣ�� �� ������ �����ϰ� ����Ͻÿ�.
	public static int getSum(int x, int y) {
		return x + y;
	}
//���� 4. �Ʒ� �޼ҵ� ���θ޼ҵ忡 ȣ�� �� ���� �����ϰ� ����Ͻÿ�.
	public static String getStr (String food) {
		return food;
	}
	
//���� 5. �Ʒ� �޼ҵ� ���θ޼ҵ忡 ȣ�� �� ���� �����ϰ� ����Ͻÿ�.
// 		����. �Ķ���ͷ� �迭�� �޴µ�, ������ ���� ���� �����Ͻÿ�.
	public static String getStr(String[] food) {
		//!!!�޼ҵ� �̸��� ������ �Ķ����(����, �Ű�����) Ÿ���� �ٸ� : �����ε�!!!!
		
		return food[food.length-1];
	}
}
/*0804 (��)

//���� Ÿ�� : int 
//�޼ҵ� �̸� : getWorld
//�Ķ���� Ÿ�� :	String
public int getWorld(String word){
	return 0;

}
//���� Ÿ�� : void (���� ����)
//�޼ҵ� �̸� : getArray
//�Ķ���� Ÿ�� : String[]
//���� ������ : public
public void getArray(String[] word){

}*/