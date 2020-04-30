import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
public BufferedImage background;
GamePanel(BufferedImage image){
	background=image;
	repaint();
}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 300, 600, null );
		System.out.println( background );
}
}
