package pong;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {

	Timer move;
	
	public Movement() {
		move = new Timer();
		move.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				if (Var.moveup == true) {
					
					if(Var.y >= 20) {
						Var.y -=2;
					}
				}
				else if(Var.movedown == true) {
					if(Var.y <= Var.screenheight - 200) {
						Var.y +=2;
					}
				}
				
				if (Var.moveup2 == true) {
					
					if(Var.q >= 20) {
						Var.q -=2;
					}
				}
				else if(Var.movedown2 == true) {
					if(Var.q <= Var.screenheight - 200) {
						Var.q +=2;
					}
				}
				
				if (Var.fast == true) {
					Var.geschwindigkeit-=1;
				}
				if (Var.slow == true) {
					Var.geschwindigkeit+=1;
				}
				
				
			}
			
		},0,5);
		
	}

}
