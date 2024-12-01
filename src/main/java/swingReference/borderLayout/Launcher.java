package swingReference.borderLayout;

import javax.swing.*;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				ExBorderLayout exBorderLayout = new ExBorderLayout();
				exBorderLayout.show();
			}
		});
	}
}