package Java8;

public class Study1_main {

	public static void main(String[] args) {
		// ���ް� x ���ϰ� x 1) ö���� ��ٿͶ�~!
		chulsu1();
		// ���ް� o ���ϰ� x 2) ö���� 10000�� ���״� ������ ��Ծ�!
		chulsu2(10000);
		// ���ް� x ���ϰ� o 3) ö���� ���ö� �ù� 2���� ��������!
		int boxcount = chulsu3();
		System.out.println("ö���� ������ �ù� �� : " + boxcount);
		// ���ް� o ���ϰ� o 4) ö���� 20000�� ���״� ġŲ 1�� �����
		int bbq = chulsu4(20000);
		System.out.println("ö���� ����s�� ġŲ������ : " + bbq);

	}
		static void chulsu1()
		{
			System.out.println("ö���� ��ٿͶ�!!!!");
		}
		static void chulsu2(int money)
		{
			System.out.println("ö���� ���� ���� : " + money);
		}
		static int chulsu3()
		{
			System.out.println("ö���� ������ �ù� 2���� ��������!");
			return 2;
		}
		static int chulsu4(int money)
		{
			System.out.println("ö���� 20000�� ���״� ġŲ1�� �����");
			return 1;
		}
		
}
