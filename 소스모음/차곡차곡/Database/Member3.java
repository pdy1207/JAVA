package Database;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.*;


public class Member3 extends Frame implements ActionListener {

	private Dimension dimen, dimen1;
	private int xpos, ypos;
	private Label lbTitle = new Label("로그인");
	private Label lbMent1 = new Label("아이디 : "); 
	private Label lbMent2 = new Label("비밀번호 :"); 
	private TextField id = new TextField(30);
	private TextField pw = new TextField(30);
	Button btnlogin = new Button("로그인"); 
	Button btnpw = new Button("회원가입");
	
	boolean loginCheck = false;
	Member3()
	{
		super("로그인");
		this.setSize(400,500);
		this.center(); //중앙배치
		this.setVisible(true); //화면에 나타나라.
		this.init();
		this.start();
		
	}
	void center()
	{
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
	void init()
	{	
		Font f = new Font("", Font.BOLD, 20);
		Font f3 = new Font("", Font.BOLD, 30);
		
		this.setLayout(null);
		
		this.add(lbTitle); lbTitle.setFont(f3); 
		lbTitle.setBounds(150,50,100,30);
		
		this.add(lbMent1); lbMent1.setFont(f); 
		lbMent1.setBounds(50,150,100,30);
		
		this.add(id); id.setFont(f);
		id.setBounds(180, 150, 200, 30);
		
		this.add(lbMent2); lbMent2.setFont(f); 
		lbMent2.setBounds(50,200,100,50);
		
		this.add(pw); pw.setFont(f);
		pw.setBounds(180, 210, 200, 30);
		
		
		this.add(btnlogin); btnlogin.setFont(f); 
		btnlogin.setBounds(150,280,100,50);
		
		this.add(btnpw); btnpw.setFont(f); 
		btnpw.setBounds(130,350,150,50);
		
	}
	
	void start() {
		btnpw.addActionListener(this);
		btnlogin.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnlogin) {
			String userid = id.getText();
			String userpw = pw.getText();
			
			if(userid.equals("")) {msg("아이디를입력해주세요!"); return;}
			if(userpw.equals("")) {msg("비밀번호를 입력하세요.");return;}
			
			insert(userid,userpw);		
			if(loginCheck == true) {
				
				msg("로그인 성공~!");
				this.setVisible(false);
				Member4 m4 = new Member4();
			}
			else {
				
				msg("로그인 실패!");
				
			}
		}
		else if(e.getSource()==btnpw) {
					Member1 m = new Member1();
		}
	
		
	}
	void insert(String myId,String myPw) {
		
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
				if(rs.getString("id").equals(myId)){
					if(rs.getString("pw").equals(myPw)){
						loginCheck=true;
						
						break;
					}
				}
				
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException ee) {
			System.err.println("error = " + ee.toString());
		}
		
	}
	void msg(String msg)
	{
		final Dialog dlg = new Dialog(this, "알림 메세지창", true);
		dlg.setLayout(null);
		Label lbMsg = new Label(msg);
		
		dlg.add(lbMsg);	
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
