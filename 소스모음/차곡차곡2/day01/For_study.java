package day01;

public class For_study {
	
	public static void main(String[] args) {
		

//for? �ݺ��� 
//for���� ����ϴ� ����! ������ �ݺ������� �۾��� �ϰ� ���� �� ���
//for���� if/else ó�� ���� ���� ����Ѵ�.

		
		
		/*for(�ʱ⹮; ���ǽ�; �ݺ� �� �۾�) {
			...�۾���...
		}
			1. �ʱ⹮ ����
			2. ���ǽ� ����
			3. �۾��� ����
			4. �ݺ� �� �۾�
		*
		*/
		for(int i=0; i<5; i++) {
			System.out.println("i�� ���� ? " + i); 
		}
		
//���� 1. 1���� 10���� for���� �ۼ��ϰ�, ¦���� ���ڸ� ����Ͻÿ�.
		
		for(int i=1; i<11; i++){
			if(i%2==0) {
			System.out.println("¦�� => "+i);
			}//if end
		}//for end 

//���� 2. 0���� 5���� for���� �ۼ��ϰ� i�� 4�� �� i�� 2�� ���Ͻÿ�. 
		
		for(int i=0; i<=5; i++) {
			if(i==4) {
				System.out.println(i*2);
			}
				
		}

//���� 3. 1~10���� for���� �ۼ��ϰ� 1~10���� ������ ���Ͻÿ�.
		
		int sum=0;
		for(int i=1; i<11; i++) {
			sum+=i; // sum = sum+i
		}
		System.out.println("1~10������ ���� =>"+sum);
		
//���� 4. (�����) 1~5���� for���� �ۼ��ϰ� 3���� break�� �̿��ؼ� for�� ���߱�
		
		for(int i=1; i<=5; i++) {
			if(i == 3)  
				break; //�߰�ȣ ���� ���� !!!
			
			System.out.println(i);
		}
		
//���� 5. 1 ~ 10 ���� for���� �ۼ��ϰ�, ¦���� � ���� ���Ͻÿ�.
		
		int result = 0;
		for(int i=1; i<=10; i++) {
			if(i%2 == 0)
				result++;
			
		} // for�� ���ǹ��� 1 ~ 10 ��� �㳪 2�� ���� ���� result++���ָ� ¦���� ������ ����
		System.out.println("¦���� ������ ? "+result);
		
//���� 6. 1 ~ 20 ���� for���� �ۼ��ϰ�, 1 ~ 20 ������ ���ϴµ�, 
// ������ 60�� ������ break������ for���� Ż��
		
		int tot=0;
		for(int i=1; i<=20; i++) {
			tot = tot+i;
			if(tot < 60 || tot > 50)  //or
			break;
		}
		System.out.println("60�� �ʰ� !! "+tot);
		
		
		
		int age = 30;
		int kg = 80;
		if(age == 30 || kg == 70) { //and
			System.out.println("hi");
		}
		
		
	}

}
