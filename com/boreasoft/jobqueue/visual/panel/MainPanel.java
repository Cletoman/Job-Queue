package com.boreasoft.jobqueue.visual.panel;

import com.boreasoft.jobqueue.visual.component.MainBar;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;


public class MainPanel extends JPanel {

	private final Color background = new Color(40,40,40);
	private MainBar mainBar;


	public MainPanel(JFrame parent) {

		build(parent);
		loadComponents(parent);

	}


	private void build(JFrame parent) {

		this.setBounds(0,0,parent.getWidth(),parent.getHeight());
		this.setLayout(null);
		this.setBackground(background);

	}


	private void loadComponents(JFrame parent) {

		mainBar = new MainBar(parent);
		this.add(mainBar);

	}


}