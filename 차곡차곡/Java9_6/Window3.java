package Java9_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window3 {

	public static void main(String[] args) {

		Sasu s = new Sasu();
	}

}
class Sasu extends Frame implements ItemListener, MouseListener, ActionListener
{
	Font f = new Font("",Font.PLAIN,20);
	Font f2 = new Font("",Font.BOLD,20);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	List li = new List(3,false);
	Label name = new Label("��������Ʈ");
	Label username = new Label("�౸ ���� :");
	Label user = new Label("");
	Label tot = new Label("��� :");
	Label looo1 = new Label("�����.....");
	Label looo2 = new Label("�����...");
	Label looo3 = new Label("�����.......");
	Label looo4 = new Label("�����.......");
	Label usertot = new Label("������ : ");
	Label game1 = new Label("0����");
	Label game2 = new Label("������ : ");
	Label game3 = new Label("������ : ");
	Label game4 = new Label("0ȸ");
	Label game5 = new Label("0ȸ");
	
	Button btn1 = new Button("�߰Ÿ� ��");
	Button btn2 = new Button("���");
	Button btn3 = new Button("���Ƽ ��");
	String ments1[] = {"�߰Ÿ� ���� ����!","�߰Ÿ� �� ����!"}; 
	String ments2[] = {"����� ����!","����� ����!"};
	String ments3[] = {"�г�Ƽ ����!","�г�Ƽ ����"};
	int to=0, jo=0,fel=0; //��Ż ���� �ö� �����
	
	Sasu()
	{
		super("�౸");
		this.setSize(700,400);
		this.center();
		this.start();
		this.init();
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(li); this.add(name); this.add(username); 
		this.add(user); this.add(btn1); this.add(btn2); this.add(btn3);
		this.add(tot); 
		this.add(looo1); this.add(looo2); this.add(looo3); this.add(looo4);
		
		this.add(usertot); 
		this.add(game1); this.add(game2);this.add(game3);
		this.add(game4); this.add(game5);
		
		name.setFont(f);name.setBounds(100,50,100,50);
		username.setFont(f2);username.setBounds(250,60,130,50);
		user.setFont(f2);user.setBounds(390,60,100,50);
		
		btn1.setFont(f);btn1.setBounds(250,120,100,50);
		btn2.setFont(f);btn2.setBounds(370,120,100,50);
		btn3.setFont(f);btn3.setBounds(500,120,100,50);
		
		tot.setFont(f);tot.setBounds(250,200,100,50);
		looo1.setFont(f);looo1.setBounds(350,200,500
				,50);
		looo2.setFont(f);looo2.setBounds(350,200,100,50);
		looo3.setFont(f);looo3.setBounds(350,200,100,50);
		looo4.setFont(f);looo4.setBounds(350,200,100,50);
		
		usertot.setFont(f);usertot.setBounds(250,250,100,50);
		game1.setFont(f);game1.setBounds(350,250,100,50);
		
		game2.setFont(f);game2.setBounds(250,300,100,50);
		game4.setFont(f);game4.setBounds(350,300,100,50);
		game3.setFont(f);game3.setBounds(400,300,100,50);
		game5.setFont(f);game5.setBounds(500,300,100,50);
		
		li.setFont(f);
		li.add("�����");
		li.add("�޽�");
		li.add("������"); 
		li.setBounds(100,100,100,200);
		
	}
	void start()
	{
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		li.addMouseListener(this);
		li.addItemListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
	
	public void itemStateChanged(ItemEvent e) {
		
		
	}
	
	public void mouseClicked(MouseEvent arg0) {
		String list = li.getSelectedItem();
		user.setText(list);
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		String list = li.getSelectedItem();
		user.setText(list);
		
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		
		String na = li.getSelectedItem();
		

	}
	
	
}