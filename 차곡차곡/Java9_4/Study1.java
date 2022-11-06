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
			System.out.println("<파일입출력테스트>");
			while(true)
			{
				System.out.println("1.정보입력");
				System.out.println("2.정보출력");
				System.out.println("3.종료");
				System.out.print("선택 : "); select = sc.nextInt();
				if(select == 1){input();}
				else if(select == 2){output();}
				else if(select == 3){System.out.println("종료");break;}
			
			}
		}
	
	 void input()
	
			{
		 		System.out.println("등록할 내용을 입력하세요");
				System.out.print("이름 : "); name = sc.next();
				System.out.print("나이 : "); age = sc.nextInt();
				System.out.print("주소 : "); add = sc.next();
				System.out.print("연락처 : "); pho = sc.next();
				
				System.out.println("한명이 추가 되었습니다.");
				try{
		            //파일 객체 생성
		            File file = new File("C:\\aaa\\work\\ddd.txt");
		            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));	            
		              
		                bufferedWriter.write(name+" / "+"나이 : "+age+" / "+"주소 : "+add+" / "+"연락처 : "+pho);
		                bufferedWriter.newLine();
		                bufferedWriter.close();
		        }catch (IOException e) {
		            System.out.println(e);
		        }
				
			}
				
			
	void output()
			{
		
		 try{
	            //파일 객체 생성
	            File file = new File("C:\\aaa\\work\\ddd.txt");
	            //입력 스트림 생성
	            FileReader filereader = new FileReader(file);
	            //입력 버퍼 생성
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            int number=1;
	            while((line = bufReader.readLine()) != null){
	                System.out.println(number++ +"번 "+ line);
	            }                 
	            bufReader.close();
	        }catch (FileNotFoundException e) {           
	        }catch(IOException e){           
	        }
				
			}
	
	
}