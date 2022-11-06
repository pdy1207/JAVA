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

public class Member6 extends Frame implements ActionListener
{
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font f = new Font("",Font.PLAIN, 20);
	Font f2 = new Font("",Font.BOLD, 30);
	Button btn1 = new Button("�����Ϸ�");
	Button btn2 = new Button("�˻�");
	Label title = new Label("ȸ������");
	
	Label lbid = new Label("���̵� : ");
	Label lbname = new Label("�̸� : ");
	Label lbpw = new Label("��� : ");
	Label lbhp = new Label("����ó : ");
	Label lbage = new Label("���� : ");
	
	TextField tfid = new TextField();
	TextField tfpw = new TextField();
	TextField tfname = new TextField();
	TextField tfhp = new TextField();
	TextField tfage = new TextField();
	
	
	
	Member6()
	{
		super("ȸ������");
		this.setVisible(true);
		this.setSize(400,600);
		this.init();
		this.center();
		this.start();
	}
	void init() {
		this.setLayout(null);
		//�߰�
		this.add(title); this.add(btn1); this.add(btn2);
		this.add(lbid); this.add(lbpw); this.add(lbname); this.add(lbhp); this.add(lbage); 
		this.add(tfid); this.add(tfpw); this.add(tfname); this.add(tfhp); this.add(tfage);
		//��Ʈ 
		title.setFont(f2); btn1.setFont(f2); btn2.setFont(f);
		lbid.setFont(f);lbpw.setFont(f);lbname.setFont(f);lbhp.setFont(f);lbage.setFont(f);
		tfid.setFont(f);tfpw.setFont(f);tfname.setFont(f);tfhp.setFont(f);tfage.setFont(f);
		//�̸� Ÿ��Ʋ ��
		title.setBounds(130,50,150,50);	btn1.setBounds(130,450,150,50);
		btn2.setBounds(300,120,60,50);
		lbid.setBounds(50,120,80,50); lbpw.setBounds(50,170,80,50);  
		lbname.setBounds(50,220,80,50); lbhp.setBounds(50,270,80,50); lbage.setBounds(50,320,80,50);
		//�ؽ�Ʈ�ʵ� 
		tfid.setBounds(150,130,130,30); tfpw.setBounds(150,180,130,30); 
		tfname.setBounds(150,230,130,30); tfhp.setBounds(150,280,130,30); tfage.setBounds(150,330,130,30);
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
		if(e.getSource()==btn1) {
		String id = tfid.getText();
		String pw = tfpw.getText();
		
		String name = tfname.getText();
		String hp = tfhp.getText();
		String age = tfage.getText(); //������ �Ѿ������ ��ȯ ���ֱ� 
		
		//����üũ
		if(id.equals("")) {msg("���̵��Է����ּ���!"); return;}
		if(pw.equals("")) {msg("��й�ȣ�� �Է��ϼ���.");return;}
		
		if(name.equals("")) {msg("�̸��� �Է����ּ���!");return;}
		if(hp.equals("")) {msg("����ó���Է����ּ���!");return;}
		if(age.equals("")) {msg("���̸��Է����ּ���!");return;}
		
		if(!pw.equals(pw)){msg("����̼��ΰ����ʽ��ϴ�.");return;}
		
		boolean end = update(id);
		
		if(end == true) {} //�����Ϸ�
		else if(end == false) {}	//��������
		//* ���� ȸ������ *
//		inter(id,pw,name,hp,age);
		}
		else if(e.getSource()==btn2) {
			String id = tfid.getText();
			if(id.equals("")) {msg("�˻� ����� �Է����ּ���!"); return;}
			search(id);
			}
		}
		void search(String findId) {
			try {
				Class.forName("org.gjt.mm.mysql.Driver");
			} catch (ClassNotFoundException ee) {
				System.exit(0);
			}
			Connection conn = null;
			String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
			String id = "root"; //
			String pass = "qwer";
			Statement stmt = null;
			ResultSet rs = null;
			String query = "select * from member where id ='"+findId+"'";
			try {
			conn = DriverManager.getConnection(url, id, pass); //��� ���̵� p
				stmt = conn.createStatement();
				rs = stmt.executeQuery(query);
				while (rs.next()) {
					tfid.setText(rs.getString("id"));
					tfpw.setText(rs.getString("pw"));
					tfname.setText(rs.getString("name"));
					tfhp.setText(rs.getString("hp"));
					tfage.setText(rs.getString("age"));
					}
				
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException ee) {
				System.err.println("error = " + ee.toString());
			}//�˻�
		}
		
		
		boolean update(String findId) {
			Connection dc = null;
			
			try {
				Class.forName("org.gjt.mm.mysql.Driver");
				System.out.println("����̺갡 �ֽ��ϴ�~! ^_^v");
			} catch (ClassNotFoundException ee) {
				System.out.println("����̺� ����!!");
			}
			
			Connection conn = null;
			String url = "jdbc:mysql://127 .0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
			String user = "root";// ID
			String password = "qwer";// ��й�ȣ
			try {
				dc = DriverManager.getConnection(url, user, password);
			} catch (SQLException ee) {
			}
			String query = "update member set pw = ?, hp = ?, age = ?,name = ? where id = ?";
			String pw = tfpw.getText();
			String name = tfname.getText();
			String hp = tfhp.getText();
			String age = tfage.getText();
			try {
				PreparedStatement pstmt = dc.prepareStatement(query);
				pstmt.setString(1, pw);
				pstmt.setString(2, hp);
				pstmt.setString(3, age);
				pstmt.setString(4, name);
				pstmt.setString(5, findId);
				pstmt.executeUpdate();
				pstmt.close();
				msg("ȸ�����������Ϸ�!");
			} catch (SQLException ee) {
				System.err.println("ȸ�� �������� ����!!");
				return false;
			}
			return true;
		}
		
	
	void inter(String id, String pw,String name, String hp, String age) {
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
		btn2.addActionListener(this);
		
	}
	
	
}