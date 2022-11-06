package Java9_5;

import java.awt.*;

public class Window2 {

	public static void main(String[] args) {
		Login f = new Login();

	}

}
class Login extends Frame 
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	private Label lbTitle = new Label("로그인");
	private Label lbMent1 = new Label("아이디 : "); 
	private Label lbMent2 = new Label("비밀번호 :"); 
	private TextField id = new TextField(30);
	private TextField pw = new TextField(30);
	Button btnlogin = new Button("로그인"); 
	Button btnpw = new Button("회원가입");
	
	Login()
	{
		super("로그인연습");
		this.setSize(400,500);
		this.center(); //중앙배치
		this.setVisible(true); //화면에 나타나라.
		this.init();
		
		
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
	void init()
	{	
		Font f = new Font("", Font.BOLD, 20);
		Font f3 = new Font("", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbTitle); lbTitle.setFont(f3); 
		lbTitle.setBounds(150,50,100,30);
//		setBounds(x, y, width, height);;
		
		
		this.add(lbMent1); lbMent1.setFont(f); 
		lbMent1.setBounds(50,150,100,30);
		
		this.add(id); id.setFont(f);
		id.setBounds(180, 150, 200, 30);
		
		this.add(lbMent2); lbMent2.setFont(f); 
		lbMent2.setBounds(50,200,100,50);
		
		this.add(pw); pw.setFont(f);
		pw.setBounds(180, 210, 200, 30);
		
		
		this.add(btnlogin); btnlogin.setFont(f); 
		btnlogin.setBounds(150,280,100,50);
		
		this.add(btnpw); btnpw.setFont(f); 
		btnpw.setBounds(130,350,150,50);
		
		
		
	}
}