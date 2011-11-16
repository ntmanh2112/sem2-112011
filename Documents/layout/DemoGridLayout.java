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
		
		//this.setPreferredSize(new Dimension(800,100));
		
		JButton btn00 = new JButton();
		btn00.setIcon(new ImageIcon("images/Home-32.png"));
		JButton btn01 = new JButton();
		btn01.setIcon(new ImageIcon("images/info-icon.png"));
		JButton btn10 = new JButton();
		btn10.setIcon(new ImageIcon("images/Help-File-icon.png"));
		JButton btn11 = new JButton();
		btn11.setIcon(new ImageIcon("images/Log-Out-icon.png"));
		
		
		this.add(btn00);
		this.add(btn01);
		this.add(btn10);
		this.add(btn11);
		
	}
}
