package Java9_5;

import java.awt.*;

public class Window1 {

	public static void main(String[] args) {
		FirstWin f = new FirstWin();

	}

}
class FirstWin extends Frame 
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	private Label lbTitle = new Label("�ڹ����α׷���");
	private Label lbMent1 = new Label("���θ�");
	private Label lbMent2 = new Label("�����Ϸ���");
	private Label lbMent3 = new Label("��ư�� �����ÿ�.");	
	Button btnStart = new Button("����");
	FirstWin()
	{
		super("�����췹�̾ƿ�����");
		this.setSize(500,400);
		this.center(); //�߾ӹ�ġ
		this.setVisible(true);
		this.init();
	}
	void center()
	{
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		
	}
	void init()
	{	
		Font f = new Font("", Font.BOLD, 20);
		Font f3 = new Font("", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbTitle); lbTitle.setFont(f3); 
		lbTitle.setBounds(130,50,250,50);
//		setBounds(x, y, width, height);;
		this.add(lbMent1); lbMent1.setFont(f); 
		lbMent1.setBounds(130,100,250,50);
		this.add(lbMent2); lbMent2.setFont(f); 
		lbMent2.setBounds(130,150,250,50);
		this.add(lbMent3); lbMent3.setFont(f); 
		lbMent3.setBounds(130,200,250,50);
		
		this.add(btnStart); btnStart.setFont(f); 
		btnStart.setBounds(200,280,100,50);
	}
}