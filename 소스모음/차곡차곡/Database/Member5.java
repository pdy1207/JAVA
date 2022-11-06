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
	
	Label lbcheck = new Label("회원삭제");
	Label lbName = new Label("이름 : ");
	Label lblist = new Label("회원리스트");
	
	Button btn1 = new Button("검색");
	Button btn2 = new Button("전체 검색");
	Button btn3 = new Button("삭제하기");
	
	TextField tfName = new TextField();
	TextArea ta = new TextArea();
	Member5(){
		super("회원삭제");
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
			System.out.println("검색 : "+tfName.getText());
			search(tfName.getText());
		}
		if(e.getSource()== btn2) {
			System.out.println("전체검색");
			searchAll();
		}
		if(e.getSource()== btn3) {
			String name = tfName.getText();
			//공백체크
			if(name.equals("")) {msg("삭제할 대상을 입력해주세요"); return;}  
			delete(name);
			
			//삭제 후 처리 
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
		String password = "qwer";// 비밀번호
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
			msg("회원 삭제 성공!!");
		} catch (SQLException ee) {
			msg("회원 삭제 실패!!");
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
		conn = DriverManager.getConnection(url, id, pass); //어디에 아이디 p
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			boolean check = false; //찾는게 없으면 컨트롤하는 변수.
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
				msg("검색대상이 없습니다!");
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
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
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
