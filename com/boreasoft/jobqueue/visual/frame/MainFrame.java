package com.boreasoft.jobqueue.visual.frame;

import javax.swing.JFrame;
import com.boreasoft.jobqueue.visual.panel.MainPanel;

public class MainFrame extends JFrame {


	private final int WIDTH = 1000, HEIGHT = 600;

	private MainPanel mainPanel;


	public MainFrame() {

		build();
		this.setVisible(true);

	}


	private void build() {

		this.setSize(WIDTH,HEIGHT);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		mainPanel = new MainPanel(this);

		this.setContentPane(mainPanel);

	}


}