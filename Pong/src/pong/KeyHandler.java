package pong;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	
		if(e.getKeyCode()==KeyEvent.VK_B) {
			Var.geschwindigkeit-=Var.speedup;
			//Var.fast = true;
			}
		else if(e.getKeyCode()==KeyEvent.VK_N) {
			Var.geschwindigkeit+=Var.speedup;
		}
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup = true;
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				Var.movedown = true;
			}
			
			if(e.getKeyCode()==KeyEvent.VK_W) {
				Var.moveup2 = true;
			}
			else if(e.getKeyCode() ==KeyEvent.VK_S) {
				Var.movedown2 = true;
			}
		
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
//		if(e.getKeyCode()==KeyEvent.VK_B) {
//			Var.fast = false;
//			}
//		else if(e.getKeyCode()==KeyEvent.VK_N) {
//			Var.slow = false;
//		}
		
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup = false;
			}
			else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				Var.movedown = false;
			}
		
		if (e.getKeyCode()==KeyEvent.VK_W) {
			Var.moveup2 = false;
		}
			else if(e.getKeyCode()==KeyEvent.VK_S) {
				Var.movedown2 = false;
			}
	}

}
