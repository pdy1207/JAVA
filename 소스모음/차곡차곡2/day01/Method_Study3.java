package day01;

public class Method_Study3 {
	
	
	
	public static void main(String[] args) {
		int a [] = {5,1,2,10};
		int temp = 0;
		temp = a[0]; //5�� ������ �Է� 
		a[0] = a[1]; //1���� 0�� �Է�
		a[1] = a[2]; //10���� 1�� �Է�
		a[2] = temp; //5���� 2�� �Է� 
		int size = a.length;
		for (int i=0; i<size; i++) {
			System.out.println(a[i]);
		}
		getSort(a);
		
		getCount();
		
		getResult(10,40);
		int array[] = {8,10,20,30}; //�迭 ����
		getIndex(array); 	//getIndex �Լ� ȣ�� �� array �Ķ���Ϳ� ����
		
		int array_1[] = getArray(); 
		// getArray return�� �迭�̱⶧���� ������ ����
		System.out.println(array_1[0]);
		
	}
// ���� 10. �Ķ���Ϳ� �迭�� ���� ���� �����ϰ� ���ĵ� �迭�� ���� 
//	ex) {4,1} => {1,4} ���� Ƚ�� 1.
//	ex) {10,4,1} => {1,4,10} ���� Ƚ�� 3
//	��, Array.sort() ������ (�������� �����Ͻÿ�.)
	public static int[] getSort(int [] array) {
		int len = array.length;
		for(int i=len; i>0; i--) {
			boolean isChange = false;
			for(int j=0; i<( i - 1 ); j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isChange = true;
				}
			}
			if(!isChange) break;
			
		}
		return array;
		
	}
//	���� 11. ¦�� ������ �����Ͻÿ�.
	public static int getCount() {
		int array[] = {2,3,8,10};
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0 ) {
				System.out.println("¦�� ���� =>" + array[i]);
				return array[i];
			}
		}
		return 0;
	}
// ***** �Ķ���Ϳ� �迭�� ���� �� �ִ�!
	public static int getIndex(int[] array) {
//���� 1. ��� ���ؼ� ��հ� �����Ͻÿ�.
		int avg = 0;  //���� ���ϴ� �Լ�
		for (int i=0; i<array.length; i++) {
			avg += array[i];
		}
		int result = avg/4; //��� ���ϴ� �Լ�
		System.out.println(result);
		return result;
		
	}
	
	//***���� Ÿ�Կ� �迭�� �´�!!
	public static int[] getArray() {
		int array[] = {3,5};
		return array;
	}
	
	public static int getResult(int x, int y) {
		
//		���� Ÿ�� : int
//		�޼ҵ� �̸� : getResult
//		�Ķ���� Ÿ�� : int, int
//		�Ķ���� x  �� : 10
//		�Ķ���� y  �� : 40
		int a = x + y;
		return a;
//		a ���� ? 50
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
