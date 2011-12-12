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
import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.NhanVienModel;

import dao.NhanVienDAO;

import java.awt.GridBagConstraints;
import java.util.ArrayList;

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
		this.setSize(674, 400);
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
			jLabel.setText("Danh sach nhan vien");
			jLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel.setBounds(new Rectangle(181, 2, 204, 16));
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
			jLabelDiachi.setBounds(new Rectangle(291, 12, 38, 25));
			jLabelDiachi.setText("Dia chi");
			jLabelSearchPhong = new JLabel();
			jLabelSearchPhong.setText("Phong");
			jLabelSearchPhong.setSize(new Dimension(44, 25));
			jLabelSearchPhong.setLocation(new Point(164, 10));
			jLabelSearchHoten = new JLabel();
			jLabelSearchHoten.setText("Ho ten");
			jLabelSearchHoten.setSize(new Dimension(44, 25));
			jLabelSearchHoten.setLocation(new Point(4, 13));
			jPanelSearch = new JPanel();
			jPanelSearch.setLayout(null);
			jPanelSearch.setBounds(new Rectangle(19, 23, 561, 56));
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
			txtSearchHoten.setBounds(new Rectangle(55, 8, 102, 29));
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
			txtSearchPhong.setLocation(new Point(219, 8));
			txtSearchPhong.setSize(new Dimension(66, 30));
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
			txtSearchDiachi.setLocation(new Point(348, 7));
			txtSearchDiachi.setSize(new Dimension(104, 30));
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
			btnSearch.setBounds(new Rectangle(468, 7, 85, 30));
			btnSearch.setText("Search");
		}
		return btnSearch;
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(14, 86, 566, 212));
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
			jPanel.setBounds(new Rectangle(15, 305, 564, 50));
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
			btnNew.setBounds(new Rectangle(95, 13, 66, 29));
			btnNew.setText("New");
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
			btnEdit.setSize(new Dimension(66, 29));
			btnEdit.setLocation(new Point(230, 13));
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
			btnDelete.setSize(new Dimension(76, 29));
			btnDelete.setLocation(new Point(353, 15));
		}
		return btnDelete;
	}
	
	private void loadDataToTable(){
		ArrayList<NhanVienModel> listNhanVien = NhanVienDAO.getAllNhanVien();
		tableData = new String[listNhanVien.size()][8];
		int row = 0;
		for (NhanVienModel model:listNhanVien){
			tableData [row][0] = model.getManv();
			tableData [row][1] = model.getHonv() + model.getTenlot() + model.getTennv();
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
