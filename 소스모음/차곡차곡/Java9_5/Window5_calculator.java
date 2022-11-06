package Java9_5;

import java.awt.*;

public class Window5_calculator {

	public static void main(String[] args) {
		Calcu c = new Calcu();

	}

}
class Calcu extends Frame
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Button one = new Button("1");
	Button two = new Button("2");
	Button three = new Button("3");
	Button fore = new Button("4");
	Button five = new Button("5");
	Button six = new Button("6");
	Button seven = new Button("7");
	Button eight = new Button("8");
	Button nine = new Button("9");
	Button zeo = new Button("0");
	
	Button C = new Button("c");
	Button value = new Button("=");
	Button division = new Button("/");
	Button multiplication = new Button("*");
	Button minus = new Button("-");
	Button plus = new Button("+");
	Label tot = new Label("결과 : ");
	TextField tot2 = new TextField();
	
	Font f = new Font("",Font.PLAIN,20);
	Font f2 = new Font("",Font.BOLD,30);
	
	Calcu()
	{
		super("계산기....");
		this.setVisible(true);
		this.setSize(600, 600);
		this.init();
		this.center();
	}
	
	void init()
	{
		this.setLayout(null);
		
		
		this.add(one); this.add(two); this.add(three); this.add(fore); this.add(five); this.add(six); this.add(seven);
		this.add(eight); this.add(nine); this.add(zeo); 	this.add(tot); this.add(tot2);
		this.add(C); this.add(value); this.add(division); this.add(multiplication); this.add(minus); this.add(plus); 
		
		
		tot.setFont(f2);tot.setBounds(80, 500, 100, 30); tot2.setFont(f);tot2.setBounds(200, 500, 250, 30);
		//결과 : 
		one.setFont(f);one.setBounds(150, 100, 60, 60); two.setFont(f);two.setBounds(230, 100, 60, 60);
		three.setFont(f);three.setBounds(310, 100, 60, 60); plus.setFont(f);plus.setBounds(390, 100, 60, 60);
		//1 2 3 +
		fore.setFont(f); fore.setBounds(150,190,60,60); five.setFont(f); five.setBounds(230,190,60,60);
		six.setFont(f); six.setBounds(310,190,60,60); minus.setFont(f); minus.setBounds(390,190,60,60);
		//4 5 6 -
		seven.setFont(f); seven.setBounds(150,280,60,60); eight.setFont(f); eight.setBounds(230,280,60,60);
		nine.setFont(f); nine.setBounds(310,280,60,60); multiplication.setFont(f); multiplication.setBounds(390,280,60,60);
		// 7 8 9 *
		C.setFont(f); C.setBounds(150,370,60,60); zeo.setFont(f); zeo.setBounds(230,370,60,60);
		value.setFont(f); value.setBounds(310,370,60,60); division.setFont(f); division.setBounds(390,370,60,60);
		//c 0 = /
		
		
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
