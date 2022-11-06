package Java9_4;
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
public class Study2_220712 {
	public static void main(String[] args) {
		Soccer s = new Soccer();
	}
}
class Soccer{
	Scanner sc = new Scanner(System.in);
	String TeamName[] = {"토트넘","바르셀로나","레알마드리드"};
	String playMent[] = {
			"공격합니다",
			"1골을 넣었습니다.",
			"슈팅을 넣었지만 실패했습니다.",
			"수비가끝내주네요.",
			"공격수가 자빠집니다.",
			"골키퍼가선방합니다.",
			"패널티에 실패합니다.",
			"패널티를 성공합니다.",
			"자살골을 넣었습니다.",
			"1명이 퇴장을 당했습니다.",
	};
	
	String myTeamName; //내팀명
	int win,draw,loss,tot;
	Soccer(){
		System.out.println("<축구게임을 시작합니다!>\n");
		System.out.print("내팀명입력 :"); myTeamName = sc.next();
		System.out.println("\n게임을시작합니다.\n");
		tot++;
		while(true)
		{
			System.out.println("1.게임하기");
			System.out.println("2.랭킹보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) { gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {break;}save();//저장처리}
		}
		
	}
	   
	   void gameStart() {
//		   teamRandom();
		   //팀랜덤 정하기
		while(true)
		{
			System.out.println("1.축구시작");
			System.out.println("2.돌아가기");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) {
							for(int i=0; i<5;i++)
							{
								try { Thread.sleep(500);
								System.out.println("잠시만 기다려주세요. 팀 매칭 중 입니다.");
								} catch (InterruptedException e) {}
							}
								try { Thread.sleep(1000);
									int team = (int)(Math.random()*3);
									System.out.println("\n"+TeamName[team]+" 와 "+myTeamName +" 매칭되었습니다.\n");
								} catch (InterruptedException e) {}
							for(int i=3; i>0;i--)
							{
								try { Thread.sleep(700);
								System.out.println("게임이 "+i+"초 후 시작됩니다.");
								} catch (InterruptedException e) {}
							}
							for(int i=0; i<4;i++)
							{
								System.out.println("");
								int rand = (int)(Math.random()*10);
								if(rand==0)      {ment(playMent[0]);}
								else if(rand==1) {ment(playMent[1]); loss++;}
								else if(rand==2) {ment(playMent[2]);}
								else if(rand==3) {ment(playMent[3]);}
								else if(rand==4) {ment(playMent[4]);}
								else if(rand==5) {ment(playMent[5]);}
								else if(rand==6) {ment(playMent[6]); draw++;}
								else if(rand==7) {ment(playMent[7]); win++;}
								else if(rand==8) {ment(playMent[8]); loss++;}
								else if(rand==9) {ment(playMent[9]); loss++;}
								try { Thread.sleep(500);
								} catch (InterruptedException e) {}	
							}
							
						System.out.println("\n총 "+tot+"전 승:"+win+"/ 무:"+draw+"/ 패:"+loss+"\n");
			}
			else if(sel == 2) {
				save(); break;
			}
		}
		   
	   } 
	   void ment(String ment) { System.out.println(ment);  }//게임멘트
	   void ranking() {
		   System.out.println("내 팀명 : ");myTeamName = sc.next();
		   System.out.println("승리 : "+win);
		   System.out.println("무승부 : "+draw);
		   System.out.println("패배 : "+loss);
		   load();
	   }//랭킹보기
	   void save() {
		   if(myTeamName.equals(myTeamName))
		   {
			   try{
	           //파일 객체 생성
	           File file = new File("C:\\aaa\\work\\score.txt");
	           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	
	         //현재 시간구하기 초까지...
	       	Date nowDate = new Date();       
	   		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");      
	   		String now = simpleDateFormat.format(nowDate);
	   		
	           //쓰기
	           bufferedWriter.write("총 전적 : "+tot+" 시점 : "+now);//총전적
	           bufferedWriter.newLine(); 
	           bufferedWriter.write("총 "+tot+"전 승:"+win+"/ 무:"+draw+"/ 패:"+loss);//총전적
	           bufferedWriter.newLine(); 
	           bufferedWriter.close();           
	           
	       }catch (IOException e) {
	           System.out.println(e);
	       }
		   }
	   	}//파일저장
	   void load() {try{
           //파일 객체 생성
           File file = new File("C:\\aaa\\work\\score.txt");
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
       }}//파일로드
}





