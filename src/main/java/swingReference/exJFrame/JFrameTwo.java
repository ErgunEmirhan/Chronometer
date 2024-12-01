package swingReference.exJFrame;

import javax.swing.*;

import java.awt.*;
import java.util.concurrent.Flow;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class JFrameTwo {
	
	private JFrame frame;
	
	public JFrameTwo(){
		initialize();
	}
	
	public void initialize(){
		frame = new JFrame();
		frame.setTitle("JFrameTwo");
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		frame.setSize(500, 400);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.RED);
		
		Button button = new Button("Left");
		panel.add(button);
		
		Button button2 = new Button("Forward");
		panel.add(button2);
		
		Button button3 = new Button("Right");
		panel.add(button3);
		
		// panel.setPreferredSize(new Dimension(250, 250));
		frame.add(panel, BorderLayout.WEST );
		
		frame.setVisible(true);
		
	}
}