import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		// Drawing a 3D Cube
		
		g.setColor(Color.RED);
		g.drawRect(10, 30, 50, 50);
		g.drawRect(30, 10, 50, 50);
		g.drawLine(60, 30, 80, 10);
		g.drawLine(10, 30, 30, 10);
		g.drawLine(60, 80, 80, 60);
		g.drawLine(10, 80, 30, 60);
		
		// Drawing a 3D Cylinder
		g.setColor(Color.BLUE);
		g.drawOval(100, 10, 50, 20);
		g.drawOval(100, 60, 50, 20);
		g.drawLine(100, 20, 100, 70);
		g.drawLine(150, 20, 150, 70);
	}

}
