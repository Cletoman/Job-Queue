package com.boreasoft.jobqueue.visual.panel;

import javax.swing.JPanel;

public class MainPanel extends JPanel {


	public MainPanel(int parentWidth,int parentHeight) {

		build(parentWidth,parentWidth);
		loadCOmponents();

	}


	private void build(int parentWidth,int parentHeight) {

		this.setBounds(0,0,parentWidth,parentHeight);
		this.setLayout(null);

	}


	private void loadCOmponents() {

	}


}