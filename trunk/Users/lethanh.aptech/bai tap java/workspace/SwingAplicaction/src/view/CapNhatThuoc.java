package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CapNhatThuoc extends JFrame {

	public CapNhatThuoc() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao() {
		this.setSize(600, 600);
		//this.setTitle("Lua chon dang nhap");
		this.setLayout(null);
		Container c = this.getContentPane();
		
		JLabel lbTitle = new JLabel();
		lbTitle.setText("Cap Nhat Thuoc");
		lbTitle.setLocation(180,80);
		lbTitle.setSize(300,50);
		Font f = new Font("Arial", Font.PLAIN, 30);
		Color mauxanh = new Color(0, 0, 255);
		lbTitle.setForeground(mauxanh);
		lbTitle.setFont(f);
		
		c.add(lbTitle);
		//khai bao menu
		
		//khai bao ten
		JLabel ten = new JLabel();
		ten.setText("Ten : ");
		ten.setSize(100, 50);
		ten.setLocation(100,150);
		
		c.add(ten);
		//jcombobox
		JComboBox cbten = new JComboBox();
		cbten.setSize(300, 25);
		cbten.setLocation(200,160);
		cbten.addItem("paradon");
		cbten.addItem("Thuoc Doc");
		cbten.addItem("Thuoc chuot");
		c.add(cbten);
		//khai bao quooc gia
		JLabel Quocgia = new JLabel();
		Quocgia.setText("Quoc Gia : ");
		Quocgia.setSize(200, 25);
		Quocgia.setLocation(100,200);
		c.add(Quocgia);
		//Jcombobox
		JComboBox cbQuocgia = new JComboBox();
		cbQuocgia.setSize(300, 25);
		cbQuocgia.setLocation(200,200);
		cbQuocgia.addItem("USA");
		cbQuocgia.addItem("Viet Nam");
		cbQuocgia.addItem("Nhat");
		c.add(cbQuocgia);
		//khai bao nha sx
		JLabel lbnsx = new JLabel();
		lbnsx.setText("Nha San Xuat : ");
		lbnsx.setSize(200, 25);
		lbnsx.setLocation(100,240);
		c.add(lbnsx);
		//text filed
		JTextField tfnsx = new JTextField();
		tfnsx.setSize(300, 25);
		tfnsx.setLocation(200,240);
		c.add(tfnsx);
		//cong thuc
		JLabel congthuc = new JLabel();
		congthuc.setText("Cong Thuc : ");
		congthuc.setSize(200, 25);
		congthuc.setLocation(100,280);
		c.add(congthuc);
		//text filed cong thuc
		JTextField tfcongthuc = new JTextField();
		tfcongthuc.setSize(300, 25);
		tfcongthuc.setLocation(200,280);
		c.add(tfcongthuc);
		//cach dung
		JLabel cachdung = new JLabel();
		cachdung.setText("Cach Dung : ");
		cachdung.setSize(200, 25);
		cachdung.setLocation(100,320);
		c.add(cachdung);
		//text filed cach dung
		JTextField tfcachdung = new JTextField();
		tfcachdung.setSize(300, 25);
		tfcachdung.setLocation(200,320);
		c.add(tfcachdung);
		
		//khai bao don vi
		JLabel donvi = new JLabel();
		donvi.setText("Don Vi : ");
		donvi.setSize(200, 25);
		donvi.setLocation(100,360);
		c.add(donvi);
		//Jcombobox
		JComboBox cbdonvi = new JComboBox();
		cbdonvi.setSize(100, 25);
		cbdonvi.setLocation(200,360);
		cbdonvi.addItem("Tim");
		c.add(cbdonvi);
		
		//khai bao trang thai
		JLabel trangthai = new JLabel();
		trangthai.setText("Trang Thai : ");
		trangthai.setSize(150, 25);
		trangthai.setLocation(320,360);
		c.add(trangthai);
		//Jcombobox
		JComboBox cbtrangthai = new JComboBox();
		cbtrangthai.setSize(100, 25);
		cbtrangthai.setLocation(400,360);
		cbtrangthai.addItem("Con");
		cbtrangthai.addItem("Het");
		c.add(cbtrangthai);
		
		//khai bao soluong
		JLabel soluong = new JLabel();
		soluong.setText("So Luong : ");
		soluong.setSize(200, 25);
		soluong.setLocation(100,400);
		c.add(soluong);
		//text filed
		JTextField tfsoluong = new JTextField();
		tfsoluong.setText("0");
		tfsoluong.setSize(100, 25);
		tfsoluong.setLocation(200,400);
		tfsoluong.setEnabled(false);
		c.add(tfsoluong);
		
		//khai bao gia
		JLabel gia = new JLabel();
		gia.setText("Gia : ");
		gia.setSize(150, 25);
		gia.setLocation(320,400);
		c.add(gia);
		//Jcombobox
		JTextField tfgia = new JTextField();
		tfgia.setSize(100, 25);
		tfgia.setLocation(400,400);
		
		c.add(tfgia);
		//khai bao botton cap nhat
		JButton btcapnhat = new JButton();
		btcapnhat.setText("Cap Nhat");
		btcapnhat.setSize(110, 25);
		btcapnhat.setLocation(230, 450);
		ImageIcon capnhat = new ImageIcon("images/OK.gif");
		btcapnhat.setIcon(capnhat);
		c.add(btcapnhat);
		JButton bthuybo = new JButton();
		bthuybo.setText("Huy Bo");
		bthuybo.setSize(110, 25);
		bthuybo.setLocation(350, 450);
		ImageIcon huybo = new ImageIcon("images/button-cancel-icon.png");
		bthuybo.setIcon(huybo);
		c.add(bthuybo);
		
		this.setVisible(true);
		
	}

}
