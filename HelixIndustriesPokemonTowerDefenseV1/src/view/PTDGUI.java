package view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class PTDGUI extends JFrame {
	
	public static void main(String[] args) {
		PTDGUI gui = new PTDGUI();
	}

	public PTDGUI() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(1000, 720);
		this.setLayout(new BorderLayout());
		menuPanel menu = new menuPanel();
		menu.setPreferredSize(new Dimension(200, 720));
		this.add(menu, BorderLayout.LINE_END);
		this.setVisible(true);

	}
	
}
