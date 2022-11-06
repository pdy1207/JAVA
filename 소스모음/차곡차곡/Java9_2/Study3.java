package Java9_2;

import java.util.Scanner;

public class Study3 {
	static int money = 99999;
	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println("a.money : " +a.money);
		System.out.println("gold : " + AAA.gold);
		test();
		System.out.println("Study1.money:" + money);
	}
	
	static void test()
	{
		System.out.println("Static 메서드입니다!");
	}
}

class AAA   

{
	Scanner sc = new Scanner(System.in);
	static int gold = 5;
	int money = 10000;
	AAA()
	{
		System.out.println("gold : " + gold );
	}
}
