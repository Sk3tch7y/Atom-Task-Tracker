package main;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.*;

public class launcher extends Widgets{
	
	JFrame main = new JFrame();
	JPanel start = new JPanel();
	ImageIcon logo = new ImageIcon(("src//logo.png"));
	public launcher() throws IOException{
		
		Scanner file = new Scanner(new File("src//pref.txt"));
		main.setLayout(new BorderLayout());
		main.setExtendedState(JFrame.MAXIMIZED_BOTH);
		main.setResizable(true);
		main.setVisible(true);
		main.setContentPane(start);
		main.setTitle("Pulse Keeper");
		main.setIconImage(logo.getImage());
		start.setBackground(new Color(18, 44, 52));
		main.repaint();
		main.validate();
		start.requestFocus();
		start.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 27) {
					main.setState(Frame.ICONIFIED);
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
			}
		});
	}
	public static void files() throws IOException{
		
		Scanner file = new Scanner(new File("src//savedata.txt"));
		do{
			do {
				if(file.next().equalsIgnoreCase(" ")) {
					do{
					
					}while(file.hasNext());
				}
			}while(file.hasNext());
		}	while(file.hasNextLine());
	}
	
}
