package swingProject.openWindowFromAnother;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Launc implements ActionListener {
	JFrame frame = new JFrame();
	JButton button = new JButton("Click to open a new window");
	Launc(){
		
		button.setBounds(400, 300,220, 60);
		button.setFocusable(false);
		button.addActionListener(this);
		frame.add(button);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			frame.dispose();
			JFrameEx window = new JFrameEx();
		}
	}
}