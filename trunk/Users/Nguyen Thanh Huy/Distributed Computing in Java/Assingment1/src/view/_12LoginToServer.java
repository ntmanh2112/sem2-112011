package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class _12LoginToServer extends JFrame {
	JTextField txtServerName, txtDBName, txtLoginAcc;
	JPasswordField pwdPassword;
	JButton btnAgree, btnCancel;
	
	public _12LoginToServer() {
		initComponents();
	}

	private void initComponents() {
		Container c = this.getContentPane();
		this.setTitle("Login to server");
		this.setSize(600, 500);
		this.setLayout(null);
		
		//lable title "login to server"
		JLabel lblTitle = new JLabel("Login to server");
		lblTitle.setSize(300, 30);
		lblTitle.setFont(new Font("Arial", Font.BOLD, 25));
		lblTitle.setLocation(200, 100);
		c.add(lblTitle);
		
		//lable server name
		JLabel lblServerName = new JLabel("Server name: ");
		lblServerName.setSize(100, 20);
		lblServerName.setLocation(100, 150);
		c.add(lblServerName);
		//textfield server name
		txtServerName = new JTextField();
		txtServerName.setSize(250, 25);
		txtServerName.setLocation(200, 150);
		c.add(txtServerName);
		
		//lable database name
		JLabel lblDBName = new JLabel("Database name: ");
		lblDBName.setSize(100, 20);
		lblDBName.setLocation(100, 200);
		c.add(lblDBName);
		//text field database name
		txtDBName = new JTextField();
		txtDBName.setSize(250, 25);
		txtDBName.setLocation(200, 200);
		c.add(txtDBName);
		
		//lable login account
		JLabel lblLoginAcc = new JLabel("Login Account: ");
		lblLoginAcc.setSize(100, 20);
		lblLoginAcc.setLocation(100, 250);
		c.add(lblLoginAcc);
		//text field login account
		txtLoginAcc = new JTextField();
		txtLoginAcc.setSize(250, 25);
		txtLoginAcc.setLocation(200, 250);
		c.add(txtLoginAcc);
		
		//lable password
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setSize(100, 20);
		lblPassword.setLocation(100, 300);
		c.add(lblPassword);
		//textfield password
		pwdPassword = new JPasswordField();
		pwdPassword.setSize(250, 25);
		pwdPassword.setLocation(200, 300);
		c.add(pwdPassword);
		
		//button OK
		btnAgree = new JButton("OK");
		btnAgree.setSize(100, 25);
		btnAgree.setLocation(200, 350);
		c.add(btnAgree);
		//button Cancel
		btnCancel = new JButton("Cancel");
		btnCancel.setSize(100, 25);
		btnCancel.setLocation(350, 350);
		c.add(btnCancel);
		
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new _12LoginToServer();
	}

}
