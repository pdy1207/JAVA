package day01;

public class Array_study {
	
	public static void main(String[] args) {
		
//배열 ? 
		int a = 5;
		int b = 10;
		int c = 10;
//변수 100개를 선언해라!
//변수를 100번을 선언하는 건 헛수고
//헛수고를 덜고자 배열이 나옴
//배열은 0부터 시작하는데 왜 0부터인가? 외국인이 만들었기 때문
		
//문제 1. 두번째 원소를 출력하고, 배열의 길이도 출력하시오!
		
		int array[] = {5, 10, 10};
		System.out.println("두번째 원소 : "+array[1]); //배열 원소 접근 
		System.out.println("배열의 길이 : "+array.length); //배열의 길이
		
		int item = array[0]; //0번째 원소를 item에 대입!
		System.out.println(item);
		
		array[0] = 100; //100을 0번재 원소에 대입 
		System.out.println(array[0]);
		
		if(array[0] == 100) {
			System.out.println("0번째 원소는 100!");
		}
		
		
//문제 2. 마지막 원소에 50을 대입하고 if 조건으로 50이면 50 출력하는 로직 구현하기.
		
		array[2] = 50; //내가 배열길이를 알아야함 
		
		//마지막 원소 접근 다른 방법
		
		array[array.length - 1] = 50; //이 방법을 많이 한다. 배열길이를 몰라도 마지막 원소에 접근 보장 확실한 마지막 원소 접근
		
		if(array[2] == 50) {
			System.out.println("마지막 원소는 50! ");
		}
		
		
//문제 3. 배열안에 있는 모든 원소 출력
		
		System.out.println(array[0]); //0번째 원소 출력
		System.out.println(array[1]); //1번째 원소 출력
		System.out.println(array[2]); //2번째 원소 출력
	
	//3번은 아래 for문을 이용하면 노가다 작업을 줄일 수 있음.
		
		int size = array.length;
		for(int i=0; i<size; i++) {
			System.out.println(array[i]);
		}
		
//문제 3-1. 0번째 원소와 2번째 원소에 각각 50 대입 후 출력! (출력할때 for문 이용해서)
		
		int arr_1[] = {1,30,40};
		arr_1[0] = 50;
		arr_1[1] = 50;
		int size2 = arr_1.length;
		for(int i=0; i<size2; i++) {
			System.out.println("3-1번 정답 = > "+arr_1[i]);
		}
		//방법 (2). for-each 문 ( == 향상된 for문)
		for(int i : arr_1) {
			System.out.println(i);
		}
		
//문제 4. 모든 원소값 더하기 (for문을 이용해서 풀 것)
		
		int arr[] = {10,20,30,40,50};
		
		int size3 = arr.length;
		int tot=0;
		for(int i=0; i<size3; i++) {
			tot +=arr[i];
		}
		System.out.println("4번 정답 =>" +tot);
		
//문제 5. 아래 원소 중 최댓값 구하기 (for문을 이용해서 풀 것)
		
		int arr_2 [] = {30,100,20,5};
		
		int max = 0; //최댓값 알아내기 위한 변수 선언
		
		for(int i=0; i<arr_2.length; i++) {
			if(max<arr_2[i]) 
				
				max = arr_2[i];
		}
		System.out.println("5번 정답 최댓값 => "+ max);
		
		
//문제 6. 아래 배열에서 원소값이 50이면 for문을 멈추시오!
		
		int arr_3 [] = {3,7,19,50,3,1};
		
		for(int i=0; i<arr_3.length; i++) {
			if(arr_3.length == 50) break;
		}
		
//문제 7. 아래 배열에서 마지막 원소에 2를 곱해주고 마지막 원소만 출력하시오. 
			//for문 사용 x 
		
			int arr_4[] = {4,1,9};
			int tot1 = arr_4[arr_4.length-1] * 2;
			System.out.println("7번 정답 ==> " +tot1);
			
//문제 8. 배열 위치 바꾸기 0번째와 2번째 원소값 서로 바꾸기
			// {3,5,8} => {8,5,3} (o)
			// for문 사용x, 변수 하나만 선언해서 풀 것
			
			int arr_5[] = {3,5,8};
			int temp = 0;
			temp = arr_5[0];
			arr_5[0] = arr_5[2];
			arr_5[2] = temp;
			
			System.out.println(temp+"/"+arr_5[2]);
		
		
	}
}
