package com.boreasoft.jobqueue.visual.frame;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import com.boreasoft.jobqueue.visual.panel.MainPanel;

public class MainFrame extends JFrame {


	private final int WIDTH = 1000, HEIGHT = 600, BASE = 150;

	private MainPanel mainPanel;


	public MainFrame() {

		build();
		this.setVisible(true);
		deployAnimation();

	}


	private void build() {

		this.setSize(WIDTH,HEIGHT);

		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		getRootPane().setBorder(BorderFactory.createMatteBorder(2,2,2,2,java.awt.Color.BLACK));

		mainPanel = new MainPanel(this);
		this.setContentPane(mainPanel);

		setSize(BASE,HEIGHT);

	}




	private void deployAnimation() {

		int totalSteps = 17;
		int stepValue = (WIDTH - BASE) / totalSteps;
		int stepCount = 1;
		int msSpeed =25;

		try{

			while(stepCount<=totalSteps) {

				setSize(BASE+(stepCount*stepValue),HEIGHT);
				stepCount++;
				Thread.sleep(msSpeed);

			} 

		}catch(Exception e) {

			setSize(WIDTH,HEIGHT);

		}

	}



}