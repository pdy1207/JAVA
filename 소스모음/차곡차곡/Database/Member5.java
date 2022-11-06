package Database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;


public class Member5 extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	
	Font f = new Font("",Font.PLAIN, 20);
	Font f3 = new Font("", Font.BOLD, 30);
	
	Label lbcheck = new Label("ȸ������");
	Label lbName = new Label("�̸� : ");
	Label lblist = new Label("ȸ������Ʈ");
	
	Button btn1 = new Button("�˻�");
	Button btn2 = new Button("��ü �˻�");
	Button btn3 = new Button("�����ϱ�");
	
	TextField tfName = new TextField();
	TextArea ta = new TextArea();
	Member5(){
		super("ȸ������");
		this.setVisible(true);
		this.setSize(400,600);
		this.center();
		this.start();
		this.init();
	}
	void init() {
		this.setLayout(null);
		this.add(lbcheck); this.add(lbName);  this.add(btn1); this.add(btn2);
		this.add(btn3); 	this.add(lblist);
		this.add(tfName); this.add(ta);
		lbcheck.setFont(f3); lbName.setFont(f);
		btn1.setFont(f); 
		btn2.setFont(f);	lblist.setFont(f);
		btn3.setFont(f);
		tfName.setFont(f); ta.setFont(f);
		
		lbcheck.setBounds(140, 70,250,50); lbName.setBounds(30,120,80,50); tfName.setBounds(120,130,120,30); 
		btn1.setBounds(270,120,100,50); btn2.setBounds(270,180,100,50); ta.setBounds(30,350,350,200);
		btn3.setBounds(50,240,300,50); lblist.setBounds(30,300,100,50);
		
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
	void start() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn1) {
			System.out.println("�˻� : "+tfName.getText());
			search(tfName.getText());
		}
		if(e.getSource()== btn2) {
			System.out.println("��ü�˻�");
			searchAll();
		}
		if(e.getSource()== btn3) {
			String name = tfName.getText();
			//����üũ
			if(name.equals("")) {msg("������ ����� �Է����ּ���"); return;}  
			delete(name);
			
			//���� �� ó�� 
			tfName.setText("");
			ta.setText("");
	
		}
	}
	boolean delete(String name) {
		Connection dc = null;
		
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			
		} catch (ClassNotFoundException ee) {
			
		}
		
		String url = "jdbc:mysql://127.0.0.1:3306/dw202?useUnicode=true&characterEncoding=utf8";
		String user = "root";// ID
		String password = "qwer";// ��й�ȣ
		try {
			dc = DriverManager.getConnection(url, user, password);
		} catch (SQLException ee) {
		}
		String query = "delete from member where name = ?";
		try {
			PreparedStatement pstmt = dc.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.executeUpdate();
			pstmt.close();
			msg("ȸ�� ���� ����!!");
		} catch (SQLException ee) {
			msg("ȸ�� ���� ����!!");
			return false;
		}
		return true;
	}
	void search(String name) {
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
		String query = "select * from member";
		try {
		conn = DriverManager.getConnection(url, id, pass); //��� ���̵� p
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			boolean check = false; //ã�°� ������ ��Ʈ���ϴ� ����.
			while (rs.next()) {
				if(rs.getString(4).equals(name)) {
				ta.setText(rs.getInt(1) + " / " + rs.getString(2)
				+ " / " + rs.getString(3)
				+ " / " + rs.getString(4)
				+ " / " + rs.getString(5));
				check =true;
				}
			}
			if(check == false) {
				msg("�˻������ �����ϴ�!");
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}//�˻�
	}
	void searchAll() {
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
		String query = "select * from member";
		try {
		conn = DriverManager.getConnection(url, id, pass); //��� ���̵� p
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			String result="";
			while (rs.next()) {
				result+=rs.getInt(1) + " / " + rs.getString(2)
				+ " / " + rs.getString(3)
				+ " / " + rs.getString(4)
				+ " / " + rs.getString(5)+"\n";
			}
			ta.setText(result);
			rs.close();
			stmt.close();
			conn.close(); //������ ���� ������ ����
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}//��ü �˻�
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
}
