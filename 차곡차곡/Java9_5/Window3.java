package Java9_5;

import java.awt.*;
public class Window3 {

	public static void main(String[] args) {
		Join j = new Join();

	}

}
class Join extends Frame
{
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label main = new Label("ȸ������");
	
	Label id = new Label("���̵� : ");
	TextField userid = new TextField(30); 
	
	Label pw = new Label("��й�ȣ : ");
	TextField userpw = new TextField(30);
	
	Label pwin = new Label("���Ȯ�� : ");
	TextField uwerpwin = new TextField(30);
	
	Label name = new Label("�̸� : ");
	TextField username = new TextField(30);
	
	Label pho = new Label("���� : ");
	TextField userpho = new TextField(30);
	
	Button btnlogin = new Button("���ԿϷ�");
	
	Button overlap = new Button("�ߺ�üũ");
	Join()
	{
		super("ȸ������");
		this.setSize(500, 600);
		this.center(); //�߾�
		this.setVisible(true);
		this.init();
	}
	
	void init()
	{
		Font f = new Font("",Font.BOLD,20);
		Font f2 = new Font("",Font.BOLD,40);
		
		this.setLayout(null);
		
		this.add(main); main.setFont(f2);
		main.setBounds(120, 80, 200, 50);
		
		this.add(id); id.setFont(f);
		id.setBounds(30, 180, 100, 50);
		
		this.add(pw); pw.setFont(f);
		pw.setBounds(30, 230, 100, 50);
		
		this.add(name); name.setFont(f);
		name.setBounds(30, 280, 100, 50);
		
		this.add(pho); pho.setFont(f);
		pho.setBounds(30, 330, 100, 50);
		
		this.add(btnlogin);btnlogin.setFont(f);
		btnlogin.setBounds(150,400,100,50);
		
		this.add(userid); userid.setFont(f);
		userid.setBounds(150, 180, 130, 40);
		
		this.add(userpw); userpw.setFont(f);
		userpw.setBounds(150, 230, 130, 40);
		
		this.add(username); username.setFont(f);
		username.setBounds(150, 280, 130, 40);
		
		this.add(userpho); userpho.setFont(f);
		userpho.setBounds(150, 330, 130, 40);
		
		this.add(overlap); overlap.setFont(f);
		overlap.setBounds(300, 180, 130, 40);
		
	}
	
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
}