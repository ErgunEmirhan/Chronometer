package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListEx extends JFrame implements KeyListener {
	JLabel label;
	KeyListEx(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(null);
		
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		this.add(label);
		
		this.setVisible(true);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()){
			case 'w': label.setLocation(label.getX(), label.getY() - 100); break;
			case 'a': label.setLocation(label.getX() - 100, label.getY()); break;
			case 's': label.setLocation(label.getX(), label.getY() + 100); break;
			case 'd': label.setLocation(label.getX()  + 100, label.getY()); break;
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
}