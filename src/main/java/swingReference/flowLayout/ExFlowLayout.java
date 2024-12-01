package swingReference.flowLayout;

import javax.swing.*;
import java.awt.*;

public class ExFlowLayout {
	
	private JFrame frame;
	private JPanel panel;
	
	public ExFlowLayout(){
		initialize();
	}
	
	public void initialize(){
		frame = new JFrame();
		frame.setTitle("flowLayoutExcercises");
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.PINK);
		
		for (int i = 0; i <= 5; i++) {
			JButton button = new JButton("button" + i);
			panel.add(button);
		}
		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		
		frame.add(panel, BorderLayout.CENTER);
	}
	
	public void show(){
		frame.setVisible(true);
	}
}