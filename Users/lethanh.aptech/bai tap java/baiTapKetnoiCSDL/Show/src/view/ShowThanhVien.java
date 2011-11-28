package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import model.ThanhVienModel;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.ThanhVienDao;

public class ShowThanhVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel lbChiTietThanhVien = null;
	private JLabel lbId = null;
	private JLabel lbTenDangNhap = null;
	private JLabel lbmatkhau = null;
	private JLabel lbvaitro = null;
	private JTextField tfID = null;
	private JTextField tftendangnhap = null;
	private JPasswordField pfmatkhau = null;
	private JTextField tfvaitro = null;
	private JButton btnew = null;
	private JButton btupdate = null;
	private JButton btdelete = null;
	
	private String[] columnNames = {"ID","USERNAME","PASSWORD","ROLES"};
	private String[][] tableData;
	
	private ThanhVienModel model = null;
	private JScrollPane jScrollPane = null;
	private JTable jThanhVien = null;
	/**
	 * This is the default constructor
	 */
	public ShowThanhVien(ThanhVienModel mo) {
		super();
		this.model = mo;
		initialize();
	}
	
	public ShowThanhVien() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(800, 400);
		this.setContentPane(getJContentPane());
		this.setTitle("JFrame");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbvaitro = new JLabel();
			lbvaitro.setBounds(new Rectangle(16, 211, 113, 34));
			lbvaitro.setText("Vai Tro");
			lbmatkhau = new JLabel();
			lbmatkhau.setBounds(new Rectangle(17, 168, 115, 34));
			lbmatkhau.setText("Mat Khau");
			lbTenDangNhap = new JLabel();
			lbTenDangNhap.setBounds(new Rectangle(15, 126, 118, 32));
			lbTenDangNhap.setText("Ten Dang Nhap");
			lbId = new JLabel();
			lbId.setBounds(new Rectangle(16, 90, 47, 27));
			lbId.setText("ID");
			lbChiTietThanhVien = new JLabel();
			lbChiTietThanhVien.setBounds(new Rectangle(45, 14, 253, 62));
			lbChiTietThanhVien.setFont(new Font("Dialog", Font.BOLD, 24));
			lbChiTietThanhVien.setForeground(new Color(123, 193, 101));
			lbChiTietThanhVien.setText("Chi Tiet Thanh Vien");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(lbChiTietThanhVien, null);
			jContentPane.add(lbId, null);
			jContentPane.add(lbTenDangNhap, null);
			jContentPane.add(lbmatkhau, null);
			jContentPane.add(lbvaitro, null);
			jContentPane.add(getTfID(), null);
			jContentPane.add(getTftendangnhap(), null);
			jContentPane.add(getPfmatkhau(), null);
			jContentPane.add(getTfvaitro(), null);
			jContentPane.add(getBtnew(), null);
			jContentPane.add(getBtupdate(), null);
			jContentPane.add(getBtdelete(), null);
			jContentPane.add(getJScrollPane(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes tfID	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfID() {
		if (tfID == null) {
			tfID = new JTextField();
			tfID.setText(model.getId());
			tfID.setBounds(new Rectangle(151, 90, 163, 31));
		}
		return tfID;
	}

	/**
	 * This method initializes tftendangnhap	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTftendangnhap() {
		if (tftendangnhap == null) {
			tftendangnhap = new JTextField();
			tftendangnhap.setText(model.getUserName());
			tftendangnhap.setLocation(new Point(151, 129));
			tftendangnhap.setSize(new Dimension(163, 31));
		}
		return tftendangnhap;
	}

	/**
	 * This method initializes pfmatkhau	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getPfmatkhau() {
		if (pfmatkhau == null) {
			pfmatkhau = new JPasswordField();
			pfmatkhau.setText(model.getPassword());
			pfmatkhau.setLocation(new Point(151, 171));
			pfmatkhau.setSize(new Dimension(163, 31));
		}
		return pfmatkhau;
	}

	/**
	 * This method initializes tfvaitro	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTfvaitro() {
		if (tfvaitro == null) {
			tfvaitro = new JTextField();
			tfvaitro.setText(model.getRoles());
			tfvaitro.setBounds(new Rectangle(151, 215, 164, 28));
		}
		return tfvaitro;
	}

	/**
	 * This method initializes btnew	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnew() {
		if (btnew == null) {
			btnew = new JButton();
			btnew.setBounds(new Rectangle(20, 279, 70, 35));
			btnew.setText("New");
		}
		return btnew;
	}

	/**
	 * This method initializes btupdate	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtupdate() {
		if (btupdate == null) {
			btupdate = new JButton();
			btupdate.setText("Update");
			btupdate.setSize(new Dimension(89, 35));
			btupdate.setPreferredSize(new Dimension(74, 26));
			btupdate.setLocation(new Point(106, 280));
		}
		return btupdate;
	}

	/**
	 * This method initializes btdelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtdelete() {
		if (btdelete == null) {
			btdelete = new JButton();
			btdelete.setPreferredSize(new Dimension(70, 25));
			btdelete.setLocation(new Point(220, 281));
			btdelete.setSize(new Dimension(89, 35));
			btdelete.setText("Delete");
		}
		return btdelete;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(344, 16, 424, 303));
			jScrollPane.setViewportView(getJThanhVien());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jThanhVien	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJThanhVien() {
		if (jThanhVien == null) {
			
			//ket noi CSDL va dua vao JTable
			ArrayList<ThanhVienModel> listThanhVien = ThanhVienDao.getallThanhVien();
			tableData = new String [listThanhVien.size()][4];
			int row = 0;
			
			for (ThanhVienModel model : listThanhVien) {
				//do du lieu tu ArrayList ==> tableData
				tableData[row][0] = model.getId();
				tableData[row][1] = model.getUserName();
				tableData[row][2] = model.getPassword();
				tableData[row][3] = model.getRoles();
				
				row++;
			}
			
			jThanhVien = new JTable(tableData, columnNames);
			jThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int row = jThanhVien.getSelectedRow();
					int column = jThanhVien.getSelectedColumn();
					String value = jThanhVien.getValueAt(row, column).toString();
					
					System.out.println("row=" + row + "-column" + column);
					System.out.println("Value="+value);
				}
			});
		}
		return jThanhVien;
	}

}  //  @jve:decl-index=0:visual-constraint="142,-4"
