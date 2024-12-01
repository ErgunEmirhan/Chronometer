package swingProject.renameLater;

import javax.swing.*;
import java.awt.*;

public class DragDropFrame extends JFrame  {
	DragDropPanel dragPanel = new DragDropPanel();
	public DragDropFrame(){
		this.setTitle("Drags&Drops");
		this.setSize(800, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.add(dragPanel);
		
		
		this.setVisible(true);
	}
}