package swingProject.openWindowFromAnother;

import javax.swing.*;

public class MyFrame extends JFrame{
	JButton button;
	MyFrame(){
		
		ImageIcon icon = new ImageIcon("src/main/resources/images/sevenx.png");
		
		button = new JButton();
		button.setBounds(300,300, 200, 100);
		button.addActionListener(e-> System.out.println("poo"));
		button.setText("I'm but a humble button");
		button.setFocusable(false);
		button.setIcon(icon);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(1000, 675);
		this.add(button);
		
		
		
		this.setVisible(true);
	}
	
	
	
}