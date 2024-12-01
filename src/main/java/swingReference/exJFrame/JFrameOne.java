package swingReference.exJFrame;

import javax.swing.*;

public class JFrameOne extends JFrame{
	public JFrameOne(){
		initialize();
	}
	
	public void initialize(){
		setTitle("JFrameOne");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setVisible(true);
		try {
			Thread.sleep(4000); // 💀
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		setResizable(false);
	}
}