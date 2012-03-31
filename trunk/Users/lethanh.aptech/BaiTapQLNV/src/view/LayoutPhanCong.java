package view;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ListModel;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.ImageIcon;

import model.DeAnModel;
import model.NhanVienModel;
import model.PhongBanModel;

import common.KeyValue;

import dao.DeAnDAO;
import dao.NhanVienDAO;
import dao.PhanCongDAO;
import dao.PhongBanDAO;

public class LayoutPhanCong extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JComboBox cbnTenDeAn = null;
	private JList listTrai = null;
	private JLabel jLabel2 = null;
	private JLabel jLabel3 = null;
	private JList listPhai = null;
	private JButton btn1 = null;
	private JButton btn2 = null;
	private JButton btn3 = null;
	private JButton btn4 = null;
	private JButton btnPrint = null;
	DeAnModel model = new DeAnModel();  //  @jve:decl-index=0:
	/**
	 * This is the default constructor
	 */
	public LayoutPhanCong() {
		super();
		initialize();
		ArrayList<DeAnModel> listDeAn = DeAnDAO.getAll();
		for (DeAnModel dean : listDeAn) {
			KeyValue item = new KeyValue(dean.getMADA(), dean.getTENDA());

			cbnTenDeAn.addItem(item);
			
		}
	}
	public LayoutPhanCong(NhanVienModel mo) {
		super();
		initialize();
		
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(916, 482);
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
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(573, 103, 220, 16));
			jLabel3.setText("DANH SÁCH NHÂN VIÊN ĐÃ THAM GIA");
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(74, 103, 231, 16));
			jLabel2.setText("DANH SÁCH NHÂN VIÊN CHƯA THAM GIA");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(226, 64, 77, 27));
			jLabel1.setText("TÊN ĐỀ ÁN");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(272, 10, 331, 42));
			jLabel.setFont(new Font("Dialog", Font.BOLD, 18));
			jLabel.setText("PHÂN CÔNG ĐỀ ÁN CHO NHÂN VIÊN");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(getCbnTenDeAn(), null);
			jContentPane.add(getListTrai(), null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(jLabel3, null);
			jContentPane.add(getListPhai(), null);
			jContentPane.add(getBtn1(), null);
			jContentPane.add(getBtn2(), null);
			jContentPane.add(getBtn3(), null);
			jContentPane.add(getBtn4(), null);
			jContentPane.add(getBtnPrint(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes cbnTenDeAn	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getCbnTenDeAn() {
		if (cbnTenDeAn == null) {
			cbnTenDeAn = new JComboBox();
			cbnTenDeAn.setBounds(new Rectangle(330, 63, 208, 32));
			cbnTenDeAn.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()"); // TODO Auto-generated Event stub actionPerformed()
					String madean = ((KeyValue)cbnTenDeAn.getSelectedItem()).getKey();
					ArrayList<NhanVienModel> listphancongphai = PhanCongDAO.timnhanviendaphancong(madean);
						
					DefaultListModel contentList = new DefaultListModel();
					for (NhanVienModel mo : listphancongphai) {
						contentList.addElement(mo.getHonv() + " " + mo.getTenlot() + " " + mo.getTennv());
					}
					listPhai.setModel(contentList);
					
					ArrayList<NhanVienModel> listphancongtrai = PhanCongDAO.timnhanvienchuaphancong(madean);
					
					DefaultListModel content = new DefaultListModel();
					for (NhanVienModel mo : listphancongtrai) {
						content.addElement(mo.getHonv() + " " + mo.getTenlot() + " " + mo.getTennv());
					}
					listTrai.setModel(content);
					
				}
				
			});
		}
		return cbnTenDeAn;
	}

	/**
	 * This method initializes listTrai	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getListTrai() {
		if (listTrai == null) {
			listTrai = new JList();
			listTrai.setBounds(new Rectangle(16, 126, 375, 243));
			listTrai.setBorder(BorderFactory.createEtchedBorder());
		}
		return listTrai;
	}

	/**
	 * This method initializes listPhai	
	 * 	
	 * @return javax.swing.JList	
	 */
	private JList getListPhai() {
		if (listPhai == null) {
			listPhai = new JList();
			listPhai.setLocation(new Point(502, 126));
			listPhai.setSize(new Dimension(375, 243));
			listPhai.setBorder(BorderFactory.createEtchedBorder());
		}
		return listPhai;
	}

	/**
	 * This method initializes btn1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton();
			btn1.setBounds(new Rectangle(412, 146, 70, 27));
			btn1.setText(">");
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					
				}
			});
		}
		return btn1;
	}

	/**
	 * This method initializes btn2	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton();
			btn2.setLocation(new Point(412, 199));
			btn2.setText(">>");
			btn2.setSize(new Dimension(70, 27));
		}
		return btn2;
	}

	/**
	 * This method initializes btn3	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton();
			btn3.setSize(new Dimension(70, 27));
			btn3.setText("<");
			btn3.setLocation(new Point(412, 256));
		}
		return btn3;
	}

	/**
	 * This method initializes btn4	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton();
			btn4.setLocation(new Point(412, 308));
			btn4.setText("<<");
			btn4.setSize(new Dimension(70, 27));
		}
		return btn4;
	}

	/**
	 * This method initializes btnPrint	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getBtnPrint() {
		if (btnPrint == null) {
			btnPrint = new JButton();
			
			btnPrint.setBounds(new Rectangle(401, 389, 96, 33));
			btnPrint.setIcon(new ImageIcon(getClass().getResource("/images/Print.png")));
			btnPrint.setText("Print");
		}
		return btnPrint;
	}
	/*public void loadDataToTableTrai() {
		ArrayList<E>
	}*/

}  //  @jve:decl-index=0:visual-constraint="8,8"
