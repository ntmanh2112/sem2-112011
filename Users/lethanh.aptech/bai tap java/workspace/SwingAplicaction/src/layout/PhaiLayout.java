package layout;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PhaiLayout extends JPanel {
	public PhaiLayout() {
		khoiTao();
	}
	public void khoiTao() {
		this.setLayout(new GridLayout(15,1));
		this.setPreferredSize(new Dimension(30,30));
		
		JButton btn01 = new JButton();
		btn01.setIcon(new ImageIcon("images/Add.png"));
		
		JButton btn02 = new JButton();
		btn02.setIcon(new ImageIcon("images/button-cancel-icon.png"));
		
		JButton btn03 = new JButton();
		btn03.setIcon(new ImageIcon("images/Refresh-icon.png"));
		
		JButton btn04 = new JButton();
		btn04.setIcon(new ImageIcon("images/Help.png"));
		
		JButton btn05 = new JButton();
		btn05.setIcon(new ImageIcon("images/Emp.png"));
		
		this.add(btn01);
		this.add(btn02);
		this.add(btn03);
		this.add(btn04);
		this.add(btn05);
	}

}
