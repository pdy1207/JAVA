package Database;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Member4 extends Frame implements ActionListener{
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font f = new Font("", Font.BOLD, 20);
	Font f3 = new Font("", Font.BOLD, 30);
	
	Label lbmain = new Label("메인화면");
	Button btn1 = new Button("회원조회");
	Button btn2 = new Button("회원수정");
	Button btn3 = new Button("회원삭제");
	Button btn4 = new Button("회원가입");
	Button btn5 = new Button("종료");
	Member4()
	{
		super("메인화면");
		this.setSize(400,600);
		this.center(); //중앙배치
		this.setVisible(true);
		this.init();
		this.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			Member2 m2 = new Member2(); //회원조회
		}
		if(e.getSource()==btn2) {
			Member6 m6 = new Member6(); //회원수정
		}
		if(e.getSource()==btn3) {
			Member5 m5 = new Member5(); //로그인
		}
		if(e.getSource()==btn4) {
			Member1 m = new Member1();	//회원삭제
		}
		if(e.getSource()==btn5) {
			System.exit(-1);		//종료
		}
		
	}
	
	void start() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	void init()
	{	
		this.setLayout(null);
		
		this.add(lbmain); lbmain.setFont(f3);
		lbmain.setBounds(140, 70,250,50);
		
		this.add(btn1); btn1.setFont(f); 
		btn1.setBounds(80,150,250,50);

		this.add(btn2); btn2.setFont(f); 
		btn2.setBounds(80,200,250,50);
		this.add(btn3); btn3.setFont(f); 
		btn3.setBounds(80,250,250,50);
		this.add(btn4); btn4.setFont(f); 
		btn4.setBounds(80,300,250,50);
		this.add(btn5); btn5.setFont(f); 
		btn5.setBounds(80,400,250,50);
	}
}
