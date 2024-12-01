package swingReference.exJFrame;

import javax.swing.*;

public class JFrameDemo {
	public static void main(String[] args) {
		// Run this program on the Event Dispatch Thread (EDT)
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				JFrameTwo frame2 = new JFrameTwo();
				// JFrameOne frame1 = new JFrameOne();
				
			}
		});
	}
}