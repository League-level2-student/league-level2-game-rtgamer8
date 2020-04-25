import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Onward {
public static void main(String[] args) {
	
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	
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
	panel.add(button5);
	
	frame.pack();
	
	frame.setVisible(true);
	panel.addactionlistener.javax.swing.listener();
	
	frame.pack();
}
}
