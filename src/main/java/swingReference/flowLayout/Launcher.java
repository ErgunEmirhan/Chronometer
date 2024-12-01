package swingReference.flowLayout;

import javax.swing.*;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ExFlowLayout window = new ExFlowLayout();
				window.show();
				
			}
		});
	}
}