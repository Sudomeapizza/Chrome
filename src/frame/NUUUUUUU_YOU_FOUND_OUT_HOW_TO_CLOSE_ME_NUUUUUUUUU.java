package frame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class NUUUUUUU_YOU_FOUND_OUT_HOW_TO_CLOSE_ME_NUUUUUUUUU {     

	public static void main(String args[]) {
		System.setProperty("apple.eawt.quitStrategy", "CLOSE_ALL_WINDOWS");
		System.setProperty("apple.awt.UIElement", "true");
		int x = 0;
		int height = 0;
		int width = 0;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		height = (int) screenSize.getHeight();
		width = (int) screenSize.getWidth();
		JTextField component = new JTextField();
		JFrame myFrame = new JFrame(width + "," + height);
		String text = (width + "," + height);
		JLabel label = new JLabel(text, JLabel.CENTER);
		myFrame.getMaximumSize();
		int lala = (int) (height / 3.5);
		//LSUIElement

		while (x < (lala)) {
			label.setAlignmentX(0);
			label.setAlignmentY(0);
			myFrame = new JFrame("" + text);
			label = new JLabel(text, JLabel.CENTER);
			myFrame.setUndecorated(true);
			myFrame.add(component);
			myFrame.setSize(width, height);
			randomthingofamabobber(myFrame);
			myFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
			myFrame.setLocationRelativeTo(null);
			myFrame.add(label);
			myFrame.setVisible(true);
			width *= 0.99;
			height*= 0.99;
			x++;
			text = String.valueOf(width + "," + height);
			try {
			    Thread.sleep(10);
			} catch(InterruptedException ex) {
			    Thread.currentThread().interrupt();
			}
		}
		myFrame = new JFrame("Hello, try to close me!");
		myFrame.setSize(210, height);
		myFrame.getContentPane().setBackground(Color.BLACK);
		myFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		myFrame.setLocationRelativeTo(null);
		myFrame.setVisible(true);
		
	}
	
	public static void randomthingofamabobber(JFrame myFrame) {
		double num = Math.random();
		if (num > .9) {
			myFrame.getContentPane().setBackground(Color.YELLOW);
		} else if (num > .8) {
			myFrame.getContentPane().setBackground(Color.PINK);
		} else if (num > .7) {
			myFrame.getContentPane().setBackground(Color.BLUE);
		} else if (num > .6) {
			myFrame.getContentPane().setBackground(Color.GREEN);
		} else if (num > .5) {
			myFrame.getContentPane().setBackground(Color.CYAN);
		} else if (num > .4) {
			myFrame.getContentPane().setBackground(Color.PINK);
		} else if (num > .3) {
			myFrame.getContentPane().setBackground(Color.GRAY);
		} else if (num > .2) {
			myFrame.getContentPane().setBackground(Color.ORANGE);
		} else if (num > .1) {
			myFrame.getContentPane().setBackground(Color.RED);
		} else {
			myFrame.getContentPane().setBackground(Color.ORANGE);
		}

	}
}
