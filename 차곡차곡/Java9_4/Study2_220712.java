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
	String TeamName[] = {"��Ʈ��","�ٸ����γ�","���˸��帮��"};
	String playMent[] = {
			"�����մϴ�",
			"1���� �־����ϴ�.",
			"������ �־����� �����߽��ϴ�.",
			"���񰡳����ֳ׿�.",
			"���ݼ��� �ں����ϴ�.",
			"��Ű�۰������մϴ�.",
			"�г�Ƽ�� �����մϴ�.",
			"�г�Ƽ�� �����մϴ�.",
			"�ڻ���� �־����ϴ�.",
			"1���� ������ ���߽��ϴ�.",
	};
	
	String myTeamName; //������
	int win,draw,loss,tot;
	Soccer(){
		System.out.println("<�౸������ �����մϴ�!>\n");
		System.out.print("�������Է� :"); myTeamName = sc.next();
		System.out.println("\n�����������մϴ�.\n");
		tot++;
		while(true)
		{
			System.out.println("1.�����ϱ�");
			System.out.println("2.��ŷ����");
			System.out.println("3.����");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) { gameStart();}
			else if(sel == 2) {ranking();}
			else if(sel == 3) {break;}save();//����ó��}
		}
		
	}
	   
	   void gameStart() {
//		   teamRandom();
		   //������ ���ϱ�
		while(true)
		{
			System.out.println("1.�౸����");
			System.out.println("2.���ư���");
			System.out.print("����:"); int sel = sc.nextInt();
			if(sel == 1) {
							for(int i=0; i<5;i++)
							{
								try { Thread.sleep(500);
								System.out.println("��ø� ��ٷ��ּ���. �� ��Ī �� �Դϴ�.");
								} catch (InterruptedException e) {}
							}
								try { Thread.sleep(1000);
									int team = (int)(Math.random()*3);
									System.out.println("\n"+TeamName[team]+" �� "+myTeamName +" ��Ī�Ǿ����ϴ�.\n");
								} catch (InterruptedException e) {}
							for(int i=3; i>0;i--)
							{
								try { Thread.sleep(700);
								System.out.println("������ "+i+"�� �� ���۵˴ϴ�.");
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
							
						System.out.println("\n�� "+tot+"�� ��:"+win+"/ ��:"+draw+"/ ��:"+loss+"\n");
			}
			else if(sel == 2) {
				save(); break;
			}
		}
		   
	   } 
	   void ment(String ment) { System.out.println(ment);  }//���Ӹ�Ʈ
	   void ranking() {
		   System.out.println("�� ���� : ");myTeamName = sc.next();
		   System.out.println("�¸� : "+win);
		   System.out.println("���º� : "+draw);
		   System.out.println("�й� : "+loss);
		   load();
	   }//��ŷ����
	   void save() {
		   if(myTeamName.equals(myTeamName))
		   {
			   try{
	           //���� ��ü ����
	           File file = new File("C:\\aaa\\work\\score.txt");
	           BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
	
	         //���� �ð����ϱ� �ʱ���...
	       	Date nowDate = new Date();       
	   		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");      
	   		String now = simpleDateFormat.format(nowDate);
	   		
	           //����
	           bufferedWriter.write("�� ���� : "+tot+" ���� : "+now);//������
	           bufferedWriter.newLine(); 
	           bufferedWriter.write("�� "+tot+"�� ��:"+win+"/ ��:"+draw+"/ ��:"+loss);//������
	           bufferedWriter.newLine(); 
	           bufferedWriter.close();           
	           
	       }catch (IOException e) {
	           System.out.println(e);
	       }
		   }
	   	}//��������
	   void load() {try{
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
       }}//���Ϸε�
}





