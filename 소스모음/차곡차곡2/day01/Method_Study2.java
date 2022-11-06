package day01;

public class Method_Study2 {
	//문제 4. 파라미터값과 myId와 비교해서 맞으면 true
	public static boolean isUserId(String userId) {
		String myId = "apple";
		if(myId.equals(userId))return true; //equals 잊지말기! 
		if(!myId.equals(userId))return false;
			return true;
		
	}
	//문제 5.(난이도 하) x와 y를 더한 값이 만약에 100을 넘으면 0을 리턴
	public static int getSum(int x, int y) {
		int tot = x + y;
		if(tot > 100) return 0;
		return tot;
	}
	//문제 6. 파리미터값이 홍길동이라면 name를 리턴하고, 아니라면 null 리턴
	public String getName(String name) {
		if(name.equals("홍길동"))return name;
		return null;
	}
	public static void main(String[] args) {
		
	}
	
	
	
	
	
	
}
