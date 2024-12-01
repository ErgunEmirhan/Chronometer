package swingReference.gridLayout;

import javax.swing.*;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ExGridLayout window = new ExGridLayout();
				window.show();
			}
		});
	}
}