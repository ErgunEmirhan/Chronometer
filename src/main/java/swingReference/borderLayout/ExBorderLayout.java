package swingReference.borderLayout;

import javax.swing.*;
import java.awt.*;

public class ExBorderLayout {
	
	private JFrame frame;
	
	public ExBorderLayout(){
		initialize();
	}
	
	public void initialize(){
		frame = new JFrame("borderLayoutExmpel");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(800, 600);
		
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(10);
		borderLayout.setVgap(10);
		frame.setLayout(borderLayout);
		
		frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		frame.setLocationRelativeTo(null);
	}
	
	public void show(){
		frame.setVisible(true);
	}
}