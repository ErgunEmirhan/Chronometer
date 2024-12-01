package swingProject.openWindowFromAnother;

import javax.swing.*;
import java.awt.*;

public class JFrameEx {
	
	JFrame frame = new JFrame();
	JLabel label = new JLabel("Greetings from the new window!");
	
	JFrameEx(){
		
		label.setBounds(0, 0, 100, 50);
		label.setFont(new Font(null, Font.PLAIN, 25));
		frame.add(label);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}