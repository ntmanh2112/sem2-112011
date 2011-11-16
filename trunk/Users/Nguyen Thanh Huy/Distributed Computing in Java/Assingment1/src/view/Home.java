package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Action;

public class Home extends JFrame {
	public JMenuBar jMenuBar;
	
	public JMenu menuFile;
	public JMenuItem itemExit;
	
	public JMenu menuFunction;
	public JMenuItem itemChooseLogin, itemLoginToServer, itemLogManagement, itemupdatePharmacy;
	
	public Home() {
		initComponents();
	}

	private void initComponents() {
		Container c = this.getContentPane();
		this.setSize(600, 600);
		this.setLayout(null);
		
		jMenuBar = new JMenuBar();
		
		//FILE
		menuFile = new JMenu("File");
		
		itemExit = new JMenuItem("Exit");
		itemExit.addActionListener(new Action(this));
		
		menuFile.add(itemExit);
		
		jMenuBar.add(menuFile);
		
		//FUNCTION
		menuFunction = new JMenu("Function");
		
		itemChooseLogin = new JMenuItem("Choose Login");
		itemChooseLogin.addActionListener(new Action(this));
		itemLoginToServer = new JMenuItem("Login to server");
		itemLoginToServer.addActionListener(new Action(this));
		itemLogManagement = new JMenuItem("Log management");
		itemLogManagement.addActionListener(new Action(this));
		itemupdatePharmacy = new JMenuItem("Update Pharmacy");
		itemupdatePharmacy.addActionListener(new Action(this));
		
		menuFunction.add(itemChooseLogin);
		menuFunction.add(itemLoginToServer);
		menuFunction.add(itemLogManagement);
		menuFunction.add(itemupdatePharmacy);
		
		jMenuBar.add(menuFunction);
		
		
		
		
		this.setJMenuBar(jMenuBar);
		this.setVisible(true);
	}
	
	public static void main(String[] s) {
		new Home();
	}

}
