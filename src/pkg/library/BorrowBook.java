package pkg.library;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

//import j

import pkg.employee.SearchEmployee;

public class BorrowBook extends SearchEmployee {
	static JFrame frame;
	JComboBox<String> employeeCbox,employeeCbox2 ;
	JLabel lblBorrower, lblReturnDate;
	GridBagLayout gbLayout;
	GridBagConstraints gbConstraints;
	
	public BorrowBook() {
		start();
	}
	public void start() {
		// TODO 1 create layout
		// TODO 2 add combobox
		// TODO 3 add date picker
		// TODO 4 get values
		// TODO 5 add to borrower array
		
		frame = new JFrame("Borrow Reference");
		frame.setLayout(new FlowLayout());
		
		lblBorrower = new JLabel("Borrower   ");
		
		lblReturnDate = new JLabel("Return Date   ");
		
		employeeCbox = new JComboBox<String>();
		employeeCbox.setPreferredSize(new Dimension(150,30));
		for(int i = 0; i < employee.size(); i++) {
			employeeCbox.addItem(employee.get(i).getName());
			
		}
		
		employeeCbox2 = new JComboBox<String>();
		employeeCbox.setPreferredSize(new Dimension(150,30));
		for(int i = 0; i < employee.size(); i++) {
			employeeCbox2.addItem(employee.get(i).getName());
			
		}
		
		
		gbLayout = new GridBagLayout();
		
		frame.setLayout(gbLayout);
		gbConstraints = new GridBagConstraints();
	
		gbConstraints.insets = new Insets(10,10,0,0);
		
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		frame.add(lblBorrower, gbConstraints);
		
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 2;
		frame.add(lblReturnDate, gbConstraints);
		
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 0;
		frame.add(employeeCbox, gbConstraints);
		
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		gbConstraints.gridx = 1;
		gbConstraints.gridy = 2;
		frame.add(employeeCbox2, gbConstraints);


		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
}
