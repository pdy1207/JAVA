package Java9_3;

public class Thread1 {

	public static void main(String[]args) { 
			Test t = new Test();
			t.start();
		
		while(true)
		{
			try {
				Thread.sleep(2000);
				System.out.println("자바 수업");
			} catch (InterruptedException e) {
			}
		}
	}
}
class Test extends Thread{
	public void run() {
		int count=20;
		while(true)
		{
			try {
				sleep(1000);
				System.out.println(count + "안녕하세요");
			} catch (InterruptedException e) {
			}
		count++;	
		}
	}
}