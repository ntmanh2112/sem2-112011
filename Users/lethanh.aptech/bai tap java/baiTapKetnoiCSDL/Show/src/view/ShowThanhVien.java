package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import model.ThanhVienModel;

import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import dao.ThanhVienDao;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

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
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JTextField jTextField = null;
	private JLabel jLabel1 = null;
	private JTextField jTextField1 = null;
	private JButton jButton = null;
	/**
	 * This is the default constructor
	 */
	public ShowThanhVien(ThanhVienModel mo) {
		super();
		this.model = mo;
		initialize();
		tfID.setEditable(false);
		btdelete.setEnabled(false);
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
			jContentPane.add(getJPanel(), null);
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
			btnew.setBounds(new Rectangle(20, 279, 82, 35));
			btnew.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
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
			btupdate.setSize(new Dimension(105, 35));
			btupdate.setPreferredSize(new Dimension(74, 26));
			btupdate.setIcon(new ImageIcon(getClass().getResource("/images/save.gif")));
			btupdate.setLocation(new Point(108, 279));
			btupdate.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					ThanhVienModel model = new ThanhVienModel();
					model.setId(tfID.getText());
					model.setUserName(tftendangnhap.getText().trim());
					model.setPassword(pfmatkhau.getText().trim());
					model.setRoles(tfvaitro.getText().trim());
					
					Boolean kq = ThanhVienDao.updateThanhVien(model);
					if (kq) {
						loadDataToTable();
						jThanhVien.setModel(new DefaultTableModel(tableData,columnNames));
						JOptionPane.showMessageDialog(null, "Cap Nhat Thanh Cong","Thong bao",JOptionPane.INFORMATION_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(null, "Cap Nhat That Bai","Thong Bao",JOptionPane.WARNING_MESSAGE);
					}
				}
			});
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
			btdelete.setSize(new Dimension(96, 35));
			btdelete.setIcon(new ImageIcon(getClass().getResource("/images/button-cancel-icon.png")));
			btdelete.setText("Delete");
			btdelete.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					ThanhVienModel mo = new ThanhVienModel();
					mo.setId(tfID.getText());
					mo.setUserName(tftendangnhap.getText().trim());
					mo.setPassword(pfmatkhau.getText().trim());
					mo.setRoles(tfvaitro.getText().trim());
					int yn = JOptionPane.showConfirmDialog(null, "Ban co chac muon xoa","Thong Bao",JOptionPane.YES_NO_OPTION);
					if (yn==0) {
						Boolean kq = ThanhVienDao.deleteThanhVien(mo);
						if (kq) {
							
							loadDataToTable();
							jThanhVien.setModel(new DefaultTableModel(tableData,columnNames));
							
							tfID.setText(model.getId());
							tftendangnhap.setText(model.getUserName());
							pfmatkhau.setText(model.getPassword());
							tfvaitro.setText(model.getRoles());
							
							
							JOptionPane.showMessageDialog(null, "Delete Thanh Cong","Thong Bao",JOptionPane.INFORMATION_MESSAGE);
						}else {
							JOptionPane.showMessageDialog(null, "Delete That Bai","Thong Bao",JOptionPane.WARNING_MESSAGE);
						}
					}
					
					
				}
			});
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
			jScrollPane.setLocation(new Point(344, 16));
			jScrollPane.setSize(new Dimension(424, 250));
			jScrollPane.setViewportView(getJThanhVien());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jThanhVien	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private void loadDataToTable() {
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
	}
	private JTable getJThanhVien() {
		if (jThanhVien == null) {
			
			//ket noi CSDL va dua vao JTable
			loadDataToTable();
			
			jThanhVien = new JTable(tableData, columnNames);
			jThanhVien.setSize(new Dimension(800, 300));
			jThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					int row = jThanhVien.getSelectedRow();
					int column = jThanhVien.getSelectedColumn();
					String value = jThanhVien.getValueAt(row, column).toString();
					
					System.out.println("row=" + row + "-column" + column);
					System.out.println("Value="+value);
					//lay du lieu ben table qua form thong tin
					tfID.setText(jThanhVien.getValueAt(row, 0).toString());
					tftendangnhap.setText(jThanhVien.getValueAt(row, 1).toString());
					pfmatkhau.setText(jThanhVien.getValueAt(row, 2).toString());
					tfvaitro.setText(jThanhVien.getValueAt(row, 3).toString());
					
					if (!tfID.getText().equals(model.getId())) {
						btdelete.setEnabled(true);
					} else {
						btdelete.setEnabled(false);
					}
				}
			});
		}
		return jThanhVien;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(167, 7, 55, 24));
			jLabel1.setText("Vai Tro");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(7, 5, 59, 28));
			jLabel.setText("TEN DN");
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBorder(BorderFactory.createEtchedBorder());
			jPanel.setLocation(new Point(346, 280));
			jPanel.setSize(new Dimension(419, 37));
			jPanel.add(jLabel, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(jLabel1, null);
			jPanel.add(getJTextField1(), null);
			jPanel.add(getJButton(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setLocation(new Point(66, 6));
			jTextField.setSize(new Dimension(90, 27));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setLocation(new Point(222, 6));
			jTextField1.setSize(new Dimension(90, 27));
		}
		return jTextField1;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setIcon(new ImageIcon(getClass().getResource("/images/View.gif")));
			jButton.setLocation(new Point(321, 4));
			jButton.setSize(new Dimension(96, 27));
			jButton.setText("Search");
		}
		return jButton;
	}

}  //  @jve:decl-index=0:visual-constraint="142,-4"
