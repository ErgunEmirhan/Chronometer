package swingReference.firstPart;

import javax.swing.*;

public class First {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainWindow main = new MainWindow();
				main.show();
			}
		});
	}
}