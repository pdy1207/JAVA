package day01;

public class Method_Study3 {
	
	
	
	public static void main(String[] args) {
		int a [] = {5,1,2,10};
		int temp = 0;
		temp = a[0]; //5를 템프에 입력 
		a[0] = a[1]; //1값을 0에 입력
		a[1] = a[2]; //10값을 1에 입력
		a[2] = temp; //5값을 2에 입력 
		int size = a.length;
		for (int i=0; i<size; i++) {
			System.out.println(a[i]);
		}
		getSort(a);
		
		getCount();
		
		getResult(10,40);
		int array[] = {8,10,20,30}; //배열 생성
		getIndex(array); 	//getIndex 함수 호출 후 array 파라미터에 대입
		
		int array_1[] = getArray(); 
		// getArray return이 배열이기때문에 가능한 문법
		System.out.println(array_1[0]);
		
	}
// 문제 10. 파라미터에 배열을 받은 값을 정렬하고 정렬된 배열을 리턴 
//	ex) {4,1} => {1,4} 정렬 횟수 1.
//	ex) {10,4,1} => {1,4,10} 정렬 횟수 3
//	단, Array.sort() 사용금지 (로직으로 구현하시오.)
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
//	문제 11. 짝수 갯수를 리턴하시오.
	public static int getCount() {
		int array[] = {2,3,8,10};
		for(int i=0; i<array.length; i++) {
			if(array[i]%2 == 0 ) {
				System.out.println("짝수 갯수 =>" + array[i]);
				return array[i];
			}
		}
		return 0;
	}
// ***** 파라미터에 배열도 받을 수 있다!
	public static int getIndex(int[] array) {
//문제 1. 평균 구해서 평균값 리턴하시오.
		int avg = 0;  //총합 구하는 함수
		for (int i=0; i<array.length; i++) {
			avg += array[i];
		}
		int result = avg/4; //평균 구하는 함수
		System.out.println(result);
		return result;
		
	}
	
	//***리턴 타입에 배열도 온다!!
	public static int[] getArray() {
		int array[] = {3,5};
		return array;
	}
	
	public static int getResult(int x, int y) {
		
//		리턴 타입 : int
//		메소드 이름 : getResult
//		파라미터 타입 : int, int
//		파라미터 x  값 : 10
//		파라미터 y  값 : 40
		int a = x + y;
		return a;
//		a 값은 ? 50
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
