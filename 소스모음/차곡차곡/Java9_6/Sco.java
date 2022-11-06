package Java9_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sco {
	public static void main(String[] args) {	
		Soccer2 s = new Soccer2();
	}
}
class Soccer2 extends Frame implements ItemListener, ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);
	
	int useTotGame=10; //�Ѱ���Ƚ��
	int shoot2=2;//����� 2ȸ ����
	int shoot3=1;//�г�Ƽ�� 1ȸ����
	
	Label lbList = new Label("�౸��������Ʈ");
	Label lbMember = new Label("�౸����:���ô��..");
	Label lbResult = new Label("���:�����..");
	Label lbTot = new Label("������:");
	Label lbTotCnt = new Label("0 ����");
	Label lbShoot = new Label("������:");
	Label lbShootCnt = new Label("0 ȸ");
	Label lbFail = new Label("������:");
	Label lbFailCnt = new Label("0 ȸ");
	Label lbUseTot = new Label("�Ѱ��Ӱ���Ƚ��:"+useTotGame+"ȸ");
	Button btnShoot1 = new Button("�߰Ÿ���");
	Button btnShoot2 = new Button("�����");
	Button btnShoot3 = new Button("�г�Ƽ��");
	Button btnInit = new Button("�ʱ�ȭ");
	List li = new List(3, false);
	
	String ment1[]= {"�߰Ÿ����� ����!","�߰Ÿ��� ����..."};			
	String ment2[]= {"������� ����!","����� ����..."};
	String ment3[]= {"�г�Ƽ���� ����!","�г�Ƽ�� ����..."};
	
	int tot=0, ok=0, fail=0; //����ó�� ������ ������
	String name="";//������ �౸�����̸�.
	
	Button btn1 = new Button("��������");
	Button btn2 = new Button("�������");
	
	
	Soccer2()
	{
		super("�౸����ver0.2");
		this.setSize(800
				,400);
		this.center();
		this.init();
		this.start();
		this.setVisible(true);
		
	}
	void init()
	{
		this.setLayout(null);
		this.add(lbList);		this.add(lbMember);			this.add(btn1);
		this.add(lbTot);		this.add(lbTotCnt);			this.add(btn2);
		this.add(lbShoot);		this.add(lbShootCnt);
		this.add(lbResult);		this.add(lbFail);
		this.add(lbFailCnt);		this.add(btnShoot1);
		this.add(btnShoot2);		this.add(btnShoot3);
		this.add(btnInit);			this.add(lbUseTot);
		
		li.add("�����");
		li.add("�޽�");
		li.add("ȣ����");
		this.add(li);
		lbList.setBounds(50, 50, 150, 30); lbList.setFont(font20);
		li.setBounds(50, 100, 150, 200); li.setFont(font20);
		lbUseTot.setBounds(50, 330, 250, 30); lbUseTot.setFont(font20);
		
		
		lbMember.setBounds(250, 50, 220, 30); lbMember.setFont(font20);
		btnShoot1.setBounds(250, 100, 100, 30); btnShoot1.setFont(font20);
		btnShoot2.setBounds(370, 100, 100, 30); btnShoot2.setFont(font20);
		btnShoot3.setBounds(490, 100, 100, 30); btnShoot3.setFont(font20);
		btnInit.setBounds(490, 50, 100, 30); btnInit.setFont(font20);
		
		btn1.setBounds(650, 50, 100, 80); btn1.setFont(font20);
		btn2.setBounds(650, 180, 100, 80); btn2.setFont(font20);
		
		lbResult.setBounds(250, 150, 250, 30); lbResult.setFont(font20);
		lbTot.setBounds(250, 200, 70, 30); lbTot.setFont(font20);
		lbTotCnt.setBounds(330, 200, 70, 30); lbTotCnt.setFont(font20);
		
		lbShoot.setBounds(250, 250, 70, 30); lbShoot.setFont(font20);
		lbShootCnt.setBounds(330, 250, 70, 30); lbShootCnt.setFont(font20);
		lbFail.setBounds(410, 250, 70, 30); lbFail.setFont(font20);
		lbFailCnt.setBounds(490, 250, 70, 30); lbFailCnt.setFont(font20);
	}
	
	
	
	
	
	
	void start() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		li.addItemListener(this);
		btnShoot1.addActionListener(this);
		btnShoot2.addActionListener(this);
		btnShoot3.addActionListener(this);
		btnInit.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	
	public void itemStateChanged(ItemEvent e) {
		name = li.getSelectedItem();
		lbMember.setText("�౸����:"+name);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInit)
		{
			//������ ���� �ʱ�ȭ
			tot=0; 
			ok=0;
			fail=0;
			name="";
			shoot2=2;//���2ȸ����
			shoot3=1;//�г�Ƽ1ȸ����
			useTotGame=10;//����Ƚ�� �ٽ� 10�� ����
			//�����ִ� ���̾ƿ��� �ʱ�ȭ
			lbTotCnt.setText("0 ȸ");
			lbShootCnt.setText("0 ȸ");
			lbFailCnt.setText("0 ȸ");
			lbUseTot.setText("�Ѱ��Ӱ���Ƚ��:"+useTotGame+"ȸ");
			lbResult.setText("�ʱ�ȭ�Ǿ����ϴ�.");
			lbMember.setText("�౸����:���ô��..");
			return;
		}
		if(e.getSource()==btn1)
			
		{save();}
	if(e.getSource()==btn2)
		{loadDataInit();}
	
		if(name.equals(""))
		{
			lbResult.setText("���������ÿ�.");
			return;
		}
		if(e.getSource()==btn1)	
			
		{save();}
		
		//������ �����ϱ����� �Ѱ���Ƚ���� ����!
		if(useTotGame==0)
		{
			lbResult.setText("���� 10ȸ ��� �Ͽ����ϴ�.");
			return;
		}
		
		
		if(e.getSource()==btnShoot1) 	  {
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0 || num==1 || num==2)
			{
				lbResult.setText(ment1[0]);
				ok++;
			}
			else
			{
				lbResult.setText(ment1[1]);
				fail++;
			}
			useTotGame--;
			
		}
		else if(e.getSource()==btnShoot2) {
			if(shoot2==0)
			{
				lbResult.setText("���Ƚ���� ��� ���!");
				return;
			}
			
			
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0 || num==1 || num==2 || num==3 || num==4)
			{
				lbResult.setText(ment2[0]);
				ok++;
			}
			else
			{
				lbResult.setText(ment2[1]);
				fail++;
			}
			useTotGame--;
			shoot2--;//���Ƚ������
	
		}
		else if(e.getSource()==btnShoot3) {
			if(shoot3==0)
			{
				lbResult.setText("�г�ƼȽ���� ��� ���!");
				return;
			}
			
			
			tot++;
			int num = (int)(Math.random()*10);
			if(num==0)
			{
				lbResult.setText(ment3[1]);
				fail++;
			}
			else
			{
				lbResult.setText(ment3[0]);
				ok++;
			}
			useTotGame--;
			shoot3--;
			
		}
		
		
		if(ok==5)
		{
			final Dialog dlg = new Dialog(this, "���ϸ�Ʈ5���̻�!", true);
			Label lbCong = new Label("��ũ�����̼�~!",Label.CENTER);
			dlg.add(lbCong); lbCong.setFont(font30);
			Button bt = new Button("Ȯ��");			
			

			dlg.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg.setVisible(false);
				} 
			});
			dlg.setSize(300, 200);
			dlg.setLocation(800, 500);
			dlg.setVisible(true);
			
		}
	
		lbUseTot.setText("�Ѱ��Ӱ���Ƚ��:"+useTotGame+"ȸ");
		lbTotCnt.setText(tot+"ȸ");
		lbShootCnt.setText(ok+"ȸ");
		lbFailCnt.setText(fail+"ȸ");
		
	}
	void save()
	{
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\scr.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
           
            Date nowDate = new Date();       
    		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");      
    		String now = simpleDateFormat.format(nowDate);
    		bufferedWriter.write(name+"/"+tot+"ȸ ����"+"/"+"������ : "+ok+"/"+"������ : "+fail+" "+now);
            
            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            
        }catch (IOException e) {
            System.out.println(e);
        }
	}
	void loadDataInit() 
	{		
		Date nowDate = new Date();       
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");      
		String now = simpleDateFormat.format(nowDate);
		
        final Dialog scr = new Dialog(this, "���", true);
		TextArea lbCong = new TextArea();
		scr.add(lbCong); lbCong.setFont(font30);
		lbCong.setText(name+"/"+tot+"ȸ ����"+"/"+"������ : "+ok+"/"+"������ : "+fail+" "+now);
		scr.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				scr.setVisible(false);
			}
		});
		scr.setSize(800, 500);
		scr.setLocation(800, 500);
		scr.setVisible(true);
		
	}
}












