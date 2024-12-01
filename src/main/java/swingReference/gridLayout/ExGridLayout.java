package swingReference.gridLayout;

import javax.swing.*;
import java.awt.*;

public class ExGridLayout {
	private JFrame frame;
	private JPanel panel;
	
	public ExGridLayout(){
		init();
	}
	
	public void init(){
		frame = new JFrame("gridLayoutExerciess");
		frame.setSize(new Dimension(800, 600));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		panel = new JPanel(new GridLayout());
		
		for (int i = 0; i <= 5; i++) {
			JButton button = new JButton("Button " + i);
			panel.add(button);
		}
		
		frame.add(panel);
		
		frame.pack();
	}
	
	public void show(){
		frame.setVisible(true);
	}
}