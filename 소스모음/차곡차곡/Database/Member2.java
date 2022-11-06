package Database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;


public class Member2 extends Frame implements ActionListener {
	private Dimension dimen, dimen1;
	private int xpos, ypos;
	Font f = new Font("",Font.PLAIN, 20);
	Label lbcheck = new Label("조회화면");
	Label lbName = new Label("이름 : ");
	
	Button btn2 = new Button("검색");
	Button btn3 = new Button("전체 검색");
	
	
	TextField tfName = new TextField();
	TextArea ta = new TextArea();
	Member2(){
		super("조회화면");
		this.setVisible(true);
		this.setSize(500,600);
		this.center();
		this.start();
		this.init();
	}
	void init() {
		this.setLayout(null);
		this.add(lbcheck); this.add(lbName);  this.add(btn2); this.add(btn3);
		this.add(tfName); this.add(ta);
		lbcheck.setFont(f); lbName.setFont(f); btn2.setFont(f); btn3.setFont(f);
		tfName.setFont(f); ta.setFont(f);
		
		lbcheck.setBounds(80,50,100,50); lbName.setBounds(80,100,80,50); tfName.setBounds(160,110,120,30); 
		btn2.setBounds(300,100,100,50); btn3.setBounds(300,200,100,50); ta.setBounds(60,280,400,250); 
		
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
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btn2) {
			String name = tfName.getText();
			search(name);
			tfName.setText("");
			
		}
		else if(e.getSource()== btn3) {
			
			searchAll();
			
		}
		
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
		conn = DriverManager.getConnection(url, id, pass); //어디에 아이디 p
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				if(rs.getString(4).equals(name)) {
				ta.setText(rs.getInt(1) + " / " + rs.getString(2)
				+ " / " + rs.getString(3)
				+ " / " + rs.getString(4)
				+ " / " + rs.getString(5));
				}
			}
			
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}//검색
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
		conn = DriverManager.getConnection(url, id, pass); //어디에 아이디 p
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
			conn.close(); //꺼지는 이유 연동을 안해
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
	}//전체 검색
}
