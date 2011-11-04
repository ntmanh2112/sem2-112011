package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends JFrame {
	
	public LoginForm () {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao() ;
	}
	public void khoiTao () {
		this.setSize(450, 300);
		this.setTitle("Welcome to Login From");
		this.setLayout(null);
		Container c = this.getContentPane();
		
		//khai bao label
		JLabel lbTitle = new JLabel();
		lbTitle.setText("Dang nhap he thong");
		
		lbTitle.setLocation(100, 50);
		lbTitle.setSize(300, 50);
		Font f = new Font("Arial", Font.PLAIN, 30);
		Color mauxanh = new Color(0, 0, 255);
		lbTitle.setForeground(mauxanh);
		lbTitle.setFont(f);
		
		c.add(lbTitle);
		//khaibao text 
		JLabel lbText = new JLabel();
		lbText.setText("Ten Dang Nhap :");
		lbText.setLocation(50,100);
		lbText.setSize(200, 50);
		
		c.add(lbText);
		
		//khai bao text field
		JTextField tf = new JTextField();
		tf.setLocation(150,110);
		tf.setSize(200, 30);
		
		c.add(tf);
		//khai bao Jpassword
		JLabel lbpass = new JLabel();
		lbpass.setText("Mat khau :");
		lbpass.setLocation(50,150);
		lbpass.setSize(250, 50);
		
		c.add(lbpass);
		//khai bao pass field
		JPasswordField lp = new JPasswordField();
		lp.setLocation(150,160);
		lp.setSize(200, 30);
		
		c.add(lp);
		//khai bao botton 1
		JButton bt = new JButton();
		bt.setText("Dong y");
		bt.setLocation(100,200);
		bt.setSize(100,30);
		
		c.add(bt);
		
		//khai bao botton 2
		JButton jbt = new JButton();
		jbt.setText("Thoat");
		jbt.setLocation(250,200);
		jbt.setSize(100,30);
		
		c.add(jbt);
		
		
		
		this.setVisible(true);
	}
}
