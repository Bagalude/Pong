package pong;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

public class Var {
	
	static JButton btn = new JButton("Schneller");
	static JFrame jf1;
	static int screenwidth = 800, screenheight = 600;
	
	static int x = 20, y = 185;
	static int p = 755, q = 185;
	static int gegnerx = 755, gegnery = 185;
	static int ballx = 200, bally = 200;
	
	static boolean moveup = false, movedown = false, moveup2 = false, movedown2 = false;
	static boolean fast = false,slow = false;
	
	static int geschwindigkeit = 4;
	static double speedup = 1;
	
	
	static int balldirx = 1, balldiry = -1;
	
	static int playerPoints = 0, gegnerPoints = 0;
	
	static Font pixelfont;
	
	public Var() {
		try {
			pixelfont = Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")).deriveFont(125F);
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("coders_crux.ttf")));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
