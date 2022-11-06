package Java9_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window7_ev {

	public static void main(String[] args) {
		calculator c = new calculator();

	}

}
class calculator extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Label frist = new Label("첫번째 수 :");
	Label seco = new Label("두번째 수 :");
	TextField fri = new TextField();
	TextField se = new TextField();
	
	Button btn = new Button("+");
	Button btn1 = new Button("-");
	Button btn2 = new Button("*");
	Button btn3 = new Button("/");
	Label tot = new Label("결과 : ");
	TextField resl = new TextField();
	Label bel = new Label("");
	calculator()
	{
		
		super("이벤트 연습");
		this.init();
		this.start();
		this.setSize(500,500);
		this.center();
	}
	void init()
	{
		this.setLayout(null);
		Font f = new Font("",Font.PLAIN,20);
		
		this.add(frist); this.add(seco); 
		this.add(fri); this.add(se);
		
		this.add(btn); this.add(btn1);
		this.add(btn2); this.add(btn3);
		this.add(tot); this.add(resl); this.add(bel);
		
		frist.setFont(f);frist.setBounds(100,100,100,50);
		seco.setFont(f);seco.setBounds(100,150,100,50);
		
		fri.setFont(f);fri.setBounds(210,110,150,30);
		se.setFont(f);se.setBounds(210,160,150,30);
		
		btn.setFont(f);btn.setBounds(100,210,50,30);
		btn1.setFont(f);btn1.setBounds(180,210,50,30);
		btn2.setFont(f);btn2.setBounds(260,210,50,30);
		btn3.setFont(f);btn3.setBounds(340,210,50,30);
		
		tot.setFont(f);tot.setBounds(100,300,80,30);
		resl.setFont(f);resl.setBounds(190,300,200,30);
		
		bel.setFont(f);bel.setBounds(100,350,250,30);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String su1 = fri.getText();
		String su2 = se.getText(); 
		//공백처리
		if(su1.equals(""))
		{
			bel.setText("첫번째 수를 입력하시오.");return;
		}
		else if(su2.equals(""))
		{
			bel.setText("두번째 수를 입력하시오.");
			return;
		}
		
		int num1 = Integer.parseInt(su1);
		int num2 = Integer.parseInt(su2);
		
		
		//숫자가 제대로 입력되었을 경우 처리
		if(e.getSource()==btn)
		{
			System.out.println("결과 : "+(num1+num2));
			resl.setText(num1+num2+"");
		}
		else if(e.getSource()==btn1)
		{
			System.out.println("결과 : "+(num1-num2));
			resl.setText(num1-num2+"");
		}
		else if(e.getSource()==btn2)
		{
			System.out.println("결과 : "+num1*num2);
			resl.setText((num1*num2)+"");
		}
		else if(e.getSource()==btn3)
		{
			System.out.println("결과 : "+num1/num2);
			resl.setText((num1/num2)+"");
		}
		bel.setText("정상적으로 처리되었습니다.");
		
		
		
	}
	
	void start()
	{
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
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
		this.setVisible(true);
	}


}