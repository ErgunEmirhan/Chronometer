package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListEx extends JFrame implements MouseListener {
	JLabel label;
	MouseListEx(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLayout(null);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.green);
		label.setOpaque(true);
		this.add(label);
		label.addMouseListener(this);
		
		this.setVisible(true);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	
	
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse is enter");
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse is exit");
		
	}
}