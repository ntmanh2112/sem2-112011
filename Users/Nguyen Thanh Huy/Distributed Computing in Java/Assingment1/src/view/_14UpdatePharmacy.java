package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class _14UpdatePharmacy extends JFrame {
	public JLabel lblName, lblCountry, lblManufacturer, lblFormula, lblUsing, lblUnit, lblStatus, lblQuantity, lblPrice;
	public JComboBox cbbName, cbbCountry, cbbUnit, cbbStatus;
	public JTextField txtManufacturer, txtFormula, txtUsing, txtQuantity, txtPrice;
	public JButton btnUpdate, btnCancel;
	
	public _14UpdatePharmacy() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		Container c = this.getContentPane();
		this.setTitle("Update Pharmacy");
		this.setSize(600, 600);
		this.setLayout(null);
		
		//NAME
		lblName = new JLabel("Name: ");
		lblName.setSize(150, 20);
		lblName.setLocation(50, 100);
		c.add(lblName);
		cbbName = new JComboBox();
		cbbName.setSize(300, 25);
		cbbName.setLocation(150, 100);
		c.add(cbbName);
		
		//COUNTRY
		lblCountry = new JLabel("Country: ");
		lblCountry.setSize(150, 20);
		lblCountry.setLocation(50, 150);
		c.add(lblCountry);
		cbbCountry = new JComboBox();
		cbbCountry.setSize(300, 25);
		cbbCountry.setLocation(150, 150);
		c.add(cbbCountry);
		
		//MANUFACTURER
		lblManufacturer = new JLabel("Manufacturer: ");
		lblManufacturer.setSize(150, 20);
		lblManufacturer.setLocation(50, 200);
		c.add(lblManufacturer);
		txtManufacturer = new JTextField();
		txtManufacturer.setSize(300, 25);
		txtManufacturer.setLocation(150, 200);
		c.add(txtManufacturer);
		
		//FOMULA
		lblFormula = new JLabel("Formula: ");
		lblFormula.setSize(150, 20);
		lblFormula.setLocation(50, 250);
		c.add(lblFormula);
		txtFormula = new JTextField();
		txtFormula.setSize(300, 25);
		txtFormula.setLocation(150, 250);
		c.add(txtFormula);
		
		//USING
		lblUsing = new JLabel("Using: ");
		lblUsing.setSize(150, 20);
		lblUsing.setLocation(50, 300);
		c.add(lblUsing);
		txtUsing = new JTextField();
		txtUsing.setSize(300, 25);
		txtUsing.setLocation(150, 300);
		c.add(txtUsing);
		
		//UNIT
		lblUnit = new JLabel("Unit: ");
		lblUnit.setSize(150, 20);
		lblUnit.setLocation(50, 350);
		c.add(lblUnit);
		cbbUnit = new JComboBox();
		cbbUnit.setSize(100, 25);
		cbbUnit.setLocation(150, 350);
		c.add(cbbUnit);
		
		//STATUS
		lblStatus = new JLabel("Status: ");
		lblStatus.setSize(150, 20);
		lblStatus.setLocation(300, 350);
		c.add(lblStatus);
		cbbStatus = new JComboBox();
		cbbStatus.setSize(100, 25);
		cbbStatus.setLocation(350, 350);
		c.add(cbbStatus);
		
		//UNIT
		lblQuantity = new JLabel("Quantity: ");
		lblQuantity.setSize(150, 20);
		lblQuantity.setLocation(50, 400);
		c.add(lblQuantity);
		txtQuantity = new JTextField();
		txtQuantity.setSize(100, 25);
		txtQuantity.setLocation(150, 400);
		c.add(txtQuantity);
		
		//PRICE
		lblPrice = new JLabel("Price: ");
		lblPrice.setSize(150, 20);
		lblPrice.setLocation(300, 400);
		c.add(lblPrice);
		txtPrice = new JTextField();
		txtPrice.setSize(100, 25);
		txtPrice.setLocation(350, 400);
		c.add(txtPrice);
		
		//BUTTONS
		btnUpdate = new JButton("Update");
		btnUpdate.setSize(100, 25);
		btnUpdate.setLocation(190, 450);
		c.add(btnUpdate);
		btnCancel = new JButton("Cancel");
		btnCancel.setSize(100, 25);
		btnCancel.setLocation(310, 450);
		c.add(btnCancel);
		
		
		
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new _14UpdatePharmacy();
	}
}
