package Java9_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ����� {

	public static void main(String[]args) { //���������� ����
		Gbb gbb = new Gbb();
		gbb.start();
		
	}
}
class Gbb extends Thread
{
	Scanner sc = new Scanner(System.in);
	int tot,win,lose,draw; //������ �� �� �� ����
	String myChoice; //������
	public void run()
	{
		System.out.println("<<<��������������>>>");
		while(true)
		{
			System.out.println("1. ���� ����");
			System.out.println("2. ��� ����");
			System.out.println("3. ����");
			System.out.print("���� : ");
			int select = sc.nextInt();
			if(select == 1)
			{
				tot++;//���ӽ��۸��ϸ� �׳� ���� ������..
				System.out.print("�� ���� : "); myChoice = sc.next();
				for(int i=3; i>0; i--)
				{
					try {sleep(250);} catch (InterruptedException e) {}
					System.out.println(i);
				}
				//��ǻ�� ���� ����
				int com = (int)(Math.random()*3); //0:���� 1:���� 2:��
				
				if(myChoice.equals("����"))
				{
					
					com(com);
					if(com == 0) {System.out.println("���º�"); draw++;} //���
					if(com == 1) {System.out.println("�й�"); lose++;} //�й�
					if(com == 2) {System.out.println("�¸�"); win++;} //�¸�
					
				}
				else if(myChoice.equals("����"))
				{
					com(com);
				if(com == 0) {System.out.println("�¸�");win++;} //�¸�
				if(com == 1) {System.out.println("���º�");draw++;} //���
				if(com == 2) {System.out.println("�й�");lose++;} //�й�
					
				}
				else if(myChoice.equals("��"))
				{
					com(com);
					if(com == 0) {System.out.println("�й�");lose++;} //���
					if(com == 1) {System.out.println("�¸�");win++;} //�й�
					if(com == 2) {System.out.println("���º�");draw++;} //�¸�
					
					
				}
			}
			else if(select == 2)
			{
				File();
				
			}
			else if(select == 3)
			{
				System.out.println("���α׷� ����"); break;
			}
			
		}
	}
void com(int sel)
{
	if(sel == 0)
	{
		System.out.println("��ǻ�Ͱ� ������ �½��ϴ�");
	}
	if(sel == 1)
	{
		System.out.println("��ǻ�Ͱ� ������ �½��ϴ�");
	}
	if(sel == 2)
	{
		System.out.println("��ǻ�Ͱ� ���� �½��ϴ�");
	}
}
void File()
{
	try{
    	Date nowDate = new Date();       
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");      
		String now = simpleDateFormat.format(nowDate);

		File file1 = new File("C:\\aaa\\work\\abc.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        bufferedWriter.write(now);
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println(now);
        //���� ��ü ����
        File file11 = new File("C:\\aaa\\work\\abc.txt");
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file11));
            bufferedWriter1.write("������ : "+tot+" / "+"��"+"�� :"+win+" / "+"�� :"+draw+ " / "+"�� :"+lose);
            bufferedWriter1.newLine();
            bufferedWriter1.close();
    }catch (IOException e) {
        System.out.println(e);
    }
	try{
        //���� ��ü ����
        File file = new File("C:\\aaa\\work\\abc.txt");
        //�Է� ��Ʈ�� ����
        FileReader filereader = new FileReader(file);
        //�Է� ���� ����
        BufferedReader bufReader = new BufferedReader(filereader);
        String line = "";
        while((line = bufReader.readLine()) != null){
            System.out.println(line);
        }                 
        bufReader.close();
    }catch (FileNotFoundException e) {           
    }catch(IOException e){           
    }
}

}






































