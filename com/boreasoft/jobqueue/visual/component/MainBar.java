package com.boreasoft.jobqueue.visual.component;

import com.boreasoft.jobqueue.visual.panel.MotionPanel;
import javax.swing.JFrame;
import java.awt.Color;

public class MainBar extends MotionPanel {

	private final Color background = new Color(0,255,144);


	public MainBar(JFrame parent,int toolBarWidth) {

		super(parent);
		build(parent.getWidth(),toolBarWidth);
		loadComponents();

	}


	private void build(int parentWidth,int toolBarWidth) {

		this.setLayout(null);
		this.setBounds(0,0,toolBarWidth,25);
		this.setBackground(background);

	}


	private void loadComponents() {

	}

}
