package com.boreasoft.jobqueue.visual.component;

import com.boreasoft.jobqueue.visual.panel.MotionPanel;
import javax.swing.JFrame;
import java.awt.Color;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.Cursor;

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

		this.addMouseListener(new MouseListener(){ 
	    		
	    	@Override
	    	public void mouseReleased(MouseEvent e) {}

	    	@Override
	   		public void mousePressed(MouseEvent e) {}

			@Override
			public void mouseExited(MouseEvent e) {}

	   		@Override
	   		public void mouseEntered(MouseEvent e) {

	   			setCursor(new Cursor(Cursor.MOVE_CURSOR));

	   		}

	    	@Override
	    	public void mouseClicked(MouseEvent e) {

	   			setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

	    	}
			
		});

	}


	private void loadComponents() {

	}

}
