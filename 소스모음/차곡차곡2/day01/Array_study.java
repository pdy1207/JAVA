package day01;

public class Array_study {
	
	public static void main(String[] args) {
		
//�迭 ? 
		int a = 5;
		int b = 10;
		int c = 10;
//���� 100���� �����ض�!
//������ 100���� �����ϴ� �� �����
//����� ������ �迭�� ����
//�迭�� 0���� �����ϴµ� �� 0�����ΰ�? �ܱ����� ������� ����
		
//���� 1. �ι�° ���Ҹ� ����ϰ�, �迭�� ���̵� ����Ͻÿ�!
		
		int array[] = {5, 10, 10};
		System.out.println("�ι�° ���� : "+array[1]); //�迭 ���� ���� 
		System.out.println("�迭�� ���� : "+array.length); //�迭�� ����
		
		int item = array[0]; //0��° ���Ҹ� item�� ����!
		System.out.println(item);
		
		array[0] = 100; //100�� 0���� ���ҿ� ���� 
		System.out.println(array[0]);
		
		if(array[0] == 100) {
			System.out.println("0��° ���Ҵ� 100!");
		}
		
		
//���� 2. ������ ���ҿ� 50�� �����ϰ� if �������� 50�̸� 50 ����ϴ� ���� �����ϱ�.
		
		array[2] = 50; //���� �迭���̸� �˾ƾ��� 
		
		//������ ���� ���� �ٸ� ���
		
		array[array.length - 1] = 50; //�� ����� ���� �Ѵ�. �迭���̸� ���� ������ ���ҿ� ���� ���� Ȯ���� ������ ���� ����
		
		if(array[2] == 50) {
			System.out.println("������ ���Ҵ� 50! ");
		}
		
		
//���� 3. �迭�ȿ� �ִ� ��� ���� ���
		
		System.out.println(array[0]); //0��° ���� ���
		System.out.println(array[1]); //1��° ���� ���
		System.out.println(array[2]); //2��° ���� ���
	
	//3���� �Ʒ� for���� �̿��ϸ� �밡�� �۾��� ���� �� ����.
		
		int size = array.length;
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
//���� 3-1. 0��° ���ҿ� 2��° ���ҿ� ���� 50 ���� �� ���! (����Ҷ� for�� �̿��ؼ�)
		
		int arr_1[] = {1,30,40};
		arr_1[0] = 50;
		arr_1[1] = 50;
		int size2 = arr_1.length;
		for(int i=0; i<size2; i++) {
			System.out.println("3-1�� ���� = > "+arr_1[i]);
		}
		//��� (2). for-each �� ( == ���� for��)
		for(int i : arr_1) {
			System.out.println(i);
		}
		
//���� 4. ��� ���Ұ� ���ϱ� (for���� �̿��ؼ� Ǯ ��)
		
		int arr[] = {10,20,30,40,50};
		
		int size3 = arr.length;
		int tot=0;
		for(int i=0; i<size3; i++) {
			tot +=arr[i];
		}
		System.out.println("4�� ���� =>" +tot);
		
//���� 5. �Ʒ� ���� �� �ִ� ���ϱ� (for���� �̿��ؼ� Ǯ ��)
		
		int arr_2 [] = {30,100,20,5};
		
		int max = 0; //�ִ� �˾Ƴ��� ���� ���� ����
		
		for(int i=0; i<arr_2.length; i++) {
			if(max<arr_2[i]) 
				
				max = arr_2[i];
		}
		System.out.println("5�� ���� �ִ� => "+ max);
		
		
//���� 6. �Ʒ� �迭���� ���Ұ��� 50�̸� for���� ���߽ÿ�!
		
		int arr_3 [] = {3,7,19,50,3,1};
		
		for(int i=0; i<arr_3.length; i++) {
			if(arr_3.length == 50) break;
		}
		
//���� 7. �Ʒ� �迭���� ������ ���ҿ� 2�� �����ְ� ������ ���Ҹ� ����Ͻÿ�. 
			//for�� ��� x 
		
			int arr_4[] = {4,1,9};
			int tot1 = arr_4[arr_4.length-1] * 2;
			System.out.println("7�� ���� ==> " +tot1);
			
//���� 8. �迭 ��ġ �ٲٱ� 0��°�� 2��° ���Ұ� ���� �ٲٱ�
			// {3,5,8} => {8,5,3} (o)
			// for�� ���x, ���� �ϳ��� �����ؼ� Ǯ ��
			
			int arr_5[] = {3,5,8};
			int temp = 0;
			temp = arr_5[0];
			arr_5[0] = arr_5[2];
			arr_5[2] = temp;
			
			System.out.println(temp+"/"+arr_5[2]);
		
		
	}
}
