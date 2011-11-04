package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class LuaChonDangNhap extends JFrame {
	
	public LuaChonDangNhap() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao() {
		this.setSize(600, 600);
		this.setTitle("Lua chon dang nhap");
		this.setLayout(null);
		Container c = this.getContentPane();
		
		//khai bao lable
		
		JLabel lbTitle = new JLabel();
		lbTitle.setText("Lua Chon Dang Nhap");
		lbTitle.setLocation(150,100);
		lbTitle.setSize(300,50);
		Font f = new Font("Arial", Font.PLAIN, 30);
		Color mauxanh = new Color(0, 0, 255);
		lbTitle.setForeground(mauxanh);
		lbTitle.setFont(f);
		
		c.add(lbTitle);
		//khai bao buton
		JButton bt = new JButton();
		bt.setText("Viet");
		bt.setLocation(30,120);
		bt.setSize(70,30);
		bt.setEnabled(false);
		c.add(bt);
		//khai bao buton2
		JButton bt1 = new JButton();
		bt1.setText("Anh");
		bt1.setLocation(500,120);
		bt1.setSize(70,30);
		
		c.add(bt1);
		//khai bao buton3
		JButton bt2 = new JButton();
		bt2.setText("Ket Noi");
		bt2.setLocation(30,320);
		bt2.setSize(100,30);
		
		c.add(bt2);
		//khai bao buton4
		JButton bt3 = new JButton();
		bt3.setText("Khong Ket Noi");
		bt3.setLocation(200,320);
		bt3.setSize(150,30);
		bt3.setEnabled(false);
		c.add(bt3);
		//khai bao buton5
		JButton bt4 = new JButton();
		bt4.setText("Dang Nhap");
		bt4.setLocation(400,320);
		bt4.setSize(150,30);
		bt4.setEnabled(false);
		c.add(bt4);
		//khai bao radio
		JRadioButton rb = new JRadioButton();
		rb.setText("Ket Noi CSDL");
		rb.setLocation(100,230);
		rb.setSize(150,30);
		rb.setEnabled(false);
		c.add(rb);
		//khai bao radio
		JRadioButton rb1 = new JRadioButton();
		rb1.setText("Khong Ket Noi CSDL");
		rb1.setLocation(350,230);
		rb1.setSize(150,30);
		rb1.setEnabled(false);
		rb1.setSelected(true);
		c.add(rb1);
		
		this.setVisible(true);
	}
	
}
