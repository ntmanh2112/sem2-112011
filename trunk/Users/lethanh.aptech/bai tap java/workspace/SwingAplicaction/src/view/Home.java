package view;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.JMException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Home extends JFrame{

	public Home () {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTao() ;
	}
	public void khoiTao () {
		this.setSize(650, 400);
		this.setTitle("Welcome to Login From");
		this.setLayout(null);
		this.setBackground("white");
		Container c = this.getContentPane();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) (d.getWidth()- 650)/2;
		int y = (int) (d.getHeight()- 400)/2;
		this.setLocation(x,y);
		
		JLabel lbimage = new JLabel();
		ImageIcon im = new ImageIcon("images/wellcome.jpg");
		lbimage.setIcon(im);
		lbimage.setSize(650, 400);
		lbimage.setLocation(0, 0);
		
		c.add(lbimage);
		
		//tao menu
		JMenuBar menubar = new JMenuBar();
		//menu file
		JMenu file = new JMenu("File");
		JMenuItem jnew = new JMenuItem("New");
		JMenuItem jopen = new JMenuItem("Open");
		JMenuItem jsave = new JMenuItem("Save");
		JMenuItem jproperties = new JMenuItem("Properties");
		JMenuItem jexit = new JMenuItem("Exit");
		ImageIcon imnew = new ImageIcon("images/new-icon.png");
		jnew.setIcon(imnew);
		ImageIcon imsave = new ImageIcon("images/save.gif");
		jsave.setIcon(imsave);
		ImageIcon imopen = new ImageIcon("images/open.gif");
		jopen.setIcon(imopen);
		ImageIcon imporprities = new ImageIcon("images/properties.gif");
		jproperties.setIcon(imporprities);
		
		jexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int kq = JOptionPane.showConfirmDialog(null, "Ban muon thoat","Thong bao",JOptionPane.OK_CANCEL_OPTION);
					if (kq == 0) {
						System.exit(1);
					}
				
			}
		});
		//menu action
		JMenu action = new JMenu("Action");
		JMenuItem jstart = new JMenuItem("Start");
		ImageIcon imstart = new ImageIcon("images/start.gif");
		jstart.setIcon(imstart);
		JMenuItem jpause = new JMenuItem("Pause");
		ImageIcon impause = new ImageIcon("images/pause.gif");
		jpause.setIcon(impause);
		//menu funtion
		JMenu funtion = new JMenu("Funtion");
		JMenuItem funtionbai11 = new JMenuItem("bai 1.1");
		funtionbai11.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new LuaChonDangNhap();
			}
		});
		JMenuItem funtionbai12 = new JMenuItem("bai 1.2");
		funtionbai12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new DangNhapMayChu();
			}
		});
		JMenuItem funtionbai13 = new JMenuItem("bai 1.3");
		funtionbai13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new CapNhatThuoc();
			}
		});
		JMenuItem funtionbai14 = new JMenuItem("bai 1.4");
		funtionbai14.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new thongKeGiaoDich();
			}
		});
		JMenuItem funtionbai15 = new JMenuItem("bai 1.5");
		funtionbai15.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new hoaDonBanHang();
			}
		});
		
		//menu help
		JMenu help = new JMenu("Help");
		
		menubar.add(file);
		menubar.add(action);
		menubar.add(funtion);
		menubar.add(help);
		
		file.add(jnew);
		file.add(jopen);
		file.add(jsave);
		file.add(jproperties);
		file.add(jexit);
		action.add(jstart);
		action.add(jpause);
		funtion.add(funtionbai11);
		funtion.add(funtionbai12);
		funtion.add(funtionbai13);
		funtion.add(funtionbai14);
		funtion.add(funtionbai15);
		
		this.setJMenuBar(menubar);
		this.setVisible(true);
}
	private void setBackground(String string) {
		// TODO Auto-generated method stub
		
	}
}