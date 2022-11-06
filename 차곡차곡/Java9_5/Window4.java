package Java9_5;

import java.awt.*;

public class Window4 {

	public static void main(String[] args) {
		joindeletion i  = new joindeletion();

	}

}

class joindeletion extends Frame
{
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label Title = new Label("회원삭제화면");
	
	Label userid= new Label("아이디 : ");
	
	Label userlist = new Label("회원리스트");
	
	Button tot = new Button("전체보기");
	Button select = new Button("대상검색");
	
	TextField Id = new TextField(30);
	TextArea member = new TextArea();
	
	
	joindeletion()
	{
		super("회원삭제화면");
		this.setSize(600,700);
		this.setVisible(true);
		this.init();
		this.center();
		
		
	}
	void init()
	{
		Font f = new Font("",Font.BOLD,30);
		Font f2 = new Font("",Font.BOLD,20);
		
		this.setLayout(null); //레이아웃을 널로한다. 내가 직접배치하기위해서 레이아웃 미적용
		
		
		//윈도우에 객체 추가/ 내부적으로 포함을 먼저 시켜야함.
		//this.add(Title) , this.add(userid) ....
		this.add(Title); Title.setFont(f);
		Title.setBounds(150, 50, 200, 50);
		
		this.add(userid); userid.setFont(f2);
		userid.setBounds(70, 150, 100, 50);
		
		
		this.add(Id); Id.setFont(f2);
		Id.setBounds(190, 160, 160, 30);
		
		this.add(select); select.setFont(f2);
		select.setBounds(370, 160, 130, 30);
		
		this.add(tot); tot.setFont(f2);
		tot.setBounds(370, 200, 130, 30);
		
		this.add(userlist); userlist.setFont(f);
		userlist.setBounds(60, 300, 160, 30);
		
		this.add(member); member.setFont(f2);
		member.setBounds(50, 350, 500, 200);
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
