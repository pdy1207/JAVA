package Java9_4;

import java.io.*;
import java.util.Scanner;

public class Study1 {

	public static void main(String[] args) {
		Info i = new Info();
		

	}

}
class Info
{	Scanner sc = new Scanner(System.in);
	
	
	String name;
	String add;
	String pho;
	int age ;
	int select;
	
	Info()
		{
			whi();
		}
	
	
	void whi()
		{
			System.out.println("<����������׽�Ʈ>");
			while(true)
			{
				System.out.println("1.�����Է�");
				System.out.println("2.�������");
				System.out.println("3.����");
				System.out.print("���� : "); select = sc.nextInt();
				if(select == 1){input();}
				else if(select == 2){output();}
				else if(select == 3){System.out.println("����");break;}
			
			}
		}
	
	 void input()
	
			{
		 		System.out.println("����� ������ �Է��ϼ���");
				System.out.print("�̸� : "); name = sc.next();
				System.out.print("���� : "); age = sc.nextInt();
				System.out.print("�ּ� : "); add = sc.next();
				System.out.print("����ó : "); pho = sc.next();
				
				System.out.println("�Ѹ��� �߰� �Ǿ����ϴ�.");
				try{
		            //���� ��ü ����
		            File file = new File("C:\\aaa\\work\\ddd.txt");
		            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));	            
		              
		                bufferedWriter.write(name+" / "+"���� : "+age+" / "+"�ּ� : "+add+" / "+"����ó : "+pho);
		                bufferedWriter.newLine();
		                bufferedWriter.close();
		        }catch (IOException e) {
		            System.out.println(e);
		        }
				
			}
				
			
	void output()
			{
		
		 try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\ddd.txt");
	            //�Է� ��Ʈ�� ����
	            FileReader filereader = new FileReader(file);
	            //�Է� ���� ����
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            int number=1;
	            while((line = bufReader.readLine()) != null){
	                System.out.println(number++ +"�� "+ line);
	            }                 
	            bufReader.close();
	        }catch (FileNotFoundException e) {           
	        }catch(IOException e){           
	        }
				
			}
	
	
}