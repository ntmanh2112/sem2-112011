package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dao.ThanhVienDao;

import model.ThanhVienModel;

import util.DataUtil;

public class DangNhap extends JFrame {
	
	private JTextField tfuser;
	
	private JPasswordField pf;
	
	public DangNhap() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao() {
		this.setSize(400, 310);
		this.setTitle("welcom to Login Form");
		this.setLayout(null);
		Container c = this.getContentPane();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) (d.getWidth()- 400)/2;
		int y = (int) (d.getHeight()- 310)/2;
		this.setLocation(x,y);
		//khai bao hinh
		JLabel lbimage = new JLabel();
		lbimage.setSize(100, 100);
		lbimage.setLocation(10, 10);
		ImageIcon hinh = new ImageIcon("images/Contact.png");
		lbimage.setIcon(hinh);
		c.add(lbimage);
		//khia bao login
		JLabel login = new JLabel();
		login.setText("Login");
		login.setSize(100, 50);
		login.setLocation(200, 40);
		Font f = new Font("arial", Font.PLAIN, 30);
		Color mau = new Color(0,0,255);
		login.setForeground(mau);
		login.setFont(f);
		c.add(login);
		//khai bao uses
		JLabel user = new JLabel();
		user.setText("User Name ");
		user.setSize(120, 30);
		user.setLocation(20, 120);
		Font fuser = new Font("arial", Font.PLAIN, 20);
		user.setFont(fuser);
		c.add(user);
		//text filed user
		
		tfuser = new JTextField();
		
		tfuser.setText("Thanhln");
		tfuser.setSize(200, 25);
		tfuser.setLocation(130, 123);
		
		//khai bao pass word
		JLabel pass = new JLabel();
		pass.setText("Password ");
		pass.setSize(120, 30);
		pass.setLocation(20, 170);
		Font fpass = new Font("arial", Font.PLAIN, 20);
		pass.setFont(fpass);
		c.add(pass);
		//jpassword
		pf = new JPasswordField();
		pf.setText("thanhln");
		pf.setSize(200, 25);
		pf.setLocation(130, 173);
		
		//khai bao button ok
		JButton btdongy = new JButton();
		btdongy.setText("OK");
		btdongy.setSize(100, 30);
		btdongy.setLocation(70, 230);
		ImageIcon imok = new ImageIcon("images/changepass1.png");
		btdongy.setIcon(imok);
		btdongy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
					String Ten_Dang_Nhap = tfuser.getText();
					
					String Mat_Khau = pf.getText();
					
					
					ThanhVienModel model = ThanhVienDao.getThanhVien(Ten_Dang_Nhap, Mat_Khau);
					
					if (model == null) {
						JOptionPane.showMessageDialog(null, "Dang Nhap That Bai");
					}else {
						(new ShowThanhVien(model)).setVisible(true);
						hide();
					}
			}
		});
		c.add(btdongy);
		//khai bao exit
		JButton btexit = new JButton();
		btexit.setText("Exit");
		btexit.setSize(100, 30);
		btexit.setLocation(200, 230);
		ImageIcon imexit = new ImageIcon("images/button-cancel-icon.png");
		btexit.setIcon(imexit);
		btexit.addActionListener(new ActionListener() {//bat su kien cho buton
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int kg = JOptionPane.showConfirmDialog(null, "Ban co chac muon thoat","Thong Bao",JOptionPane.OK_CANCEL_OPTION);
				if (kg==0) {
					System.exit(1);
				}
			}
		});
		c.add(btexit);
		
		c.add(tfuser);
		c.add(pf);
		this.setVisible(true);
	}

}
