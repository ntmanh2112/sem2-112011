package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Group;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class ChooseLogin extends JFrame {
	JButton btnVietnamese, btnEnglish, btnConnect, btnNotConnect, btnLogin;
	JRadioButton radConnect, radNotConnect;
	
	public ChooseLogin() {
		initComponents();
	}
	
	public void initComponents() {
		Container c = this.getContentPane();
		this.setTitle("Login Choice");
		this.setSize(600, 500);
		this.setLayout(null);
		
		//button Vietnamese language
		btnVietnamese = new JButton("Tiếng Việt");
		btnVietnamese.setSize(100, 25);
		btnVietnamese.setLocation(50, 100);
		c.add(btnVietnamese);
		
		//title
		JLabel lblTile = new JLabel("Choose login");
		lblTile.setSize(200, 30);
		lblTile.setLocation(180, 100);
		lblTile.setFont(new Font("Arial", Font.BOLD, 30));
		c.add(lblTile);
		
		//button English language
		btnEnglish = new JButton("English");
		btnEnglish.setSize(100, 25);
		btnEnglish.setLocation(400, 100);
		c.add(btnEnglish);
		
		//radio button connect to database
		radConnect = new JRadioButton("Connect to Database");
		radConnect.setSize(200, 20);
		radConnect.setLocation(100, 200);
		//radio button not connect to database
		radNotConnect = new JRadioButton("Not connect to database");
		radNotConnect.setSize(200, 20);
		radNotConnect.setLocation(300, 200);
		//group radio buttons
		ButtonGroup group = new ButtonGroup();
		group.add(radConnect);
		group.add(radNotConnect);
		c.add(radConnect);
		c.add(radNotConnect);
		
		//button connect
		btnConnect = new JButton("Connect");
		btnConnect.setSize(100, 25);
		btnConnect.setLocation(50, 300);
		c.add(btnConnect);
		
		//button not connect
		btnNotConnect = new JButton("Not connect");
		btnNotConnect.setSize(120, 25);
		btnNotConnect.setLocation(200, 300);
		c.add(btnNotConnect);
		
		//button login
		btnLogin = new JButton("Login");
		btnLogin.setSize(100, 25);
		btnLogin.setLocation(370, 300);
		c.add(btnLogin);
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new ChooseLogin();
	}
}
