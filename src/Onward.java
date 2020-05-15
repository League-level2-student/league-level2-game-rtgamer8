import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Onward implements KeyListener, ActionListener  {
	public static final int HEIGHT = 0;
	public static BufferedImage image;
	public static int WIDTH;
	JFrame frame = new JFrame();
	GameOnwardPanel panel;

public static void main(String[] args) {
	Onward onward = new Onward();
	
	onward.start();
	
}

Onward(){
	try {
		image = ImageIO.read(this.getClass().getResourceAsStream("New Onwards Logo.PNG"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	panel = new GameOnwardPanel(image);
	frame.setPreferredSize(new Dimension(300,600) );
}
	public void start() {

	
	frame.add(panel);
	
	
	frame.setVisible(true);
	frame.addKeyListener(this);

	
	int key1 = 0;
	int key2 = 1;
	int key3 = 2;
	
frame.pack();
	
  

}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// here
		//button 3 action
	
		
frame.repaint();
frame.revalidate();
frame.pack();
	}
void drawMenuState (Graphics g){
		
		
	}
}
