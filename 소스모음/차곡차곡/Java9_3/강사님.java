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

public class 강사님 {

	public static void main(String[]args) { //가위바위보 게임
		Gbb gbb = new Gbb();
		gbb.start();
		
	}
}
class Gbb extends Thread
{
	Scanner sc = new Scanner(System.in);
	int tot,win,lose,draw; //총전적 승 무 패 변수
	String myChoice; //내선택
	public void run()
	{
		System.out.println("<<<가위바위보게임>>>");
		while(true)
		{
			System.out.println("1. 게임 시작");
			System.out.println("2. 통계 보기");
			System.out.println("3. 종료");
			System.out.print("선택 : ");
			int select = sc.nextInt();
			if(select == 1)
			{
				tot++;//게임시작만하면 그냥 증가 총전적..
				System.out.print("내 선택 : "); myChoice = sc.next();
				for(int i=3; i>0; i--)
				{
					try {sleep(250);} catch (InterruptedException e) {}
					System.out.println(i);
				}
				//컴퓨터 랜덤 생성
				int com = (int)(Math.random()*3); //0:가위 1:바위 2:보
				
				if(myChoice.equals("가위"))
				{
					
					com(com);
					if(com == 0) {System.out.println("무승부"); draw++;} //비김
					if(com == 1) {System.out.println("패배"); lose++;} //패배
					if(com == 2) {System.out.println("승리"); win++;} //승리
					
				}
				else if(myChoice.equals("바위"))
				{
					com(com);
				if(com == 0) {System.out.println("승리");win++;} //승리
				if(com == 1) {System.out.println("무승부");draw++;} //비김
				if(com == 2) {System.out.println("패배");lose++;} //패배
					
				}
				else if(myChoice.equals("보"))
				{
					com(com);
					if(com == 0) {System.out.println("패배");lose++;} //비김
					if(com == 1) {System.out.println("승리");win++;} //패배
					if(com == 2) {System.out.println("무승부");draw++;} //승리
					
					
				}
			}
			else if(select == 2)
			{
				File();
				
			}
			else if(select == 3)
			{
				System.out.println("프로그램 종료"); break;
			}
			
		}
	}
void com(int sel)
{
	if(sel == 0)
	{
		System.out.println("컴퓨터가 가위를 냈습니다");
	}
	if(sel == 1)
	{
		System.out.println("컴퓨터가 바위를 냈습니다");
	}
	if(sel == 2)
	{
		System.out.println("컴퓨터가 보를 냈습니다");
	}
}
void File()
{
	try{
    	Date nowDate = new Date();       
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");      
		String now = simpleDateFormat.format(nowDate);

		File file1 = new File("C:\\aaa\\work\\abc.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        bufferedWriter.write(now);
        bufferedWriter.newLine();
        bufferedWriter.close();
        System.out.println(now);
        //파일 객체 생성
        File file11 = new File("C:\\aaa\\work\\abc.txt");
        BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter(file11));
            bufferedWriter1.write("총전적 : "+tot+" / "+"전"+"승 :"+win+" / "+"무 :"+draw+ " / "+"패 :"+lose);
            bufferedWriter1.newLine();
            bufferedWriter1.close();
    }catch (IOException e) {
        System.out.println(e);
    }
	try{
        //파일 객체 생성
        File file = new File("C:\\aaa\\work\\abc.txt");
        //입력 스트림 생성
        FileReader filereader = new FileReader(file);
        //입력 버퍼 생성
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






































