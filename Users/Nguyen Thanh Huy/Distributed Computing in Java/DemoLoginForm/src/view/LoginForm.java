package view;

import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	
	//constructor
	public LoginForm() {
		try {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			initComponents();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//khoi tao cac components
	public void initComponents() {
		Container c = this.getContentPane();
		this.setTitle("Login Form");
		this.setSize(600, 600);
		
		//set images title
		//JPanel
		ImageIcon imgTitle = new ImageIcon();
		imgTitle.getImage();
		
		//set title
		JLabel lblTitle = new JLabel();
		lblTitle.setText("Login Frame");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setSize(200, 100);
		lblTitle.setLocation(190, 50);
		
		//user name
		JLabel lblUserName = new JLabel();
		lblUserName.setText("User Name: ");
		lblUserName.setSize(100, 20);
		lblUserName.setLocation(50, 150);
		
		JTextField txtUserName = new JTextField();
		txtUserName.setSize(200, 25);
		txtUserName.setLocation(150, 150);
		
		//password
		JLabel lblPassword = new JLabel();
		lblPassword.setText("Password: ");
		lblPassword.setSize(100, 20);
		lblPassword.setLocation(50, 200);
		
		JPasswordField pwdPassword = new JPasswordField();
		pwdPassword.setSize(200, 25);
		pwdPassword.setLocation(150, 200);

		//button login
		JButton btnLogin = new JButton();
		btnLogin.setText("Login");
		btnLogin.setSize(95, 25);
		btnLogin.setLocation(150, 250);
		ImageIcon imgLogin = new ImageIcon("images/OK.gif");
		btnLogin.setIcon(imgLogin);
		
		//button cancel
		JButton btnCancel = new JButton();
		btnCancel.setText("Cancel");
		btnCancel.setSize(100, 25);
		btnCancel.setLocation(250, 250);
		ImageIcon imgCancel = new ImageIcon("images/Cancel-2-icon.png");
		btnCancel.setIcon(imgCancel);
		
		
		c.add(lblTitle);
		//add userName field
		c.add(lblUserName);
		c.add(txtUserName);
		//add password field
		c.add(lblPassword);
		c.add(pwdPassword);
		//add buttons
		c.add(btnLogin);
		//c.add(btnReset);
		c.add(btnCancel);
		
		
		this.setLayout(null);
		
		this.setVisible(true);
	}
	
	

}
