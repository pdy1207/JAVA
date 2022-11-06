package Java9_4;
import java.util.Scanner;
public class Study4 {
	public static void main(String[] args) {
		Soccer4 soccer = new Soccer4();
	}
}
class Soccer4{
	Scanner sc = new Scanner(System.in);
	String teamName[] = {"토트넘","바르셀로나","레알마드리드",""};
	String playMent[] = {
			"강슛으로 1골을 넣었습니다.",
			"패널티를 성공합니다.",
			"환상적인 중거리슛을 성공! 골~~!!!!!!",
			"자살골을 넣었습니다.",
			"상대의 환상적인 드리블! 1골 먹힘...",
			"슈팅을 넣었지만 실패했습니다.",			
			"공격수가 자빠집니다.",
			"골키퍼의 거미손에 잡혔습니다.",
			"1명이 퇴장을 당했습니다.",
			"심판이 패널티를 선언합니다."			
			
	};
	int win=0;
	int draw=0;
	int loss=0;
	int myScore=0;
	int enermyScore=0;
	
	//상대팀 전적
	int enermyWin[] = new int[3];
	int enermyDraw[] = new int[3];
	int enermyLoss[] = new int[3];
	
	//String myTeamName; //내팀명
	int myWin, myDraw, myLoss;//내팀승무패기록변수
	int vsTeam;//랜덤매칭시 변수
	Soccer4(){
		
		System.out.println("<축구게임을 시작합니다!>\n");
		System.out.print("내팀명입력 :"); teamName[3] = sc.next();
		System.out.println("\n게임을시작합니다.\n");
		
		while(true)
		{
			
			System.out.println("1.게임하기");
			System.out.println("2.랭킹보기");
			System.out.println("3.종료");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) { 	gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {break;}
		}
		
	}
	   
	   void gameStart() {
		   teamRandom();//팀랜덤 정하기
		while(true)
		{
			System.out.println("1.축구시작");
			System.out.println("2.돌아가기");
			System.out.print("선택:"); int sel = sc.nextInt();
			if(sel == 1) {				
				for(int i=0; i<2;i++)
				{
					try { Thread.sleep(300);
					System.out.println("매칭중입니다."); 
					} catch (InterruptedException e) {}
					try { Thread.sleep(400);
					System.out.println("매칭중입니다.."); 
					} catch (InterruptedException e) {}
					try { Thread.sleep(500);
					System.out.println("매칭중입니다..."); 
					} catch (InterruptedException e) {}
				}
				
				//팀랜덤설정
				vsTeam = (int)(Math.random()*3);//0~2상태팀을 랜덤으로설정				 
				
				
				System.out.println();
				System.out.println(teamName[vsTeam]+"팀 과 매칭되었습니다!\n\n");
				
				try { Thread.sleep(1000);
				System.out.println("\n잠시후 축구 시합이 시작됩니다.\n"); 
				} catch (InterruptedException e) {}
				
				try { Thread.sleep(1000);				 
				} catch (InterruptedException e) {}
				int test=0;
				for(int i=0; i<4;i++)
				{
					int rand = (int)(Math.random()*10);					
					if(rand==0)      {ment(playMent[0]);myScore++; score();}
					else if(rand==1) {ment(playMent[1]);myScore++; score();}
					else if(rand==2) {ment(playMent[2]);myScore++; score();}
					else if(rand==3) {ment(playMent[3]);enermyScore++; score();}
					else if(rand==4) {ment(playMent[4]);enermyScore++; score();}
					else if(rand==5) {ment(playMent[5]);}
					else if(rand==6) {ment(playMent[6]);}
					else if(rand==7) {ment(playMent[7]);}
					else if(rand==8) {ment(playMent[8]);}
					else if(rand==9) {ment(playMent[9]);pk();score();}
					
				
					try { Thread.sleep(1000);
						System.out.println();
					} catch (InterruptedException e) {
						System.out.println("중단되는지????");
					}
				}
				
				
				try { Thread.sleep(1000);
				System.out.println("\n[ 경기가 끝났습니다. ]\n"); 
				} catch (InterruptedException e) {}
				
				System.out.println();
				System.out.println("최종 스코어 결과!");
				System.out.println(teamName[3]+" "+myScore+" : "+enermyScore+" "+teamName[vsTeam]+"\n");
				
				//골처리변수 초기화
				myScore=0;
				enermyScore=0;
				
				//경기승패기록을
				if(myScore>enermyScore) {win++;}
				else if(myScore==enermyScore) {draw++;}
				else if(myScore<enermyScore) {loss++;}
				
				//상대팀은 랜덤으로 승리기록
				for(int i=0; i<3;i++)
				{
					int rand = (int)(Math.random()*3);
					if(rand==0) {enermyWin[i]++;}
					else if(rand==1) {enermyDraw[i]++;}
					else if(rand==2) {enermyLoss[i]++;}				
				}				
				
			}
			else if(sel == 2) {break;}
		}		   
		   
	   } //게임시작
	   void ment(String ment) { System.out.println(ment+"\n");   }
	   void teamRandom() {} //팀랜덤
	   void ranking() {
		   System.out.println("<<< 현재 내 팀 기록 >>>");
		   System.out.println("내팀명 : "+teamName[3]);
		   System.out.println("승리    무승부    패배");		    
		   System.out.println(" "+win+"     "+draw+"    "+loss);
		   
		   System.out.println("<<< 다른 팀 기록 >>>");
			for(int i=0; i<3;i++)
			{			
				System.out.println("팀명 : "+teamName[i]);		
				System.out.println("승리    무승부    패배");		    
				   System.out.println(" "+enermyWin[i]+"     "+enermyDraw[i]+"    "+enermyLoss[i]);
			}
		   
	   }//랭킹보기
	   void pk() {
		   try { Thread.sleep(1000);
			System.out.println("\n공격수가 골을 찼습니다!.\n"); 
			} catch (InterruptedException e) {}
		   
		   int sel = (int)(Math.random()*2);
		   if(sel ==0 ) {
			   try { Thread.sleep(1000);
				System.out.println("\n골!!!!!!!!\n"); 
				myScore++;
				} catch (InterruptedException e) {}   
		   }
		   else if(sel ==1 ) {
			   try { Thread.sleep(1000);
				System.out.println("\n골키퍼가 선방했습니다!!!\n"); 
				} catch (InterruptedException e) {}  
		   }
		   
		   

	   }
	   void score() {
		   System.out.println("<<< 현재스코어  >>>");
		   System.out.println(teamName[3]+" "+myScore+" : "+enermyScore+" "+teamName[vsTeam]+"\n");
	   }
	   void save() {}//파일저장
	   void load() {}//파일로드
}





