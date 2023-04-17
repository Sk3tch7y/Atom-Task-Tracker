package main;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.*;
import java.time.*;


public class Widgets {
	public Widgets(){
		try {
			String year = Objects.toString(Calendar.getInstance().get(Calendar.YEAR));
			FileWriter write = new FileWriter("src//"+ year + ".txt");
			Scanner read = new Scanner("src//"+ year +".txt"); 
		}
		catch(Exception e) {
			String year = Objects.toString(Calendar.getInstance().get(Calendar.YEAR));
			File n = new File("src//" + year + ".txt");
		}
		
	}
	public void date() throws IOException{
		
		String[][] cal = new String[31][2];
		String year = Objects.toString(Calendar.getInstance().get(Calendar.YEAR));
		JPanel date = new JPanel();
		FileWriter write = new FileWriter("src//"+ year + ".txt");
		Scanner read = new Scanner("src//"+ year +".txt"); 
		int loop = 0;
		do {
			do {
				int path = 0;
				String temp = read.next();
				if(temp.equalsIgnoreCase(" ")) {
					temp = read.next();
					path++;
				}
				if(path == 0) {
					cal[loop][0] = cal[loop][0] + temp;
				}
				if(path == 1) {
					cal[loop][1] = cal[loop][1] + temp;
				}
				System.out.println(Arrays.deepToString(cal));
					loop++;
			}while(read.hasNext() && loop < 30 );
			if(read.hasNextLine()) {
			read.nextLine();
			}
		}while(read.hasNextLine());
	}
	public void menu() {
		
	}
	public void top() {
		
	}
	public void save(int profile) {
		
	}
}
