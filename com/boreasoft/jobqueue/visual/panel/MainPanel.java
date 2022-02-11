package com.boreasoft.jobqueue.visual.panel;

import com.boreasoft.jobqueue.visual.component.MainBar;
import com.boreasoft.jobqueue.visual.component.ToolBar;
import com.boreasoft.jobqueue.visual.layer.*;


import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class MainPanel extends JPanel {

	private final Color background = new Color(40,40,40);
	private MainBar mainBar;
	private ToolBar toolBar;

	private InformationLayer informationLayer;
	private MainLayer mainLayer;

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

		
		toolBar = new ToolBar(parent);
		this.add(toolBar);

		mainBar = new MainBar(parent,toolBar.getWidth());
		this.add(mainBar);

		informationLayer = new InformationLayer();
		this.add(informationLayer);

		mainLayer = new MainLayer();
		this.add(mainLayer);


	}

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);


		Graphics2D g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(1));
		g2D.setColor(Color.BLACK);
		g2D.drawLine(150,0,150,155);
		
	
	}


}