package Java9_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class Window1 {

	public static void main(String[] args) {
		member m = new member();
	}

}
class member extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font f = new Font("",Font.PLAIN,20);
	Label name = new Label("�̸� : ");
	Label pho = new Label("���� : ");
	Label add = new Label("�ּ� : ");
	Label mem = new Label("ȸ������Ʈ");
	Label ment = new Label("�˸�");
	TextField username = new TextField();
	
	TextField userpho = new TextField();
	TextField useradd = new TextField();
	Button btn = new Button("�߰��ϱ�");
	TextArea memlist = new TextArea();
	String result ="";
	int cou=0;
	Button btn2 = new Button("���� ����");
	Button btn3 = new Button("���� �б�");
	
	
	
	member()
	{
		super("ȸ������Ʈ �����");
		this.setSize(900,400);
		this.setVisible(true);
		this.center(); //setSize ������ ���ƾ���.
		this.start();
		this.init();
		
	}
	void init()
	{
		this.setLayout(null);
		this.add(name); this.add(pho); this.add(add); this.add(mem); 
		this.add(username); this.add(userpho); this.add(useradd); this.add(btn); this.add(memlist);
		this.add(ment); this.add(btn2); this.add(btn3);
		
		name.setFont(f);name.setBounds(50,50,70,50); 
		pho.setFont(f);pho.setBounds(50,100,70,50);
		add.setFont(f);add.setBounds(50,150,70,50);
		
		username.setFont(f);username.setBounds(150,60,150,30);
		userpho.setFont(f);userpho.setBounds(150,110,150,30);
		useradd.setFont(f);useradd.setBounds(150,160,150,30);
		
		btn.setFont(f);btn.setBounds(130,250,150,30);
		ment.setFont(f);ment.setBounds(50,300,300,30);
		
		mem.setFont(f);mem.setBounds(350,50,200,50); 
		memlist.setFont(f);memlist.setBounds(350,100,300,250);
		
		btn2.setFont(f);btn2.setBounds(700,100,100,50);
		btn3.setFont(f);btn3.setBounds(700,200,100,50);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)
		{
		String user = username.getText();
		String userp = userpho.getText();
		String usera = useradd.getText();
		
		
		//����üũ
		if(user.equals(""))
		{
			ment.setText("ȸ���̸��� �־��ּ���."); return;
		}
		if(userp.equals(""))
		{
			ment.setText("ȸ����ȣ�� �־��ּ���."); return;
		}
		if(usera.equals(""))
		{
			ment.setText("ȸ���ּ��� �־��ּ���."); return;
		}
		result += cou+"�� : "+user+"/"+userp+"/"+usera+"\n";
		memlist.setText(result);
		cou++; // �Ѹ�����
		
		
		//�ʱ�ȭ
		username.setText("");
		userpho.setText("");
		useradd.setText("");
		}
		
		else if(e.getSource()==btn2)
		{
			
			save();
		}
		else if(e.getSource()==btn3)
		{
			loadDataInit();
		}
		
	}
	void save() {
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\Friends.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            //����
            bufferedWriter.write(result);//������
            bufferedWriter.newLine(); 
            bufferedWriter.close();           
            memlist.setText("");
            result="";
        }catch (IOException e) {
            System.out.println(e);
        }
		
		
	}
	void loadDataInit()
	{		
		try{
            //���� ��ü ����
            File file = new File("C:\\aaa\\work\\Friends.txt");
            //�Է� ��Ʈ�� ����
            FileReader filereader = new FileReader(file);
            //�Է� ���� ����
            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";            
            String data="";
            cou =0;
            while((line = bufReader.readLine()) != null){
            	 data+=line+"\n";
            	 result += line+"\n";
            	 cou++;
            }            
            memlist.setText(data);
            
            bufReader.close();
        }catch (FileNotFoundException e) { 
        }catch(IOException e){           
        }
	}
	void start() //������ xâ
	{
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		btn.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	
	void center() //ȭ�� ����
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	
	
}