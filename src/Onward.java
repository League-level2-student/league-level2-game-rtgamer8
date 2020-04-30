import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Onward implements KeyListener {
	public static BufferedImage image;
	JFrame frame = new JFrame();
	GamePanel panel;
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
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
	panel = new GamePanel( image);
}
	public void start() {
	

	
	frame.pack();
	
	button1.setText("Click to Start Game");
	button2.setText("Click here to End Game");
	button3.setText("Click for Instructions");
	button4.setText("Click to return to the start page");
	
	frame.pack();
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);

	
	frame.pack();
	
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.setSize(400, 600);
	frame.pack();

	int key1 = 0;
	int key2 = 1;
	int key3 = 2;
	
	frame.revalidate();
	panel.revalidate();
	frame.repaint();
	panel.repaint();
	
	
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
	
}
