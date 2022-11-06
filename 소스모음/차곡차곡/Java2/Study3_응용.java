package Java2;

public class Study3_응용 {

	public static void main(String[] args) {
		
			int number1 = 100;
			int number2 = 200;
			int number3 = 300; 
								
			System.out.println("number1 : " +number1 +" / number2 : "+number2 +" / number3: " + number3 );
			
			System.out.println("1000이 증가합니다.");
			number1 = number1 +1000;
			number2 = number2+1000;
			number3 = number3 +1000;
			System.out.println("number1 : " +number1 +" / number2 : "+number2 +" / number3: " + number3 );
			
			System.out.println("500이 감소합니다.");
			number1 = number1 -500;
			number2 = number2 -500;
			number3 = number3 -500;
			System.out.println("number1 : " +number1 +" / number2 : "+number2 +" / number3: " + number3 );
	
			//응용
			System.out.println("20000이 증가합니다.");
			number1 = number1 +20000;
			number2 = number2 +20000;
			number3 = number3 +20000;
			System.out.println("number1 : " +number1 +" / number2 : "+number2 +" / number3: " + number3 );
		//기본값에 1000증가 그 값에 500 감소 선언 그리고 2만 추가
	}
}
