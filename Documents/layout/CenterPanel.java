package layout;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CenterPanel extends JPanel {

	public CenterPanel() {
		khoiTao();
	}
	public void khoiTao() {
		this.setLayout(new GridLayout(2,3));
		
		JTextArea area1 = new JTextArea();
		area1.setBorder(BorderFactory.createEtchedBorder());
		JTextArea area2 = new JTextArea();
		area2.setBorder(BorderFactory.createEtchedBorder());
		JTextArea area3 = new JTextArea();
		area3.setBorder(BorderFactory.createEtchedBorder());
		JTextArea area4 = new JTextArea();
		area4.setBorder(BorderFactory.createEtchedBorder());
		JTextArea area5 = new JTextArea();
		area5.setBorder(BorderFactory.createEtchedBorder());
		JTextArea area6 = new JTextArea();
		area6.setBorder(BorderFactory.createEtchedBorder());
		
		this.add(area1);
		this.add(area2);
		this.add(area3);
		this.add(area4);
		this.add(area5);
		this.add(area6);
	}
}
