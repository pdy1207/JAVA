package day01;

public class For_Study2 {

	public static void main(String[] args) {

//문제 1. 1 ~ 10까지의 총 합을 구하시오.
		
		int tot =0;
		for(int i=1; i<=10; i++) {
			tot+=i; // tot = tot+i;
		}
		System.out.println("1 ~ 10까지의 총합 = > "+tot);
		
//문제 2. 1 ~ 10까지 중 짝수 수는? 
		
		int result =0; //값을 대입하지 않으면 오류, 초기값을 설정 
		for(int i=1; i<=10; i++) {
			if(i%2 == 0) result++; //if 중괄호 생략 가능! 
		}
		System.out.println("1 ~ 10까지의 짝수 = >" + result);
			
		
		
		
	}


}
