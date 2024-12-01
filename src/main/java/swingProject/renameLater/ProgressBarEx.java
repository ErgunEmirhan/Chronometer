package swingProject.renameLater;

import javax.swing.*;

public class ProgressBarEx {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar();
	
	ProgressBarEx(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 600, 40);
		bar.setStringPainted(true);
		frame.add(bar);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	private void fill() {
		int counter = 0;
		while(counter <= 110){
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			bar.setValue(counter);
			counter += 10;
		}
		
	}
}