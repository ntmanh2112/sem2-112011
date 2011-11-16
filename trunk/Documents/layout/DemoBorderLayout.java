package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class DemoBorderLayout extends JFrame {
	public DemoBorderLayout() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		khoiTaoThuocTinh();
	}
	public void khoiTaoThuocTinh() {
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(800, 600));
		
		DemoGridLayout panelNORTH = new DemoGridLayout();
		this.add(panelNORTH, BorderLayout.NORTH);
		
		CenterPanel center = new CenterPanel();
		this.add(center, BorderLayout.CENTER);
		
		this.pack();
		this.setVisible(true);
		
	}
}
