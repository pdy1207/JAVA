package Java9_5;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Window8_xkwk {
	public static void main(String[] args) {
		Baseball bs = new Baseball();
	}
}
class Baseball extends Frame implements ActionListener{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	//폰트를 자주사용해서 위에 클래스 변수로 배치해놓음.
	Font font20 = new Font("SansSerif", Font.PLAIN, 20);
	Font font30 = new Font("SansSerif", Font.BOLD, 30);	
	TextField tfName = new TextField();
	Button btnStart = new Button("게임시작");
	Label lbTaja = new Label("타자 : ");
	Label lb3 = new Label("3...");
	Label lb2 = new Label("2..");
	Label lb1 = new Label("1.");
	Label lbMent = new Label("타자가 대기중입니다..");
	Label lbHistory = new Label("현재기록");
	Label lbAn = new Label("안타 : ");
	Label lbHom = new Label("홈런 : ");
	Label lbPa = new Label("파울 : ");
	Label lbAn2 = new Label("0");
	Label lbHom2 = new Label("0");
	Label lbPa2 = new Label("0");
	
	String ments[] = {"안타를 쳤습니다!","홈런을 쳤습니다!","파울을 쳤습니다!"};
	
	int anCnt=0, homCnt=0, paCnt=0;
	
	Baseball(){
		super("야구게임");
		this.setSize(400,500);
		this.center();
		this.init();//화면구성
		this.start();//이벤트처리
		this.setVisible(true);
	}
	void init()
	{
		this.setLayout(null);
		this.add(tfName);		this.add(btnStart);
		this.add(lbTaja);		this.add(lb3);			
		this.add(lb2);
		this.add(lb1);			this.add(lbMent);
		this.add(lbHistory);	this.add(lbAn);
		this.add(lbHom);		this.add(lbPa);
		this.add(lbAn2);		this.add(lbHom2);
		this.add(lbPa2);
 		
		lbTaja.setBounds(50, 50, 70, 30); lbTaja.setFont(font20);
		tfName.setBounds(130, 50, 150, 30); tfName.setFont(font20);
		btnStart.setBounds(130, 100, 150, 30); btnStart.setFont(font20);
		lb3.setBounds(50, 150, 50, 30); lb3.setFont(font20);
		lb2.setBounds(170, 150, 50, 30); lb2.setFont(font20);
		lb1.setBounds(290, 150, 50, 30); lb1.setFont(font20);
		
		lbMent.setBounds(50, 200, 300, 30); lbMent.setFont(font20);
		lbHistory.setBounds(50, 250, 150, 30); lbHistory.setFont(font20);
		lbAn.setBounds(50, 300, 100, 30); lbAn.setFont(font20);
		lbAn2.setBounds(170, 300, 150, 30); lbAn2.setFont(font20);
		lbHom.setBounds(50, 350, 100, 30); lbHom.setFont(font20);
		lbHom2.setBounds(170, 350, 150, 30); lbHom2.setFont(font20);
		lbPa.setBounds(50, 400, 100, 30); lbPa.setFont(font20);
		lbPa2.setBounds(170, 400, 150, 30); lbPa2.setFont(font20);
		
		
	}
	void start() //윈도우 x창
	{
		btnStart.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void actionPerformed(ActionEvent e) {
		String name = tfName.getText(); //현재 입력한 이름 가져오기
		
		if(name.equals("")) {
			lbMent.setText("타자이름을 넣어주세요.");
			return;}
		
		
		ing();//3 2 1 멘트처리용
		//랜덤으로 멘트생성!!
		int rd = (int)(Math.random()*3);
		//처리를 위해서 제어
		if(rd == 0) {anCnt++;}
		else if(rd == 1) {homCnt++;}
		else if(rd == 2) {paCnt++;}		
		
		lbMent.setText(name+"(이)가 "+ments[rd]);
		
		lbAn2.setText(anCnt+"");
		lbHom2.setText(homCnt+"");
		lbPa2.setText(paCnt+"");
		
		
	}
	void ing()
	{
		try {Thread.sleep(700);	
		lb3.setText("3.....");
		lb1.setText("");
		lb2.setText("");		
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);	
		lb3.setText("");		
		lb2.setText("2...");
		lb1.setText("");
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);	
		lb3.setText("");
		lb2.setText("");
		lb1.setText("1..");				
		} catch (InterruptedException e) {}
		try {Thread.sleep(700);		
		} catch (InterruptedException e) {}
		
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
	}
}