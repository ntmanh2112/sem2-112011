package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class DemoBorderLayout extends JFrame {
	
	public DemoBorderLayout() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	public void initComponents() {
		this.setLayout(new BorderLayout());
		//this.setPreferredSize(new Dimension(800, 600));
		
		DemoGridLayout panelNORTH = new DemoGridLayout();
		this.add(panelNORTH, BorderLayout.NORTH);
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] s) {
		new DemoBorderLayout();
	}

}
