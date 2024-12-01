package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JCheckBoxEx extends JFrame implements ActionListener {
	JButton button;
	JCheckBox checkBox;
	JCheckBoxEx(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton();
		button.setText("submit");
		button.addActionListener(this);
		this.add(button);
		
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm a trustworthy person");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 40));
		
		this.add(checkBox);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			System.out.println(checkBox.isSelected());
		}
	}
}