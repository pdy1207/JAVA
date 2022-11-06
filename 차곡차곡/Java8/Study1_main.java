package Java8;

public class Study1_main {

	public static void main(String[] args) {
		// 전달값 x 리턴값 x 1) 철수야 놀다와라~!
		chulsu1();
		// 전달값 o 리턴값 x 2) 철수야 10000원 줄테니 맛난거 사먹어!
		chulsu2(10000);
		// 전달값 x 리턴값 o 3) 철수야 들어올때 택배 2개만 가져다줘!
		int boxcount = chulsu3();
		System.out.println("철수가 가져온 택배 수 : " + boxcount);
		// 전달값 o 리턴값 o 4) 철수야 20000원 줄테니 치킨 1개 사다줘
		int bbq = chulsu4(20000);
		System.out.println("철수가 가져s온 치킨마리수 : " + bbq);

	}
		static void chulsu1()
		{
			System.out.println("철수야 놀다와라!!!!");
		}
		static void chulsu2(int money)
		{
			System.out.println("철수가 받은 돈은 : " + money);
		}
		static int chulsu3()
		{
			System.out.println("철수가 가져온 택배 2개만 가져다줘!");
			return 2;
		}
		static int chulsu4(int money)
		{
			System.out.println("철수야 20000원 줄테니 치킨1개 사다줘");
			return 1;
		}
		
}
