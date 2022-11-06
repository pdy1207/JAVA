package day01;

public class FirstJava {

	public static void main(String[] args) { //메인 함수
		//프로그램은 위에서 아래로 읽기
//		int x = 10;
//		int y = 20;
//		x = y+x;
//		x +=y;
		//  x의 값은 30을 대입
		
//		int money = 100000;
//		int oman = 50000;
//		//문제 1. 총 몇장의 5만원을 받을 수 있는지 구하시오!
//		
//		oman = money/oman;
//		System.out.println(oman);
		
		int money = 130000;
		int oman = 50000;
		int man = 10000;
		//문제 2. 총 5만원 몇장과 만원 몇장을 받을 수 있는지 구하시오!
		int omanCount = money/ oman;
//		System.out.println("오만원 = > "+omanCount);
		
		int result = money % oman;
		int result1 = result / man;
//		System.out.println("만원 = > "+result1);
		
		
//if / else, for 문 많이 사용
		
		
		
		int z = 100; //	z의 값 대입
		z = z * 2; //	z에 z와 2를 곱한 값 대입
		int a = z; // 	a에 z를 대입 
		// a 결과는 ? 200
		
		
		
		
		int result_1 = 100; //1. result_1에 100을 대입 
		int temp_1 = 0; // 2. temp_1에 0을 대입
		
		temp_1 = result_1; //3. result_1에 값을 temp_1에 대입
		temp_1 = 500; // 4. temp_1에 500을 대입 
		result_1 = result_1 * 2 ; // 5. 100*2 결과를 result_1에 대입
		temp_1 = result_1; // 6. result_1값을 temp_1에 대입
		
		//temp_1 결과는 ? 200 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
