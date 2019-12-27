package pong;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Gui {

	public Gui() {
		Var.jf1 = new JFrame();
		Var.jf1.setSize(800, 700);
		Var.jf1.setTitle("Pong");
		Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Var.jf1.setLayout(null);
		Var.jf1.setResizable(false);
		Var.jf1.setVisible(true);
		Var.jf1.setLocationRelativeTo(null);
		Var.jf1.addKeyListener(new KeyHandler());
		Var.jf1.isAutoRequestFocus();
		
		
		
//		Var.btn.setBounds(330, 620, 140, 23);
//		Var.btn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				
//			Var.geschwindigkeit+=1;
//			}
//		});
//		Var.jf1.add(Var.btn);
		
		Draw lbldraw = new Draw();
		lbldraw.setBounds(0,0, 800, 700);
		lbldraw.setVisible(true);
		Var.jf1.add(lbldraw);
	}

}
