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
public class Study5 {
	public static void main(String[] args) {
		Soccer5 soccer = new Soccer5();
	}
}
class Soccer5{
	Scanner sc = new Scanner(System.in);
	String teamName[] = {"��Ʈ��","�ٸ����γ�","���˸��帮��",""};
	String playMent[] = {
			"�������� 1���� �־����ϴ�.",
			"�г�Ƽ�� �����մϴ�.",
			"ȯ������ �߰Ÿ����� ����! ��~~!!!!!!",
			"�ڻ���� �־����ϴ�.",
			"����� ȯ������ �帮��! 1�� ����...",
			"������ �־����� �����߽��ϴ�.",			
			"���ݼ��� �ں����ϴ�.",
			"��Ű���� �Ź̼տ� �������ϴ�.",
			"1���� ������ ���߽��ϴ�.",
			"������ �г�Ƽ�� �����մϴ�."			
			
	};
	int win=0;
	int draw=0;
	int loss=0;
	int myScore=0;
	int enermyScore=0;
	
	//����� ����
	int enermyWin[] = new int[3];
	int enermyDraw[] = new int[3];
	int enermyLoss[] = new int[3];
	
	//String myTeamName; //������
	int myWin, myDraw, myLoss;//�����¹��б�Ϻ���
	int vsTeam;//������Ī�� ����
	Soccer5(){
		
		System.out.println("<�౸������ �����մϴ�!>\n");
		System.out.print("�������Է� :"); teamName[3] = sc.next();
		System.out.println("\n�����������մϴ�.\n");
		
		while(true)
		{
			
			System.out.println("1.�����ϱ�");
			System.out.println("2.��ŷ����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) { 	gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {save();break;}
		}
		
	}
	   
	   void gameStart() {
		   teamRandom();//������ ���ϱ�
		while(true)
		{
			System.out.println("1.�౸����");
			System.out.println("2.���ư���");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) {				
				for(int i=0; i<2;i++)
				{
					try { Thread.sleep(300);
					System.out.println("��Ī���Դϴ�."); 
					} catch (InterruptedException e) {}
					try { Thread.sleep(400);
					System.out.println("��Ī���Դϴ�.."); 
					} catch (InterruptedException e) {}
					try { Thread.sleep(500);
					System.out.println("��Ī���Դϴ�..."); 
					} catch (InterruptedException e) {}
				}
				
				//����������
				vsTeam = (int)(Math.random()*3);//0~2�������� �������μ���				 
				
				
				System.out.println();
				System.out.println(teamName[vsTeam]+"�� �� ��Ī�Ǿ����ϴ�!\n\n");
				
				try { Thread.sleep(1000);
				System.out.println("\n����� �౸ ������ ���۵˴ϴ�.\n"); 
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
						System.out.println("�ߴܵǴ���????");
					}
				}
				
				
				try { Thread.sleep(1000);
				System.out.println("\n[ ��Ⱑ �������ϴ�. ]\n"); 
				} catch (InterruptedException e) {}
				
				System.out.println();
				System.out.println("���� ���ھ� ���!");
				System.out.println(teamName[3]+" "+myScore+" : "+enermyScore+" "+teamName[vsTeam]+"\n");			

				
				//�����б����
				if(myScore>enermyScore) {win++;}
				else if(myScore==enermyScore) {draw++;}
				else if(myScore<enermyScore) {loss++;}
				
				//��ó������ �ʱ�ȭ
				myScore=0;
				enermyScore=0;
				
				//������� �������� �¸����
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
		   
	   } //���ӽ���
	   void ment(String ment) { System.out.println(ment+"\n");   }
	   void teamRandom() {} //������
	   void ranking() {
		   load();
//		   System.out.println("<<< ���� �� �� ��� >>>");
//		   System.out.println("������ : "+teamName[3]);
//		   System.out.println("�¸�    ���º�    �й�");		    
//		   System.out.println(" "+win+"     "+draw+"    "+loss);
//		   
//		   System.out.println("<<< �ٸ� �� ��� >>>");
//			for(int i=0; i<3;i++)
//			{			
//				System.out.println("���� : "+teamName[i]);		
//				System.out.println("�¸�    ���º�    �й�");		    
//				   System.out.println(" "+enermyWin[i]+"     "+enermyDraw[i]+"    "+enermyLoss[i]);
//			}
		   
	   }//��ŷ����
	   void pk() {
		   try { Thread.sleep(1000);
			System.out.println("\n���ݼ��� ���� á���ϴ�!.\n"); 
			} catch (InterruptedException e) {}
		   
		   int sel = (int)(Math.random()*2);
		   if(sel ==0 ) {
			   try { Thread.sleep(1000);
				System.out.println("\n��!!!!!!!!\n"); 
				myScore++;
				} catch (InterruptedException e) {}   
		   }
		   else if(sel ==1 ) {
			   try { Thread.sleep(1000);
				System.out.println("\n��Ű�۰� �����߽��ϴ�!!!\n"); 
				} catch (InterruptedException e) {}  
		   }
		   
		   

	   }
	   void score() {
		   System.out.println("<<< ���罺�ھ�  >>>");
		   System.out.println(teamName[3]+" "+myScore+" : "+enermyScore+" "+teamName[vsTeam]+"\n");
	   }
	   void save() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\score.txt");
	            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));

	          //���� �ð����ϱ� �ʱ���...
	        	Date nowDate = new Date();       
	    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
	    		String now = simpleDateFormat.format(nowDate);
	    		
	            bufferedWriter.write("���� ��� ����:"+now);
	            bufferedWriter.newLine(); 
	            bufferedWriter.write("<<< ���� �� �� ��� >>>");
	            bufferedWriter.newLine(); 
	            bufferedWriter.write("������ : "+teamName[3]);
	            bufferedWriter.newLine();	  		   
	            bufferedWriter.write("�¸�    ���º�    �й�");
	            bufferedWriter.newLine();
	            bufferedWriter.write(" "+win+"     "+draw+"    "+loss);
	            bufferedWriter.newLine();	  		   
	            bufferedWriter.write("<<< �ٸ� �� ��� >>>");
	  			for(int i=0; i<3;i++)
	  			{			
	  				bufferedWriter.write("���� : "+teamName[i]);
	  				bufferedWriter.newLine();
	  				bufferedWriter.write("�¸�    ���º�    �й�");
	  				bufferedWriter.newLine();
	  				bufferedWriter.write(" "+enermyWin[i]+"     "+enermyDraw[i]+"    "+enermyLoss[i]);
	  				bufferedWriter.newLine();
	  			}            	             
	            bufferedWriter.close();           
	            
	        }catch (IOException e) {
	            System.out.println(e);
	        }
		   
		   
	   }//��������
	   void load() {
		   try{
	            //���� ��ü ����
	            File file = new File("C:\\aaa\\work\\score.txt");
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
		   
		   
	   }//���Ϸε�
}





