package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectFileEx extends JFrame implements ActionListener {
	JButton button = new JButton("Select a file");
	
	SelectFileEx(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select a file");
		button.addActionListener(this);
		this.add(button);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button){
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showOpenDialog(null);
		}
	}
}