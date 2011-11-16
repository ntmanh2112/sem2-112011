package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class _13LogManagement extends JFrame {
	public JLabel lblManageName, lblPassword;
	public JTextField txtManageName;
	public JPasswordField pwdPassword;
	public JButton btnOK, btnCancel;

	public _13LogManagement() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		Container c = this.getContentPane();
		this.setTitle("Login Form");
		this.setSize(600, 600);
		
		//set images title
		//JPanel
		ImageIcon imgTitle = new ImageIcon();
		imgTitle.getImage();
		
		//set title
		JLabel lblTitle = new JLabel();
		lblTitle.setText("Log Manage");
		lblTitle.setFont(new Font("Arial", Font.BOLD, 30));
		lblTitle.setSize(200, 100);
		lblTitle.setLocation(190, 50);
		
		//user name
		lblManageName = new JLabel();
		lblManageName.setText("Manage Name: ");
		lblManageName.setSize(100, 20);
		lblManageName.setLocation(50, 150);
		
		txtManageName = new JTextField();
		txtManageName.setSize(200, 25);
		txtManageName.setLocation(150, 150);
		
		//password
		lblPassword = new JLabel();
		lblPassword.setText("Password: ");
		lblPassword.setSize(100, 20);
		lblPassword.setLocation(50, 200);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setSize(200, 25);
		pwdPassword.setLocation(150, 200);

		//button login
		btnOK = new JButton("OK");
		btnOK.setSize(95, 25);
		btnOK.setLocation(150, 250);
		//ImageIcon imgLogin = new ImageIcon("images/OK.gif");
		//btnLogin.setIcon(imgLogin);
		
		//button cancel
		btnCancel = new JButton("Cancel");
		btnCancel.setSize(100, 25);
		btnCancel.setLocation(250, 250);
		ImageIcon imgCancel = new ImageIcon("images/Cancel-2-icon.png");
		btnCancel.setIcon(imgCancel);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = JOptionPane.showConfirmDialog(null, "Are you sure that you want to exit?");
				if (i == 0) {
					System.exit(1);
				}
			}
		});
		
		
		c.add(lblTitle);
		//add userName field
		c.add(lblManageName);
		c.add(txtManageName);
		//add password field
		c.add(lblPassword);
		c.add(pwdPassword);
		//add buttons
		c.add(btnOK);
		//c.add(btnReset);
		c.add(btnCancel);
		
		
		this.setLayout(null);
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new _13LogManagement();
	}
	
	
}
