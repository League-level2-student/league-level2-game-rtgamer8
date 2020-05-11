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
	frame.setPreferredSize(new Dimension(300,600) );
}
	public void start() {
	

	
	frame.pack();
	
	button1.setText("Click hereto Start Game");
	button3.setText("Click here for Instructions");
	button4.setText("Click here for how to play");
	
	frame.pack();
	
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	button1.addActionListener(this);
    button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	frame.pack();
	
	frame.setVisible(true);
	frame.addKeyListener(this);

	frame.pack();

	int key1 = 0;
	int key2 = 1;
	int key3 = 2;
	
	frame.revalidate();
	panel.revalidate();
	frame.repaint();
	panel.repaint();
	frame.repaint();
	frame.revalidate();
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
		if (button3 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Your goal is to go down into this dark cave, \n collect three keys and find your way back up without dying");
		}
		//button 4 action
		if  (button4 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Use your arrow keys or 'wasd' to move up, down, left, right. \n Left Click to attack. Right Click to Block ");
		}
		
		if (button1 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "Game Loading...");	
	
		JOptionPane.showMessageDialog(null, "");
		
		}
		
frame.repaint();
frame.revalidate();
frame.pack();
	}
void drawMenuState (Graphics g){
		g.draw3DRect(0, 10, 10, 20, true);
	}
}
