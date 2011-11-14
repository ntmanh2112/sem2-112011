package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class thongKeGiaoDich extends JFrame {
	protected JTable table;
	public thongKeGiaoDich() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao();
	}
	public void khoiTao() {
		this.setSize(800, 600);
		
		this.setLayout(null);
		Container c = this.getContentPane();
		
		//khai bao lable
		JLabel lbTitle = new JLabel();
		lbTitle.setText("Thong Ke Giao Dich");
		lbTitle.setLocation(250,50);
		lbTitle.setSize(300,50);
		Font f = new Font("Arial", Font.PLAIN, 30);
		Color mauxanh = new Color(0, 0, 255);
		lbTitle.setForeground(mauxanh);
		lbTitle.setFont(f);
		c.add(lbTitle);
		//ngay bat dau
		JLabel ngaybatdau = new JLabel();
		ngaybatdau.setText("Ngay Bat Dau : ");
		ngaybatdau.setSize(100,25);
		ngaybatdau.setLocation(30, 100);
		c.add(ngaybatdau);
		//combobox ngay bat dau
		JComboBox cbnbd = new JComboBox();
		cbnbd.setSize(100, 18);
		cbnbd.setLocation(150, 105);
		cbnbd.addItem("01/11/2010");
		cbnbd.addItem("03/1/2010");
		cbnbd.setEnabled(false);
		c.add(cbnbd);
		//ngay ket thuc
		JLabel ngayketthuc = new JLabel();
		ngayketthuc.setText("Ngay Ket Thuc : ");
		ngayketthuc.setSize(100,25);
		ngayketthuc.setLocation(30, 130);
		c.add(ngayketthuc);
		//combobox ngay ket thuc
		JComboBox cbnkt = new JComboBox();
		cbnkt.setSize(100, 18);
		cbnkt.setLocation(150, 135);
		cbnkt.addItem("10/12/2010");
		cbnkt.addItem("20/9/2011");
		cbnkt.setEnabled(false);
		c.add(cbnkt);
		//tim kiem
		JButton timkiem = new JButton();
		timkiem.setText("Tim Kiem");
		timkiem.setSize(110, 25);
		timkiem.setLocation(370,130);
		ImageIcon icon = new ImageIcon("images/View.gif");
		timkiem.setIcon(icon);
		c.add(timkiem);
		//huy bo
		JButton huybo = new JButton();
		huybo.setText("Huy Bo");
		huybo.setSize(100, 25);
		huybo.setLocation(500, 130);
		ImageIcon huy = new ImageIcon("images/Symbols-Delete-icon.png");
		huybo.setIcon(huy);
		c.add(huybo);
		//in
		JButton in = new JButton();
		in.setText("In");
		in.setSize(100, 25);
		in.setLocation(620, 130);
		in.setEnabled(false);
		c.add(in);
		//dat mua
		JLabel datmua = new JLabel();
		datmua.setText("Dat Mua :");
		datmua.setSize(100, 50);
		datmua.setLocation(30,150);
		Font fn = new Font("Arial", Font.PLAIN, 18);
		Color mauden = new Color(0, 0, 24);
		datmua.setForeground(mauden);
		datmua.setFont(fn);
		c.add(datmua);
		//ban hang
		JLabel banhang = new JLabel();
		banhang.setText("Ban Hang :");
		banhang.setSize(100, 50);
		banhang.setLocation(370,150);
		Font font = new Font("Arial", Font.PLAIN, 18);
		Color den = new Color(0, 0, 24);
		banhang.setForeground(den);
		banhang.setFont(font);
		c.add(banhang);
		//table dat mua
		String columnNames[] = {"STT","Ngay Nhan","Tra"};
		String data[][] = {{"1","2","3"},{"12","3","4"} };
		JTable tbdatmua = new JTable(data,columnNames);
		
		tbdatmua.setSize(330, 100);
		tbdatmua.setLocation(30,200);
		
		//tbdatmua.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//JScrollPane isp = new JScrollPane(tbdatmua);
		
		c.add(tbdatmua);
		//table ban hang
		 
		String[]columnName = {"STT","Ngay Gui","Tra"};
		String[][] rowdata = {{"","",""},{"","",""} };
		JTable tbbanhang = new JTable(rowdata,columnName);
		tbbanhang.setSize(330, 100);
		tbbanhang.setLocation(400,200);
		//tbbanhang.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		c.add(tbbanhang);
		
		//tien chiet khau
		JLabel tienchietkhau = new JLabel();
		tienchietkhau.setText("Tien Chiet Khau :");
		tienchietkhau.setSize(150, 30);
		tienchietkhau.setLocation(30,320);
		c.add(tienchietkhau);
		//text filed
		JTextField tfchietkhau = new JTextField();
		tfchietkhau.setText("0.000.0000");
		tfchietkhau.setSize(200, 20);
		tfchietkhau.setLocation(150,325);
		tfchietkhau.setEnabled(false);
		c.add(tfchietkhau);
		//tien thue
		JLabel tienthue = new JLabel();
		tienthue.setText("Tien Thue :");
		tienthue.setSize(150, 30);
		tienthue.setLocation(30,350);
		c.add(tienthue);
		//text filed tien thue
		JTextField tftienthue = new JTextField();
		tftienthue.setText("0.000.0000");
		tftienthue.setSize(200, 20);
		tftienthue.setLocation(150,355);
		tftienthue.setEnabled(false);
		c.add(tftienthue);
		//tien tra
		JLabel tientra = new JLabel();
		tientra.setText("Tien Tra :");
		tientra.setSize(150, 30);
		tientra.setLocation(30,380);
		c.add(tientra);
		//text filed tien tra
		JTextField tftientra = new JTextField();
		tftientra.setText("0.000.0000");
		tftientra.setSize(200, 20);
		tftientra.setLocation(150,385);
		tftientra.setEnabled(false);
		c.add(tftientra);
		//tong thanh tien
		JLabel thanhtien = new JLabel();
		thanhtien.setText("Tong Thanh Tien :");
		thanhtien.setSize(150, 30);
		thanhtien.setLocation(30,410);
		c.add(thanhtien);
		//text filed tong thanh tien
		JTextField tfthanhtien = new JTextField();
		tfthanhtien.setText("0.000.0000");
		tfthanhtien.setSize(200, 20);
		tfthanhtien.setLocation(150,415);
		tfthanhtien.setEnabled(false);
		c.add(tfthanhtien);
		//tien no
		JLabel tienno = new JLabel();
		tienno.setText("Tien No :");
		tienno.setSize(150, 30);
		tienno.setLocation(30,440);
		c.add(tienno);
		//text filed tien no
		JTextField tftienno = new JTextField();
		tftienno.setText("0.000.0000");
		tftienno.setSize(200, 20);
		tftienno.setLocation(150,445);
		tftienno.setEnabled(false);
		c.add(tftienno);
		//Jlable ben ban hang
		//tien chiet khau
		JLabel tienchietkhaubh = new JLabel();
		tienchietkhaubh.setText("Tien Chiet Khau :");
		tienchietkhaubh.setSize(150, 30);
		tienchietkhaubh.setLocation(400,320);
		c.add(tienchietkhaubh);
		//text filed
		JTextField tfchietkhaubh = new JTextField();
		tfchietkhaubh.setText("0.000.0000");
		tfchietkhaubh.setSize(200, 20);
		tfchietkhaubh.setLocation(530,325);
		tfchietkhaubh.setEnabled(false);
		c.add(tfchietkhaubh);
		//tien thue
		JLabel tienthuebh = new JLabel();
		tienthuebh.setText("Tien Thue :");
		tienthuebh.setSize(150, 30);
		tienthuebh.setLocation(400,350);
		c.add(tienthuebh);
		//text filed tien thue
		JTextField tftienthuebh = new JTextField();
		tftienthuebh.setText("0.000.0000");
		tftienthuebh.setSize(200, 20);
		tftienthuebh.setLocation(530,355);
		tftienthuebh.setEnabled(false);
		c.add(tftienthuebh);
		//tien tra
		JLabel tientrabh = new JLabel();
		tientrabh.setText("Tien Tra :");
		tientrabh.setSize(150, 30);
		tientrabh.setLocation(400,380);
		c.add(tientrabh);
		//text filed tien tra
		JTextField tftientrabh = new JTextField();
		tftientrabh.setText("0.000.0000");
		tftientrabh.setSize(200, 20);
		tftientrabh.setLocation(530,385);
		tftientrabh.setEnabled(false);
		c.add(tftientrabh);
		//tong thanh tien
		JLabel thanhtienbh = new JLabel();
		thanhtienbh.setText("Tong Thanh Tien :");
		thanhtienbh.setSize(150, 30);
		thanhtienbh.setLocation(400,410);
		c.add(thanhtienbh);
		//text filed tong thanh tien
		JTextField tfthanhtienbh = new JTextField();
		tfthanhtienbh.setText("0.000.0000");
		tfthanhtienbh.setSize(200, 20);
		tfthanhtienbh.setLocation(530,415);
		tfthanhtienbh.setEnabled(false);
		c.add(tfthanhtienbh);
		//tien no
		JLabel tiennobh = new JLabel();
		tiennobh.setText("Tien No :");
		tiennobh.setSize(150, 30);
		tiennobh.setLocation(400,440);
		c.add(tiennobh);
		//text filed tien no
		JTextField tftiennobh = new JTextField();
		tftiennobh.setText("0.000.0000");
		tftiennobh.setSize(200, 20);
		tftiennobh.setLocation(530,445);
		tftiennobh.setEnabled(false);
		c.add(tftiennobh);
		
		this.setVisible(true);
	}
	
}
