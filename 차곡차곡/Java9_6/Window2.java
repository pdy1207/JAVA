package Java9_6;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window2 {

	public static void main(String[] args) {
		Score s =new Score();

	}

}
class Score extends Frame implements ActionListener, MouseListener
{
	Font f = new Font("",Font.PLAIN,20);
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Button btn1 = new Button("1점");
	Button btn2 = new Button("2점");
	Button btn3 = new Button("3점");
	Button rest = new Button("리셋");
	
	TextArea context = new TextArea();
	String result="";
	int one=0;
	Score()
	{
		super("점수올리기");
		this.setSize(500,500);
		this.center();
		this.start();
		this.init();
		this.setVisible(true);
		
	}
	void init()
	{
		this.setLayout(null);
		this.add(btn1); this.add(btn2);this.add(btn3);this.add(context); this.add(rest);
		
		rest.setFont(f);rest.setBounds(200,30,100,50);
		btn1.setFont(f);btn1.setBounds(100,100,100,50);
		btn2.setFont(f);btn2.setBounds(210,100,100,50);
		btn3.setFont(f);btn3.setBounds(320,100,100,50);
		
		context.setFont(f);context.setBounds(100,200,300,250);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	
	
	void start()
	{
		rest.addMouseListener(this);
		btn1.addMouseListener(this);
		btn2.addMouseListener(this);
		btn3.addMouseListener(this);
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
	
	
	public void mousePressed(MouseEvent e) {
//	
	}
	
	public void mouseReleased(MouseEvent e) {
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		
		
		if(e.getSource()==btn1)
		{
			context.setText("현재점수 : "+one);
			one++;
			
		}
		if(e.getSource()==btn2)
		{
			context.setText("현재점수 : "+one);
			one+=2;
		}
		if(e.getSource()==btn3)
		{
			context.setText("현재점수 : "+one);
			one+=3;
		}
		
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}