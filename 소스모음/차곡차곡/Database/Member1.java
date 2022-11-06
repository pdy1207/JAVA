package Database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Member1 extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font f = new Font("",Font.PLAIN, 20);
	Font f2 = new Font("",Font.BOLD, 30);
	Button btn1 = new Button("�����ϱ�");
	Label title = new Label("ȸ������");
	
	Label lbid = new Label("���̵� : ");
	Label lbpw = new Label("��� : ");
	Label lbpw2 = new Label("���Ȯ�� : ");
	Label lbname = new Label("�̸� : ");
	Label lbhp = new Label("����ó : ");
	Label lbage = new Label("���� : ");
	
	TextField tfid = new TextField();
	TextField tfpw = new TextField();
	TextField tfpw2 = new TextField();
	TextField tfname = new TextField();
	TextField tfhp = new TextField();
	TextField tfage = new TextField();
	
	
	
	Member1()
	{
		super("ȸ���������α׷�");
		this.setVisible(true);
		this.setSize(400,600);
		this.init();
		this.center();
		this.start();
	}
	void init() {
		this.setLayout(null);
		//�߰�
		this.add(title); this.add(btn1); 
		this.add(lbid); this.add(lbpw); this.add(lbpw2); this.add(lbname); this.add(lbhp); this.add(lbage); 
		this.add(tfid); this.add(tfpw); this.add(tfpw2); this.add(tfname); this.add(tfhp); this.add(tfage);
		//��Ʈ 
		title.setFont(f2); btn1.setFont(f);
		lbid.setFont(f);lbpw.setFont(f);lbpw2.setFont(f);lbname.setFont(f);lbhp.setFont(f);lbage.setFont(f);
		tfid.setFont(f);tfpw.setFont(f);tfpw2.setFont(f);tfname.setFont(f);tfhp.setFont(f);tfage.setFont(f);
		//�̸� Ÿ��Ʋ ��
		title.setBounds(130,50,150,50);	btn1.setBounds(130,450,150,50);
		lbid.setBounds(50,100,80,50); lbpw.setBounds(50,150,80,50); lbpw2.setBounds(50,200,80,50); 
		lbname.setBounds(50,250,80,50); lbhp.setBounds(50,300,80,50); lbage.setBounds(50,350,80,50);
		//�ؽ�Ʈ�ʵ� 
		tfid.setBounds(150,110,130,30); tfpw.setBounds(150,160,130,30); tfpw2.setBounds(150,210,130,30);
		tfname.setBounds(150,260,130,30); tfhp.setBounds(150,310,130,30); tfage.setBounds(150,360,130,30);
	}
	void center() {
		dimen = Toolkit.getDefaultToolkit().getScreenSize();
		dimen1 = this.getSize();
		xpos = (int) (dimen.getWidth() / 2 - dimen1.getWidth() / 2);
		ypos = (int) (dimen.getHeight() / 2 - dimen1.getHeight() / 2);
		this.setLocation(xpos, ypos);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
	}
	void close() {
		this.setVisible(false);
	}
	public void actionPerformed(ActionEvent e) {
	
		String id = tfid.getText();
		String pw = tfpw.getText();
		String pw2 = tfpw2.getText();
		String name = tfname.getText();
		String hp = tfhp.getText();
		String age = tfage.getText(); //������ �Ѿ������ ��ȯ ���ֱ� 
		
		//����üũ
		if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
		if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
		if(pw2.equals("")) {msg("��й�ȣ2�� �Է����ּ���!");return;}
		if(name.equals("")) {msg("�̸��� �Է����ּ���!");return;}
		if(hp.equals("")) {msg("����ó���Է����ּ���!");return;}
		if(age.equals("")) {msg("���̸��Է����ּ���!");return;}
		
		if(!pw.equals(pw2)){msg("����̼��ΰ����ʽ��ϴ�.");return;}
		
		//* ���� ȸ������ *
		inter(id,pw,pw2,name,hp,age);
	}
		
	void inter(String id, String pw, String pw2, String name, String hp, String age) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
		} catch (ClassNotFoundException ee) {
			System.out.println("����̺� ����!!");
		}
		
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String user = "root";// ID
		String password = "qwer";// ��й�ȣ
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException ee) {
			System.err.println("���ᰴü ��������!!");
		}

		
		String pquery = "insert into member values (null, ?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			
			pstmt = conn.prepareStatement(pquery);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, hp);
			pstmt.executeUpdate();
			System.out.println("���༺��");
		} catch (SQLException ee) {
			System.err.println("Query ���� Ŭ���� ���� ����~!! : " + ee.toString());
		}
		
		// 5. Close �۾�
		try {
			
			pstmt.close();
			if (conn != null) {
				if (!conn.isClosed()) {
					conn.close();
				}
				conn = null;
			}
		} catch (SQLException ee) {
			System.err.println("�ݱ� ����~!!");
		}
	}
		void msg(String msg)
		{
			final Dialog dlg = new Dialog(this, "�˸� �޼���â", true);
			dlg.setLayout(null);
			Label lbMsg = new Label(msg);
			
			dlg.add(lbMsg);	lbMsg.setFont(f);
			lbMsg.setBounds(100, 100, 450, 30);
			
			dlg.setSize(450, 250);
			dlg.setLocation(700, 400);
			
			dlg.addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					dlg.setVisible(false);
				}
			});
			dlg.setVisible(true);
		}
		
		
	void start() {
		
		btn1.addActionListener(this);
		
		
	}
	
	
}