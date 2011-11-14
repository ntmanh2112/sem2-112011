package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.JTableHeader;

public class hoaDonBanHang extends JFrame {
	
	public hoaDonBanHang() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao() {
		this.setSize(800, 600);
		this.setLayout(null);
		Container c = this.getContentPane();
		//khai bao lable
		JLabel lable = new JLabel();
		lable.setText("Lap Hoa Don Ban Hang");
		lable.setSize(350, 50);
		lable.setLocation(250,30);
		Font f = new Font("arial", Font.PLAIN, 30);
		Color mauden = new Color(0, 0, 24);
		lable.setForeground(mauden);
		lable.setFont(f);
		c.add(lable);
		//khai bao ten khach hang
		JLabel jkhachhang = new JLabel();
		jkhachhang.setText("Ten Khach Hang :");
		jkhachhang.setSize(100, 30);
		jkhachhang.setLocation(20,80);
		c.add(jkhachhang);
		//combobox khach hang
		JComboBox jbkhachhang = new JComboBox();
		jbkhachhang.setSize(250, 25);
		jbkhachhang.setLocation(130, 83);
		jbkhachhang.addItem("Customer 1");
		c.add(jbkhachhang);
		//khai bao ghi chu
		JLabel lbghichu = new JLabel();
		lbghichu.setText("Ghi Chu :");
		lbghichu.setSize(100, 30);
		lbghichu.setLocation(20, 110);
		c.add(lbghichu);
		//text filed ghi chu
		JTextField tfghichu = new JTextField();
		tfghichu.setSize(250, 25);
		tfghichu.setLocation(130, 113);
		c.add(tfghichu);
		//tien tra
		JLabel lbtientra = new JLabel();
		lbtientra.setText("Tien Tra :"); 
		lbtientra.setSize(100, 30);
		lbtientra.setLocation(20, 140);
		c.add(lbtientra);
		//text filed tien tra
		JTextField tftientra = new JTextField();
		tftientra.setText("0.000.0000");
		tftientra.setSize(100, 25);
		tftientra.setLocation(130, 143);
		c.add(tftientra);
		//loai tien
		JLabel lbloaitien = new JLabel();
		lbloaitien.setText("Loai Tien");
		lbloaitien.setSize(80, 30);
		lbloaitien.setLocation(250, 140);
		c.add(lbloaitien);
		//so HD ban hang
		JLabel lbhoadonbh = new JLabel();
		lbhoadonbh.setText("So HD ban Hang :");
		lbhoadonbh.setSize(100, 30);
		lbhoadonbh.setLocation(20, 170);
		c.add(lbhoadonbh);
		//text filed
		JTextField tfhoadonbh = new JTextField();
		tfhoadonbh.setSize(100, 25);
		tfhoadonbh.setLocation(130, 173);
		c.add(tfhoadonbh);
		//ngay dat
		JLabel lbngaydat = new JLabel();
		lbngaydat.setText("Ngay Dat :");
		lbngaydat.setSize(100, 30);
		lbngaydat.setLocation(400, 80);
		c.add(lbngaydat);
		//combobox ngay dat
		JComboBox cbngaydat = new JComboBox();
		cbngaydat.setSize(150, 25);
		cbngaydat.setLocation(550, 83);
		cbngaydat.addItem("2010-06-15");
		cbngaydat.setEnabled(false);
		c.add(cbngaydat);
		//ngay gui
		JLabel lbngaygui = new JLabel();
		lbngaygui.setText("Ngay Dat :");
		lbngaygui.setSize(100, 30);
		lbngaygui.setLocation(400, 110);
		c.add(lbngaygui);
		//combobox ngay gui
		JComboBox cbngaygui = new JComboBox();
		cbngaygui.setSize(150, 25);
		cbngaygui.setLocation(550, 113);
		cbngaygui.addItem("2010-06-15");
		cbngaygui.setEnabled(false);
		c.add(cbngaygui);
		//ngay tra
		JLabel lbngaytra = new JLabel();
		lbngaytra.setText("Ngay Dat :");
		lbngaytra.setSize(100, 30);
		lbngaytra.setLocation(400, 140);
		c.add(lbngaytra);
		//combobox ngay gui
		JComboBox cbngaytra = new JComboBox();
		cbngaytra.setSize(150, 25);
		cbngaytra.setLocation(550, 143);
		cbngaytra.addItem("2010-06-15");
		cbngaytra.setEnabled(false);
		c.add(cbngaytra);
		//jtable
		
		String[]ColumnNames = {"Ten Thuoc","So Luong","Gia","Tong So Tien"};
		String[][]data = {{"","","",""}};
		JTable tb = new JTable(data,ColumnNames);
		tb.setSize(750, 200);
		tb.setLocation(20, 210);
		c.add(tb);
		//tong so tien
		JLabel lbtongtien = new JLabel();
		lbtongtien.setText("Tong So Tien :");
		lbtongtien.setSize(100, 30);
		lbtongtien.setLocation(20, 430);
		c.add(lbtongtien);
		//text filed tong tien
		JTextField tftongtien = new JTextField();
		tftongtien.setText("0.000.0000");
		tftongtien.setSize(110, 25);
		tftongtien.setLocation(130, 433);
		tftongtien.setEnabled(false);
		c.add(tftongtien);
		//tong thanh tien
		JLabel lbthanhtien = new JLabel();
		lbthanhtien.setText("Tong Thanh Tien :");
		lbthanhtien.setSize(100, 30);
		lbthanhtien.setLocation(20, 470);
		c.add(lbthanhtien);
		//text filed tong tien
		JTextField tfthanhtien = new JTextField();
		tfthanhtien.setText("0.000.0000");
		tfthanhtien.setSize(110, 25);
		tfthanhtien.setLocation(130, 473);
		tfthanhtien.setEnabled(false);
		c.add(tfthanhtien);
		//tien chiet khau
		JLabel lbchietkhau = new JLabel();
		lbchietkhau.setText("Tien Chiet Khau :");
		lbchietkhau.setSize(100, 30);
		lbchietkhau.setLocation(270, 430);
		c.add(lbchietkhau);
		//text filed chiet khau
		JTextField tfchietkhau = new JTextField();
		tfchietkhau.setText("0.000.0000");
		tfchietkhau.setSize(110, 25);
		tfchietkhau.setLocation(400, 433);
		c.add(tfchietkhau);
		//tien thue
		JLabel lbtienthue = new JLabel();
		lbtienthue.setText("Tien Thue :");
		lbtienthue.setSize(100, 30);
		lbtienthue.setLocation(270, 470);
		c.add(lbtienthue);
		//text filed tien thue
		JTextField tftienthue = new JTextField();
		tftienthue.setText("0.000.0000");
		tftienthue.setSize(110, 25);
		tftienthue.setLocation(400, 473);
		tftienthue.setEnabled(false);
		c.add(tftienthue);
		//buton dong y
		JButton btdongy = new JButton();
		btdongy.setText("Dong Y");
		btdongy.setSize(100, 30);
		btdongy.setLocation(530, 430);
		ImageIcon imdongy = new ImageIcon("images/OK.gif");
		btdongy.setIcon(imdongy);
		c.add(btdongy);
		//buton huy bo
		JButton bthuybo = new JButton();
		bthuybo.setText("Huy Bo");
		bthuybo.setSize(100, 30);
		bthuybo.setLocation(640, 430);
		ImageIcon imhuybo = new ImageIcon("images/button-cancel-icon.png");
		bthuybo.setIcon(imhuybo);
		c.add(bthuybo);
		//buton gui thu
		JButton btguithu = new JButton();
		btguithu.setText("Gui Thu");
		btguithu.setSize(100, 30);
		btguithu.setLocation(530, 470);
		ImageIcon imguithu = new ImageIcon("images/Mail.gif");
		btguithu.setIcon(imguithu);
		c.add(btguithu);
		//button in
		JButton btin = new JButton();
		btin.setText("In");
		btin.setSize(100, 30);
		btin.setLocation(640, 470);
		ImageIcon imin = new ImageIcon("images/Print.gif");
		btin.setIcon(imin);
		c.add(btin);

		this.setVisible(true);
	}
	
}
