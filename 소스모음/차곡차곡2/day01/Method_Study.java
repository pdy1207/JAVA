package day01;

public class Method_Study {
	
	public static void main(String[] args) {
		
/*
	메소드 이유 ?
1. 재사용
2. 중복제거
3. 협업 

	메소드 없이도 프로그램을 만들 수 있으나, 
	기능을 더 유연하게 하려면 메소드를 사용해야 함.

		*/
		
		eat(); //**오류가 뜨는 이유는 eat이라는 메소드에 static 이라는 함수가 없어서 static 메소드에는 static만 올수있음**
			   //**허나, if문 처럼 안에 넣는것은 메인 메소드에 ex) 클래스 = new 클래스 이런식으로 쓰고 eat(); 가능하게됨 **
		
		
		
		//getSum 메소드 호출하기!
		int sum1 = getSum(50,20);
		System.out.println("sum => "+ sum1);
		
		
		int num = getNum(100); //문제 3!
		
		System.out.println("4번 최댓값 구하기 = > "+ getMax()); // 문제 4번 
		
		
		
	}
	
	
	
/*-----------------------------------------------------------------------2교시---------------*/	
	//void 는 리턴이 없다....
	//그러므로 밑에 있는건 return 을 써야한다...
	//리턴 타입이 있으면 return을 작성해야 함.
	public static int getSum(int x,int y) {
		System.out.println("x 값 => " + x );
		System.out.println("y 값 => " + y );
		int sum = x + y;
		return sum;
	}
//문제 4. 최댓값 구하기(메인메소드에 호출까지)
	public static int getMax() {
		int array[] = {10,20,100,5};
		int max = 0;
			for(int i=0; i<array.length; i++) {
				if(max<array[i])
					max = array[i];
			}
		return max;
	}
//문제 5. x가 y보다 크면 x를 
//	y가 x보다 크면 y를 리턴하는 로직 구현
	public static int getNum2(int x, int y) {
		if(x>y) return x;
		if(x<y) return y;
		
		return 0;
	}
	
	
//문제 3. 파라미터값이 100 이라면 x에 2를곱해서 리턴하시오.
	public static int getNum(int x) {
		if(x==100) return x * 2;  //x가 100이면 여기서 return 
		
		return 0; //아니라면 여기서 return
	}
	
//문제 1. **아래 메소드 이름과, 리턴 타입, ()파라미터 작성하시오.**
	public static void eat() {
		
// 메소드 이름 : eat  
// 리턴 타입 : void 
// 파라미터 타입 : String
		
	}//통째로 메소드라는 것.
	
//문제 2. 아래 메소드 이름과, 리턴 타입, ()파라미터 작성하시오.
	public int getFood(String food, int money) {
		return 0;
		
		// 메소드 이름 : getFood  
		// 리턴 타입 : int
		// 파라미터 타입 : String,int
		
		//public int(리턴타입) getFood(메소드 이름) (String food, int money(파라미터)) 문법
		/*
		메소드 리턴 타입에 올 수 있는 것 들
		1. int, double, float, long, boolean ...
		2. 클래스 String 
		3. void (리턴할것 없음)
		 */
		/*
		파라미터(매개변수, 인자값)에 올 수 있는 것 들
		1. int, double, float, long, boolean ...
		2. 클래스 String
		3. () 없으면 빈 괄호를 쓴다.(void 없음)
		 */
	}//통째로 메소드라는 것.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
