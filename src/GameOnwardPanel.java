import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GameOnwardPanel extends JPanel implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	
	final int MENU =0;
	final int GAME=1;
	final int END=2;
	public BufferedImage gameBackground;
	public BufferedImage menuBackground;
	int currentState = MENU;

	public GameOnwardPanel(BufferedImage image){
    menuBackground = image;
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		
		button2.setText("return");
		button1.setText("Click hereto Start Game");
		button3.setText("Click here for Instructions");
		button4.setText("Click here for how to play");
		
		
		button1.addActionListener(this);
	    button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		repaint();
		
		
	
	}
	

	
	void updateMenuState(){
		
	}
	

	void updateGameState(){
		
	}
// test	

	void updateEndState(){
		
	}
	
	void drawMenuState (Graphics g){
		g.drawImage(menuBackground, 0, 0, 300, 600, null);
	}
	
	void drawGameState (Graphics g){
		g.drawImage(gameBackground, 0, 0, 300, 600, null );
	}
void drawEndState (Graphics g){
		
	}

void removeButtons(){
	remove(button1);
	
	remove(button3);
	remove(button4);
}


@Override
public void paintComponent(Graphics g) {
	
	
	if(currentState == MENU) {
		drawMenuState(g);
	}else if(currentState == GAME) {
		drawGameState(g);
		
	}else if(currentState == END) {
		drawEndState(g);
	}
	
}

void loadImage() {
   
        try {
            gameBackground = ImageIO.read(this.getClass().getResourceAsStream("onward wallpaper.jpg"));
	  
        } catch (Exception e) {
            
        
        }
    
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("click");
	if (button3 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "Your goal is to go down into this dark cave, \n collect three keys and find your way back up without dying");
	}
	//button 4 action
	if  (button4 == e.getSource()) {
		JOptionPane.showMessageDialog(null, "Use your arrow keys or 'wasd' to move up, down, left, right. \n Left Click to attack. Right Click to Block ");
	}
	
	if (button1 == e.getSource()) {
	// JOptionPane.showMessageDialog(null, "Game Loading...");	
	currentState = GAME;
	removeButtons();
	loadImage();
	repaint();
	
	
	
	}
	
}
}
