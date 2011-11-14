package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DangNhapMayChu extends JFrame {
	
	public DangNhapMayChu() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao(){
		this.setSize(600,500);
		this.setTitle("Dang Nhap May Chu");
		this.setLayout(null);
		Container c = this.getContentPane();
		//khoi tao lable
		JLabel lbTitle = new JLabel();
		lbTitle.setText("Dang Nhap May Chu");
		lbTitle.setLocation(150,100);
		lbTitle.setSize(300,50);
		Font f = new Font("Arial", Font.PLAIN, 30);
		Color mauxanh = new Color(0, 0, 255);
		lbTitle.setForeground(mauxanh);
		lbTitle.setFont(f);
		
		c.add(lbTitle);
		//khai bao text 
		JLabel lbText = new JLabel();
		lbText.setText("Ten May Chu : ");
		lbText.setLocation(100,170);
		lbText.setSize(200,50);
		
		c.add(lbText);
		//khai bao text field
		JTextField tf = new JTextField();
		tf.setLocation(200,180);
		tf.setSize(200,25);
		
		c.add(tf);
		//khai bao 
		JLabel lb1 = new JLabel();
		lb1.setText("CSDL : ");
		lb1.setLocation(100,200);
		lb1.setSize(200,50);
		c.add(lb1);
		//khai bao text field
		JTextField tf1 = new JTextField();
		tf1.setLocation(200,210);
		tf1.setSize(200,25);
		c.add(tf1);
		//khai bao dang nhap
		JLabel lb2 = new JLabel();
		lb2.setText("Dang Nhap : ");
		lb2.setLocation(100,230);
		lb2.setSize(200,50);
		c.add(lb2);
		//khai bao text field
		JTextField tf2 = new JTextField();
		tf2.setLocation(200,240);
		tf2.setSize(200,25);
		c.add(tf2);
		//khai baopassword
		JLabel lb3 = new JLabel();
		lb3.setText("Mat Khau : ");
		lb3.setLocation(100,260);
		lb3.setSize(200,50);
		c.add(lb3);
		//Jpassword
		JPasswordField pf = new JPasswordField();
		pf.setLocation(200,270);
		pf.setSize(200,25);
		c.add(pf);
		//botton
		JButton bt = new JButton();
		bt.setText("Dong y");
		bt.setLocation(200,320);
		bt.setSize(80,30);
		c.add(bt);
		//button
		JButton bt2 = new JButton();
		bt2.setText("Huy Bo");
		bt2.setLocation(300,320);
		bt2.setSize(80,30);
		c.add(bt2);
		
		
		
		
		
		this.setVisible(true);
	}
}
