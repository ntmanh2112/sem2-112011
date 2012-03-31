package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.NhanVienModel;

import dao.NhanVienDAO;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class Form extends JFrame {
	
		

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JPanel jPanelSearch = null;
	private JLabel jLabelSearchHoten = null;
	private JTextField txtSearchHoten = null;
	private JLabel jLabelSearchPhong = null;
	private JTextField txtSearchPhong = null;
	private JLabel jLabelDiachi = null;
	private JTextField txtSearchDiachi = null;
	private JButton btnSearch = null;
	private JScrollPane jScrollPane = null;
	private JTable tableNhanvien = null;
	private JPanel jPanel = null;
	private JButton btnNew = null;
	private JButton btnEdit = null;
	private JButton btnDelete = null;
	private String[] ColumnName = {
			"MaNV","HoTen","NgaySinh","DiaChi","Phai","Luong","NguoiQL","Phong"
	};
	private String[][] tableData;
	/**
	 * This is the default constructor
	 */
	public Form() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(964, 438);
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
			jLabel = new JLabel();
			jLabel.setText("DANH SÁCH NHÂN VIÊN");
			jLabel.setLocation(new Point(299, 4));
			jLabel.setSize(new Dimension(298, 30));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 24));
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJPanelSearch(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(getJPanel(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanelSearch	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanelSearch() {
		if (jPanelSearch == null) {
			jLabelDiachi = new JLabel();
			jLabelDiachi.setBounds(new Rectangle(417, 8, 50, 25));
			jLabelDiachi.setText("Địa Chỉ");
			jLabelSearchPhong = new JLabel();
			jLabelSearchPhong.setText("Phòng");
			jLabelSearchPhong.setSize(new Dimension(44, 25));
			jLabelSearchPhong.setLocation(new Point(222, 9));
			jLabelSearchHoten = new JLabel();
			jLabelSearchHoten.setText("Họ Tên");
			jLabelSearchHoten.setSize(new Dimension(44, 25));
			jLabelSearchHoten.setLocation(new Point(12, 9));
			jPanelSearch = new JPanel();
			jPanelSearch.setLayout(null);
			jPanelSearch.setBounds(new Rectangle(76, 39, 788, 42));
			jPanelSearch.add(jLabelSearchHoten, null);
			jPanelSearch.add(getTxtSearchHoten(), null);
			jPanelSearch.add(jLabelSearchPhong, null);
			jPanelSearch.add(getTxtSearchPhong(), null);
			jPanelSearch.add(jLabelDiachi, null);
			jPanelSearch.add(getTxtSearchDiachi(), null);
			jPanelSearch.add(getBtnSearch(), null);
		}
		return jPanelSearch;
	}

	/**
	 * This method initializes txtSearchHoten	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSearchHoten() {
		if (txtSearchHoten == null) {
			txtSearchHoten = new JTextField();
			txtSearchHoten.setBounds(new Rectangle(64, 8, 146, 29));
		}
		return txtSearchHoten;
	}

	/**
	 * This method initializes txtSearchPhong	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSearchPhong() {
		if (txtSearchPhong == null) {
			txtSearchPhong = new JTextField();
			txtSearchPhong.setLocation(new Point(275, 6));
			txtSearchPhong.setSize(new Dimension(130, 30));
		}
		return txtSearchPhong;
	}

	/**
	 * This method initializes txtSearchDiachi	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxtSearchDiachi() {
		if (txtSearchDiachi == null) {
			txtSearchDiachi = new JTextField();
			txtSearchDiachi.setLocation(new Point(472, 6));
			txtSearchDiachi.setSize(new Dimension(183, 30));
		}
		return txtSearchDiachi;
	}

	/**
	 * This method initializes btnSearch	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnSearch() {
		if (btnSearch == null) {
			btnSearch = new JButton();
			btnSearch.setBounds(new Rectangle(677, 5, 95, 30));
			btnSearch.setIcon(new ImageIcon(getClass().getResource("/images/View.gif")));
			btnSearch.setText("Search");
			btnSearch.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					loadDataToTableWhenSearch();
					tableNhanvien.setModel(new DefaultTableModel(tableData, ColumnName));
				}
			});
		}
		return btnSearch;
	}
	public void loadDataToTableWhenSearch (){
		String hoten = txtSearchHoten.getText();
		String phong = txtSearchPhong.getText();
		String diachi = txtSearchDiachi.getText();
		ArrayList<NhanVienModel> listNhanVien = NhanVienDAO.searchNhanVien(hoten, phong, diachi);
		tableData = new String [listNhanVien.size()][9];
		int row = 0;
		for(NhanVienModel model : listNhanVien) {
			tableData [row][0] = model.getManv();
			tableData [row][1] = model.getHonv() + " "+ model.getTenlot()+ " "+model.getTennv();
			tableData [row][2] = model.getNgsinh();
			tableData [row][3] = model.getDiachi();
			tableData [row][4] = model.getPhai();
			tableData [row][5] = model.getLuong();
			tableData [row][6] = model.getManql();
			tableData [row][7] = model.getPhg();
			
			row ++;
		}
	}
	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(76, 88, 790, 246));
			jScrollPane.setViewportView(getTableNhanvien());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes tableNhanvien	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableNhanvien() {
		loadDataToTable();
		if (tableNhanvien == null) {
			tableNhanvien = new JTable(tableData, ColumnName);
		}
		return tableNhanvien;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.setBounds(new Rectangle(188, 345, 564, 42));
			jPanel.add(getBtnNew(), null);
			jPanel.add(getBtnEdit(), null);
			jPanel.add(getBtnDelete(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes btnNew	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnNew() {
		if (btnNew == null) {
			btnNew = new JButton();
			btnNew.setBounds(new Rectangle(57, 7, 87, 29));
			btnNew.setIcon(new ImageIcon(getClass().getResource("/images/add-2-icon.png")));
			btnNew.setText("New");
			btnNew.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
				(new AddNewNhanVien()).setVisible(true);	
				dispose();
				}
			});
		}
		return btnNew;
	}

	/**
	 * This method initializes btnEdit	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnEdit() {
		if (btnEdit == null) {
			btnEdit = new JButton();
			btnEdit.setText("Edit");
			btnEdit.setSize(new Dimension(84, 29));
			btnEdit.setIcon(new ImageIcon(getClass().getResource("/images/Edit-icon.png")));
			btnEdit.setLocation(new Point(225, 8));
			btnEdit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					int row = tableNhanvien.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "Ban chua chon dong muon Edit","thong bao",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = tableNhanvien.getValueAt(row, column).toString();
					NhanVienModel model = new NhanVienModel();
					model.setManv(manvduocluachon);
					(new AddNewNhanVien(model)).setVisible(true);
					dispose();
				}
			});
		}
		return btnEdit;
	}

	/**
	 * This method initializes btnDelete	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnDelete() {
		if (btnDelete == null) {
			btnDelete = new JButton();
			btnDelete.setText("Delete");
			btnDelete.setSize(new Dimension(93, 29));
			btnDelete.setIcon(new ImageIcon(getClass().getResource("/images/button-cancel-icon.png")));
			btnDelete.setLocation(new Point(383, 6));
			btnDelete.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					NhanVienModel mo = new NhanVienModel();
					int row = tableNhanvien.getSelectedRow();
					if(row== -1){
						JOptionPane.showMessageDialog(null, "Ban chua chon dong muon xoa","thong bao",JOptionPane.ERROR_MESSAGE);
						return;
					}
					int column = 0;
					String manvduocluachon = tableNhanvien.getValueAt(row, column).toString();
					mo.setManv(manvduocluachon);
					int yn = JOptionPane.showConfirmDialog(null, "Ban co chac muon xoa khong");
					if(yn == 0){
						Boolean kq = NhanVienDAO.deleteNhanVien(mo);
						if(kq){
							loadDataToTable();
							tableNhanvien.setModel(new DefaultTableModel(tableData,ColumnName));
							JOptionPane.showMessageDialog(null, "Delete Thanh cong","thong bao",JOptionPane.INFORMATION_MESSAGE);
							
						}else {
							JOptionPane.showMessageDialog(null, "Delete That bai","thong bao",JOptionPane.WARNING_MESSAGE);
					
						}
					}
					
				}
			});
		}
		return btnDelete;
	}
	
	private void loadDataToTable(){
		ArrayList<NhanVienModel> listNhanVien = NhanVienDAO.getAllNhanVien();
		tableData = new String[listNhanVien.size()][8];
		int row = 0;
		for (NhanVienModel model:listNhanVien){
			tableData [row][0] = model.getManv();
			tableData [row][1] = model.getHonv() + " " + model.getTenlot() + " " + model.getTennv();
			tableData [row][2] = model.getNgsinh();
			tableData [row][3] = model.getDiachi();
			tableData [row][4] = model.getPhai();
			tableData [row][5] = model.getLuong();
			tableData [row][6] = model.getManql();
			tableData [row][7] = model.getPhg();
			row++;
		}
		
	}
		


}  //  @jve:decl-index=0:visual-constraint="10,10"
