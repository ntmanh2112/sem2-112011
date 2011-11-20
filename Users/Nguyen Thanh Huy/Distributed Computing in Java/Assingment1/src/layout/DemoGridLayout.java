package layout;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DemoGridLayout extends JPanel {
	public DemoGridLayout() {
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}
	
	public void initComponents() {
		//this.setTitle("Demo GridLayout");
		this.setLayout(new GridLayout(0, 15));
		this.setPreferredSize(new Dimension(800, 50));
		
		JButton btn00 = new JButton();
		btn00.setIcon(new ImageIcon("images/Home-32.png"));
		JButton btn01 = new JButton();
		btn01.setIcon(new ImageIcon("images/pencil_48.png"));
		JButton btn10 = new JButton();
		btn10.setIcon(new ImageIcon("images/Refresh-icon_2.png"));
		JButton btn11 = new JButton();
		btn11.setIcon(new ImageIcon("images/Log-Out-icon.png"));
		
		
		this.add(btn00);
		this.add(btn01);
		this.add(btn10);
		this.add(btn11);
	}
}
