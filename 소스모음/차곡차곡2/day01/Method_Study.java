package day01;

public class Method_Study {
	
	public static void main(String[] args) {
		
/*
	�޼ҵ� ���� ?
1. ����
2. �ߺ�����
3. ���� 

	�޼ҵ� ���̵� ���α׷��� ���� �� ������, 
	����� �� �����ϰ� �Ϸ��� �޼ҵ带 ����ؾ� ��.

		*/
		
		eat(); //**������ �ߴ� ������ eat�̶�� �޼ҵ忡 static �̶�� �Լ��� ��� static �޼ҵ忡�� static�� �ü�����**
			   //**�㳪, if�� ó�� �ȿ� �ִ°��� ���� �޼ҵ忡 ex) Ŭ���� = new Ŭ���� �̷������� ���� eat(); �����ϰԵ� **
		
		
		
		//getSum �޼ҵ� ȣ���ϱ�!
		int sum1 = getSum(50,20);
		System.out.println("sum => "+ sum1);
		
		
		int num = getNum(100); //���� 3!
		
		System.out.println("4�� �ִ� ���ϱ� = > "+ getMax()); // ���� 4�� 
		
		
		
	}
	
	
	
/*-----------------------------------------------------------------------2����---------------*/	
	//void �� ������ ����....
	//�׷��Ƿ� �ؿ� �ִ°� return �� ����Ѵ�...
	//���� Ÿ���� ������ return�� �ۼ��ؾ� ��.
	public static int getSum(int x,int y) {
		System.out.println("x �� => " + x );
		System.out.println("y �� => " + y );
		int sum = x + y;
		return sum;
	}
//���� 4. �ִ� ���ϱ�(���θ޼ҵ忡 ȣ�����)
	public static int getMax() {
		int array[] = {10,20,100,5};
		int max = 0;
			for(int i=0; i<array.length; i++) {
				if(max<array[i])
					max = array[i];
			}
		return max;
	}
//���� 5. x�� y���� ũ�� x�� 
//	y�� x���� ũ�� y�� �����ϴ� ���� ����
	public static int getNum2(int x, int y) {
		if(x>y) return x;
		if(x<y) return y;
		
		return 0;
	}
	
	
//���� 3. �Ķ���Ͱ��� 100 �̶�� x�� 2�����ؼ� �����Ͻÿ�.
	public static int getNum(int x) {
		if(x==100) return x * 2;  //x�� 100�̸� ���⼭ return 
		
		return 0; //�ƴ϶�� ���⼭ return
	}
	
//���� 1. **�Ʒ� �޼ҵ� �̸���, ���� Ÿ��, ()�Ķ���� �ۼ��Ͻÿ�.**
	public static void eat() {
		
// �޼ҵ� �̸� : eat  
// ���� Ÿ�� : void 
// �Ķ���� Ÿ�� : String
		
	}//��°�� �޼ҵ��� ��.
	
//���� 2. �Ʒ� �޼ҵ� �̸���, ���� Ÿ��, ()�Ķ���� �ۼ��Ͻÿ�.
	public int getFood(String food, int money) {
		return 0;
		
		// �޼ҵ� �̸� : getFood  
		// ���� Ÿ�� : int
		// �Ķ���� Ÿ�� : String,int
		
		//public int(����Ÿ��) getFood(�޼ҵ� �̸�) (String food, int money(�Ķ����)) ����
		/*
		�޼ҵ� ���� Ÿ�Կ� �� �� �ִ� �� ��
		1. int, double, float, long, boolean ...
		2. Ŭ���� String 
		3. void (�����Ұ� ����)
		 */
		/*
		�Ķ����(�Ű�����, ���ڰ�)�� �� �� �ִ� �� ��
		1. int, double, float, long, boolean ...
		2. Ŭ���� String
		3. () ������ �� ��ȣ�� ����.(void ����)
		 */
	}//��°�� �޼ҵ��� ��.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
