package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EndPanel extends JPanel {
	public EndPanel() {
		khoiTao();
	}
	public void khoiTao() {
		this.setLayout(new GridLayout(1,5));
		
		JLabel o01 = new JLabel("Java Teleport");
		o01.setBorder(BorderFactory.createEtchedBorder());
		//o01.setText("Java Teleport");
		o01.setHorizontalAlignment((int)this.CENTER_ALIGNMENT);
		o01.setForeground(new Color(0,0,225));
		this.setPreferredSize(new Dimension(0,20));
		
		JLabel o02 = new JLabel("Copyright:xxx");
		o02.setBorder(BorderFactory.createEtchedBorder());
		o02.setHorizontalAlignment((int)this.CENTER_ALIGNMENT);
		o02.setForeground(new Color(0,0,072));
		this.setPreferredSize(new Dimension(0,20));
		
		JLabel o03 = new JLabel("0 files queue ");
		o03.setBorder(BorderFactory.createEtchedBorder());
		o03.setHorizontalAlignment((int)this.CENTER_ALIGNMENT);
		//o03.setForeground(new Color(0,0,225));
		this.setPreferredSize(new Dimension(0,20));
		
		JLabel o04 = new JLabel("0 files dowloaded");
		o04.setBorder(BorderFactory.createEtchedBorder());
		o04.setHorizontalAlignment((int)this.CENTER_ALIGNMENT);
		//o04.setForeground(new Color(0,0,225));
		this.setPreferredSize(new Dimension(0,20));
		
		JLabel o05 = new JLabel("18/11/2011");
		o05.setBorder(BorderFactory.createEtchedBorder());
		o05.setHorizontalAlignment((int)this.CENTER_ALIGNMENT);
		//o05.setForeground(new Color(0,0,225));
		this.setPreferredSize(new Dimension(0,20));
		
		this.add(o01);
		this.add(o02);
		this.add(o03);
		this.add(o04);
		this.add(o05);
	}

}
