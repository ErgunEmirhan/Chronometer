package swingProject.messageBoxAndTextFields;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class YourFrame extends JFrame implements ActionListener {
	JButton button;
	JTextField textField;
	YourFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		this.add(textField);
		
		button = new JButton("Submit");
		button.addActionListener(this);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			System.out.println("Welceome " + textField.getText() + "!");
		}
	}
}