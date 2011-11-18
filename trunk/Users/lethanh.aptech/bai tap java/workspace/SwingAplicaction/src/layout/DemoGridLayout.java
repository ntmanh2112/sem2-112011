package layout;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DemoGridLayout extends JPanel {
	public DemoGridLayout() {
		khoiTaoThuocTinh();
	}
	
	public void khoiTaoThuocTinh() {
		this.setLayout(new GridLayout(0, 20));
		
		//
		
		
		this.setPreferredSize(new Dimension(25,25));
		
		JButton btn00 = new JButton();
		btn00.setIcon(new ImageIcon("images/new.gif"));
		JButton btn01 = new JButton();
		btn01.setIcon(new ImageIcon("images/open.gif"));
		JButton btn10 = new JButton();
		btn10.setIcon(new ImageIcon("images/save.gif"));
		JButton btn11 = new JButton();
		btn11.setIcon(new ImageIcon("images/properties.gif"));
		JButton btn5 = new JButton();
		btn5.setIcon(new ImageIcon("images/start.gif"));
		JButton btn6 = new JButton();
		btn6.setIcon(new ImageIcon("images/pause.gif"));
		
		this.add(btn00);
		this.add(btn01);
		this.add(btn10);
		this.add(btn11);
		this.add(btn5);
		this.add(btn6);
	}
}
