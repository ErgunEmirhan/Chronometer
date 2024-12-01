package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyBindEx extends JFrame {
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	JFrame frame;
	JLabel label;
	KeyBindEx(){
		frame = new JFrame("KeyBindings egzersiz");
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.blue);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		frame.add(label);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("W"), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("S"), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("A"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("D"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.setVisible(true);
	
	}
	
	public class UpAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()-10);
		}
	}
	public class DownAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(), label.getY()+10);
		}
	}
	public class LeftAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() - 10, label.getY());
		}
	}
	public class RightAction extends AbstractAction{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX() + 10, label.getY());
			
		}
	}
}