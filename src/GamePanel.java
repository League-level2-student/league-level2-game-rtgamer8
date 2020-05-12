import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
public BufferedImage background;
final int MENU = 0;
final int GAME = 1;
final int END = 2;
int currentState = MENU;
GamePanel(BufferedImage image){
	background=image;
	repaint();
}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawImage(background, 0, 0, 300, 600, null );
		System.out.println( background );
		if(currentState == MENU) {
			drawMenuState(g);
		}else if(currentState == GAME) {
			drawGameState(g);
		}else if(currentState == END) {
			drawEndState(g);
		}
}
	
	




void updateMenuState(Graphics g) {
	
}

void updateGameState(Graphics g) {
	
}

void updateEndState(Graphics g) {
	
}

void drawMenuState(Graphics g) {

}

void drawGameState(Graphics g) {

}

void drawEndState(Graphics g) {

}










}	


