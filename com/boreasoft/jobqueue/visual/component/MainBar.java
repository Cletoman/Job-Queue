package com.boreasoft.jobqueue.visual.component;

import com.boreasoft.jobqueue.visual.panel.MotionPanel;
import javax.swing.JFrame;
import java.awt.Color;

public class MainBar extends MotionPanel {

	private final Color background = new Color(0,255,144);


	public MainBar(JFrame parent) {

		super(parent);
		build(parent.getWidth());
		loadComponents();

	}


	private void build(int parentWidth) {

		this.setLayout(null);
		this.setBounds(0,0,parentWidth,45);
		this.setBackground(background);

	}


	private void loadComponents() {

	}

}
