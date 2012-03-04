package view;

import java.awt.BorderLayout;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JButton;

import dao.NhanVienDAO;
import dao.PhongBanDAO;

import model.NhanVienModel;
import model.PhongBanModel;

import javax.swing.JTextArea;

import com.toedter.calendar.JDateChooser;
import common.KeyValue;

public class AddNewNhanVien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel j = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JTextField txtHoNV = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JLabel jLabel7 = null;
	private JLabel jLabel8 = null;
	private JTextField txtTenLot = null;
	private JTextField txtTenNV = null;
	private JTextField txtMaNv = null;
	private JDateChooser txtNgaySinhNV = null;
	private JTextField txtDiaChi = null;
	private JComboBox txtGioiTinh = null;
	private JTextField txtLuong = null;
	private JComboBox txtMaNQL = null;
	private JComboBox txtDiemPHG = null;
	private JButton btnAdd = null;
	private JButton btnCancel = null;
	NhanVienModel model = new NhanVienModel(); // @jve:decl-index=0:
	private JTextArea jTextArea = null;

	/**
	 * This is the default constructor
	 */
	public AddNewNhanVien() {
		super();
		initialize();
		if (btnAdd.getText().equals("Add")) {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			try {
				txtNgaySinhNV.setDate(sdf.parse("05/25/1980"));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public AddNewNhanVien(NhanVienModel mo) {
		super();
		this.model = NhanVienDAO.getNhanVienByID(mo.getManv());
		initialize();
		txtHoNV.setText(model.getHonv());
		txtTenLot.setText(model.getTenlot());
		txtTenNV.setText(model.getTennv());
		txtMaNv.setText(model.getManv());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			txtNgaySinhNV
					.setDate(sdf.parse(model.getNgsinh().substring(0, 10)));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		txtDiaChi.setText(model.getDiachi());
		txtGioiTinh.setSelectedItem(model.getPhai().toLowerCase());
		txtLuong.setText(model.getLuong());
		// txtMaNQL.setText(model.getManql());
		ArrayList<NhanVienModel> listNhanVien = NhanVienDAO.getAllNhanVien();
		for (NhanVienModel nql : listNhanVien) {
			KeyValue item = new KeyValue(nql.getManv(), nql.getHonv() + " "
					+ nql.getTenlot() + " " + nql.getTennv());
			txtMaNQL.addItem(item);
			if (model.getManql() != null
					&& item.getKey().equals(model.getManql())) {
				txtMaNQL.setSelectedItem(item);
			}
		}
		// txtDiemPHG.setText(model.getPhg());

		ArrayList<PhongBanModel> listPhongBan = PhongBanDAO.getAll();
		for (PhongBanModel phong : listPhongBan) {
			KeyValue item = new KeyValue(phong.getMaPHG(), phong.getTenPHG());

			txtDiemPHG.addItem(item);
			if (item.getKey().equals(model.getPhg())) {
				txtDiemPHG.setSelectedItem(item);
			}
		}

		btnAdd.setText("Update");
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(568, 277);
		this.setContentPane(getJContentPane());
		this.setTitle("Thêm Mới Nhân Viên");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(299, 121, 73, 16));
			jLabel8.setText("Mã NQL");
			jLabel7 = new JLabel();
			jLabel7.setBounds(new Rectangle(300, 52, 72, 16));
			jLabel7.setText("Giới Tính");
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(302, 15, 57, 16));
			jLabel6.setText("Địa Chỉ");
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(298, 153, 76, 16));
			jLabel5.setText("Điểm PHG");
			jLabel4 = new JLabel();
			jLabel4.setBounds(new Rectangle(299, 91, 68, 16));
			jLabel4.setText("Lương");
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(32, 121, 38, 16));
			jLabel3.setText("Mã NV");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(32, 88, 56, 16));
			jLabel2.setText("Tên");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(30, 154, 64, 16));
			jLabel1.setText("Ngày Sinh");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(33, 53, 53, 16));
			jLabel.setText("Tên Lót");
			j = new JLabel();
			j.setBounds(new Rectangle(32, 17, 38, 16));
			j.setText("Họ");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(j, null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getTxtHoNV(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(jLabel4, null);
			jContentPane.add(jLabel5, null);
			jContentPane.add(jLabel6, null);
			jContentPane.add(jLabel7, null);
			jContentPane.add(jLabel8, null);
			jContentPane.add(getTxtTenLot(), null);
			jContentPane.add(getTxtTenNV(), null);
			jContentPane.add(getTxtMaNv(), null);
			jContentPane.add(getTxtNgaySinhNV(), null);
			jContentPane.add(getTxtDiaChi(), null);
			jContentPane.add(getTxtGioiTinh(), null);
			jContentPane.add(getTxtLuong(), null);
			jContentPane.add(getTxtMaNQL(), null);
			jContentPane.add(getTxtDiemPHG(), null);
			jContentPane.add(getBtnAdd(), null);
			jContentPane.add(getBtnCancel(), null);
			jContentPane.add(getJTextArea(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes txtHoNV
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtHoNV() {
		if (txtHoNV == null) {
			txtHoNV = new JTextField();
			txtHoNV.setBounds(new Rectangle(105, 15, 105, 20));
		}
		return txtHoNV;
	}

	/**
	 * This method initializes txtTenLot
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtTenLot() {
		if (txtTenLot == null) {
			txtTenLot = new JTextField();
			txtTenLot.setBounds(new Rectangle(104, 48, 106, 23));
		}
		return txtTenLot;
	}

	/**
	 * This method initializes txtTenNV
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtTenNV() {
		if (txtTenNV == null) {
			txtTenNV = new JTextField();
			txtTenNV.setBounds(new Rectangle(104, 85, 105, 20));
		}
		return txtTenNV;
	}

	/**
	 * This method initializes txtMaNv
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtMaNv() {
		if (txtMaNv == null) {
			txtMaNv = new JTextField();
			txtMaNv.setBounds(new Rectangle(104, 118, 106, 20));
		}
		return txtMaNv;
	}

	/**
	 * This method initializes txtNgaySinhNV
	 * 
	 * @return javax.swing.JTextField
	 */
	private JDateChooser getTxtNgaySinhNV() {
		if (txtNgaySinhNV == null) {
			txtNgaySinhNV = new JDateChooser();
			txtNgaySinhNV.setDateFormatString("MM/dd/yyyy");
			/*
			 * SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); try {
			 * txtNgaySinhNV.setDate(sdf.parse("05/25/1980")); } catch
			 * (ParseException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */

			txtNgaySinhNV.getDateEditor().setEnabled(false);
			txtNgaySinhNV.setBounds(new Rectangle(104, 151, 105, 20));
		}
		return txtNgaySinhNV;
	}

	/**
	 * This method initializes txtDiaChi
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtDiaChi() {
		if (txtDiaChi == null) {
			txtDiaChi = new JTextField();
			txtDiaChi.setBounds(new Rectangle(392, 14, 105, 20));
		}
		return txtDiaChi;
	}

	/**
	 * This method initializes txtGioiTinh
	 * 
	 * @return javax.swing.JTextField
	 */
	private JComboBox getTxtGioiTinh() {
		if (txtGioiTinh == null) {
			txtGioiTinh = new JComboBox();
			txtGioiTinh.addItem("nam");
			txtGioiTinh.addItem("nu");
			txtGioiTinh.setBounds(new Rectangle(390, 49, 108, 20));
		}
		return txtGioiTinh;
	}

	/**
	 * This method initializes txtLuong
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getTxtLuong() {
		if (txtLuong == null) {
			txtLuong = new JTextField();
			txtLuong.setBounds(new Rectangle(391, 89, 106, 20));
		}
		return txtLuong;
	}

	/**
	 * This method initializes txtMaNQL
	 * 
	 * @return javax.swing.JTextField
	 */
	private JComboBox getTxtMaNQL() {
		if (txtMaNQL == null) {
			txtMaNQL = new JComboBox();
			txtMaNQL.setBounds(new Rectangle(391, 119, 105, 20));
		}
		return txtMaNQL;
	}

	/**
	 * This method initializes txtDiemPHG
	 * 
	 * @return javax.swing.JTextField
	 */
	private JComboBox getTxtDiemPHG() {
		if (txtDiemPHG == null) {
			txtDiemPHG = new JComboBox();
			txtDiemPHG.setBounds(new Rectangle(390, 149, 106, 20));
		}
		return txtDiemPHG;
	}

	/**
	 * This method initializes btnAdd
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnAdd() {
		if (btnAdd == null) {
			btnAdd = new JButton();
			btnAdd.setBounds(new Rectangle(164, 197, 75, 25));
			btnAdd.setText("Add");
			btnAdd.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					NhanVienModel model = new NhanVienModel();
					model.setHonv(txtHoNV.getText());
					model.setTenlot(txtTenLot.getText());
					model.setTennv(txtTenNV.getText());
					model.setManv(txtMaNv.getText());
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
					model.setNgsinh(sdf.format(txtNgaySinhNV.getDate()));
					model.setDiachi(txtDiaChi.getText());
					model.setPhai(txtGioiTinh.getSelectedItem().toString());
					model.setLuong(txtLuong.getText());
					model.setManql(((KeyValue) txtMaNQL.getSelectedItem())
							.getKey());
					model.setPhg(((KeyValue) txtDiemPHG.getSelectedItem())
							.getKey());
					if (btnAdd.getText().equals("Add")) {

						Boolean kq = NhanVienDAO.insertNhanVien(model);
						if (kq) {
							JOptionPane.showMessageDialog(null,
									"Thêm Nhân Viên Thành Công", "Thông Báo",
									JOptionPane.INFORMATION_MESSAGE);
							(new Form()).setVisible(true);
							dispose();
						}
					} else {
						Boolean kq = NhanVienDAO.updateNhanVienNew(model);
						if (kq) {
							JOptionPane.showMessageDialog(null,
									"Cap Nhat Nhân Viên Thành Công",
									"Thông Báo",
									JOptionPane.INFORMATION_MESSAGE);
							(new Form()).setVisible(true);
							dispose();

						}
					}
				}

			});
		}
		return btnAdd;
	}

	/**
	 * This method initializes btnCancel
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setBounds(new Rectangle(285, 197, 77, 24));
			btnCancel.setText("Cancel");
			btnCancel.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int kg = JOptionPane.showConfirmDialog(null,
							"Ban co chac muon thoat", "Thong Bao",
							JOptionPane.OK_CANCEL_OPTION);
					if (kg == 0) {
						(new Form()).setVisible(true);
						dispose();
					}
				}
			});
		}
		return btnCancel;
	}

	/**
	 * This method initializes jTextArea
	 * 
	 * @return javax.swing.JTextArea
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(125, 159, 10, 16));
		}
		return jTextArea;
	}

} // @jve:decl-index=0:visual-constraint="56,10"
