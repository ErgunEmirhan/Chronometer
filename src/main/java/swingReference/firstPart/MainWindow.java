package swingReference.firstPart;

import javax.swing.*;

public class MainWindow {
	
	private JFrame window;
	
	public MainWindow(){
		window = new JFrame();
		window.setTitle("HelloWorld!");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setSize(800, 500);
		window.setLocationRelativeTo(null);
	}
	
	public void show(){
		window.setVisible(true);
	}
}