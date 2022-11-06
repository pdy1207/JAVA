package Java9_5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Study1 {

	public static void main(String[] args) {
		Calc f = new Calc();
	}
}

class Calc extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Label lbTitle = new Label("계산기 프로그램", Label.CENTER);
	Label lbResult = new Label("결과 : ", Label.CENTER);
	
	TextField tfResult  = new TextField(20);
	
	Button btnNum1 = new Button("1");
	Button btnNum2 = new Button("2");
	Button btnNum3 = new Button("3");
	Button btnNum4 = new Button("4");
	Button btnNum5 = new Button("5");
	Button btnNum6 = new Button("6");
	Button btnNum7 = new Button("7");
	Button btnNum8 = new Button("8");
	Button btnNum9 = new Button("9");
	Button btnNum0 = new Button("0");
	Button btnPlu = new Button("+");
	Button btnMin = new Button("-");
	Button btnMul = new Button("x");
	Button btnDiv = new Button("/");
	Button btnC = new Button("C");
	Button btnResult = new Button("=");
	
	
	public Calc() {
		super("계산기프로그램");
		this.init();
		this.start();
		this.setSize(500, 600);	
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.setVisible(true);
	}

	public void init() {
		// 앱솔루트방식  : 직접 좌표 입력방식.
		this.setLayout(null);

		//타이틀
		this.add(lbTitle);
		lbTitle.setBounds(100, 50, 300, 30);
		Font font = new Font("SansSerif", Font.BOLD, 20);
		lbTitle.setFont(font);
		
		
		this.add(btnNum1);
		btnNum1.setBounds(50, 100, 70, 70);	
		btnNum1.setFont(font);
		this.add(btnNum2);
		btnNum2.setBounds(150, 100, 70, 70);	
		btnNum2.setFont(font);
		this.add(btnNum3);
		btnNum3.setBounds(250, 100, 70, 70);	
		btnNum3.setFont(font);
		this.add(btnPlu);
		btnPlu.setBounds(350, 100, 70, 70);	
		btnPlu.setFont(font);
	
		
		this.add(btnNum4);
		btnNum4.setBounds(50, 200, 70, 70);	
		btnNum4.setFont(font);
		this.add(btnNum5);
		btnNum5.setBounds(150, 200, 70, 70);	
		btnNum5.setFont(font);
		this.add(btnNum6);
		btnNum6.setBounds(250, 200, 70, 70);	
		btnNum6.setFont(font);
		this.add(btnMin);
		btnMin.setBounds(350, 200, 70, 70);	
		btnMin.setFont(font);
		
		this.add(btnNum7);
		btnNum7.setBounds(50, 300, 70, 70);	
		btnNum7.setFont(font);
		this.add(btnNum8);
		btnNum8.setBounds(150, 300, 70, 70);	
		btnNum8.setFont(font);
		this.add(btnNum9);
		btnNum9.setBounds(250, 300, 70, 70);	
		btnNum9.setFont(font);
		this.add(btnMul);
		btnMul.setBounds(350, 300, 70, 70);	
		btnMul.setFont(font);
		
		
		this.add(btnResult);
		btnResult.setBounds(50, 400, 70, 70);	
		btnResult.setFont(font);
		this.add(btnNum0);
		btnNum0.setBounds(150, 400, 70, 70);	
		btnNum0.setFont(font);
		this.add(btnC);
		btnC.setBounds(250, 400, 70, 70);	
		btnC.setFont(font);
		this.add(btnDiv);
		btnDiv.setBounds(350, 400, 70, 70);	
		btnDiv.setFont(font);
		
		this.add(lbResult);
		lbResult.setBounds(50, 500, 70, 70);	
		lbResult.setFont(font);
		
		this.add(tfResult);
		tfResult.setBounds(150, 520, 250, 30);	
		tfResult.setFont(font);
		
	}

	public void start() {
		
//		btnRun.addActionListener(this);
//		btnCancel.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
				
		
	}


	


	
	
	
	
	
	
	
	
	
	
	
}

