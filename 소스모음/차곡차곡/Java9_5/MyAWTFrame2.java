package Java9_5;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Frame;

public class MyAWTFrame2 {
	private Frame fr;
	
	public MyAWTFrame2(String str) {
		initialize(str);
	}
	
	public static void main(String[] args) {
		MyAWTFrame2 myfr = new MyAWTFrame2("MyAWTFrameTitle");
		myfr.fr.setVisible(true);

	}



	private	void initialize(String str)
	{
		fr = new Frame(str);
		Button bt1 = new Button("North");
		Button bt2 = new Button("South");
		Button bt3 = new Button("East");
		Button bt4 = new Button("West");
		Button bt5 = new Button("Center");
		
		fr.setLayout(new FlowLayout(FlowLayout.RIGHT,0,0));
		fr.add(bt1);
		fr.add(bt2);
		fr.add(bt3);
		fr.add(bt4);
		fr.add(bt5);
		
		fr.setSize(200,200);
		
		
	}
}
