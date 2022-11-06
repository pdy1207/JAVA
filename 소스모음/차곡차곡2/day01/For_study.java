package day01;

public class For_study {
	
	public static void main(String[] args) {
		

//for? 반복문 
//for문을 사용하는 이유! 뭔가를 반복적으로 작업을 하고 싶을 때 사용
//for문은 if/else 처럼 정말 많이 사용한다.

		
		
		/*for(초기문; 조건식; 반복 후 작업) {
			...작업문...
		}
			1. 초기문 실행
			2. 조건식 실행
			3. 작업문 실행
			4. 반복 후 작업
		*
		*/
		for(int i=0; i<5; i++) {
			System.out.println("i의 값은 ? " + i); 
		}
		
//문제 1. 1부터 10까지 for문을 작성하고, 짝수인 숫자를 출력하시오.
		
		for(int i=1; i<11; i++){
			if(i%2==0) {
			System.out.println("짝수 => "+i);
			}//if end
		}//for end 

//문제 2. 0부터 5까지 for문을 작성하고 i가 4일 때 i에 2를 곱하시오. 
		
		for(int i=0; i<=5; i++) {
			if(i==4) {
				System.out.println(i*2);
			}
				
		}

//문제 3. 1~10까지 for문을 작성하고 1~10까지 총합을 구하시오.
		
		int sum=0;
		for(int i=1; i<11; i++) {
			sum+=i; // sum = sum+i
		}
		System.out.println("1~10까지의 총합 =>"+sum);
		
//문제 4. (쉬운문제) 1~5까지 for문을 작성하고 3에서 break을 이용해서 for문 멈추기
		
		for(int i=1; i<=5; i++) {
			if(i == 3)  
				break; //중괄호 생략 가능 !!!
			
			System.out.println(i);
		}
		
//문제 5. 1 ~ 10 까지 for문을 작성하고, 짝수가 몇개 인지 구하시오.
		
		int result = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)
				result++;
			
		} // for문 조건문의 1 ~ 10 출력 허나 2로 나눈 값만 result++해주면 짝수의 갯수가 나옴
		System.out.println("짝수의 갯수는 ? "+result);
		
//문제 6. 1 ~ 20 까지 for문을 작성하고, 1 ~ 20 총합을 구하는데, 
// 총합이 60을 넘으면 break문으로 for문을 탈출
		
		int tot=0;
		for(int i=1; i<=20; i++) {
			tot = tot+i;
			if(tot < 60 || tot > 50)  //or
			break;
		}
		System.out.println("60을 초과 !! "+tot);
		
		
		
		int age = 30;
		int kg = 80;
		if(age == 30 || kg == 70) { //and
			System.out.println("hi");
		}
		
		
	}

}
