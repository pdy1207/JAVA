package Java9_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window6 {

	public static void main(String[] args) {
		namelist n = new namelist();

	}

}
class namelist extends Frame implements ActionListener 
{
	
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label name = new Label("이름 : ");
	Label tot = new Label("결과 : ");
	Label looo = new Label("대기중.....");
	Label tot2 = new Label("결과 : ");
	TextField username = new TextField();
	TextField usertot = new TextField();
	Font f = new Font("",Font.BOLD, 20);
	Button btn = new Button("출력");
	namelist()
	{
		super("이벤트 처리 연습");
		this.setVisible(true);
		this.init();
		this.setSize(400, 400);
		this.center();
		this.start();
	}
	
	void start() //x표 시 화면 꺼지게 하는 기능
	{
		
		btn.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}
		
	public void actionPerformed(ActionEvent e) //println자바 입력 그리고 화면에 바뀌게  
	{ 
		String name = username.getText(); //변수선언 한 후 getText
		
		System.out.println(name);
		usertot.setText(name);
		looo.setText(name);
	}
	
	void init() //화면 배치
	{
		this.setLayout(null);
		this.add(name); this.add(tot); this.add(looo); this.add(tot2);
		this.add(username); this.add(usertot);this.add(btn);
	
		name.setFont(f); name.setBounds(80, 85, 100, 30);
		username.setFont(f); username.setBounds(180, 85, 150, 30);
		
		btn.setFont(f); btn.setBounds(140,130, 100, 30);
		
		tot.setFont(f); tot.setBounds(80, 200, 100, 30);
		looo.setFont(f); looo.setBounds(180, 200, 100, 30);
		
		tot2.setFont(f); tot2.setBounds(80, 250, 100, 30);
		usertot.setFont(f); usertot.setBounds(180, 250, 150, 30);
		
	}
	void center() //화면 중앙
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}
}