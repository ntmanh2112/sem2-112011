package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.JMException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
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
		this.setSize(450, 300);
		this.setTitle("Welcome to Login From");
		this.setLayout(null);
		Container c = this.getContentPane();
		
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
		
		//menu help
		JMenu help = new JMenu("Help");
		
		menubar.add(file);
		menubar.add(action);
		menubar.add(help);
		
		file.add(jnew);
		file.add(jopen);
		file.add(jsave);
		file.add(jproperties);
		file.add(jexit);
		action.add(jstart);
		action.add(jpause);
		this.setJMenuBar(menubar);
		this.setVisible(true);
}
}