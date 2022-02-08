package com.boreasoft.jobqueue.visual.component;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;

public class ToolBar extends JPanel {

	//Selected, default, hover
	private final Color palette[] = {new Color(40,40,40),new Color(58,58,58),new Color(45,45,45)};

	private final Color background = new Color(73,73,73);

	private PanelButton buttons[];

	private int currentPanel = -1;


	public ToolBar() {

		build();
		loadComponents();

	}


	private void build() {

		this.setLayout(null);
		this.setBounds(0,25,150,580);
		this.setBackground(background);

	}


	private void loadComponents() {

		buttons = new PanelButton[3];


		buttons[0] = new PanelButton(0,this.getWidth());
		buttons[0].setBounds(0,130,buttons[0].getWidth(),buttons[0].getHeight());
		this.add(buttons[0]);

		

		buttons[1] = new PanelButton(1,this.getWidth());
		buttons[1].setBounds(0,(buttons[0].getY()+buttons[0].getHeight()),buttons[1].getWidth(),buttons[1].getHeight());
		this.add(buttons[1]);

		

		buttons[2] = new PanelButton(2,this.getWidth());
		buttons[2].setBounds(0,(buttons[1].getY()+buttons[1].getHeight()),buttons[2].getWidth(),buttons[2].getHeight());
		this.add(buttons[2]);

		
		changer(0);


	}



	public void changer(int requestSource) {

		if(requestSource != currentPanel) {

			currentPanel = requestSource;

			for(PanelButton panelButton:buttons) {

				panelButton.lostFocus();

			}

			buttons[requestSource].focus();

		}


	}



	class PanelButton extends JPanel {

		private final int buttonId;

		public PanelButton (final int buttonId,int parentWidth) {

			this.buttonId = buttonId;

			this.setBorder(BorderFactory.createMatteBorder(2,0,0,2,java.awt.Color.BLACK));

			this.setBackground(palette[0]);

			this.setSize(parentWidth,parentWidth);

			this.addMouseListener(new MouseListener(){ 
	    		
	    		@Override
	    		public void mouseReleased(MouseEvent e) {}

	    		@Override
	   			public void mousePressed(MouseEvent e) {

	   			}

	    		@Override
	    
	    		public void mouseExited(MouseEvent e) {

	    			if(buttonId!=currentPanel) {

	    				setBackground(palette[1]);

	    			}

	    			
	    		}


	   			@Override
	   			public void mouseEntered(MouseEvent e) {

	   				if(buttonId!=currentPanel) {
						
	   					setBackground(palette[2]);


	   				}

	   			}

	    		@Override
	    		public void mouseClicked(MouseEvent e) {

	    			changer(buttonId);

	    		}
			
			});

		}


		public void focus() {

			this.setBackground(palette[0]);
			this.setBorder(BorderFactory.createMatteBorder(2,0,0,0,java.awt.Color.BLACK));

		}

		public void lostFocus() {

			this.setBackground(palette[1]);
			this.setBorder(BorderFactory.createMatteBorder(2,0,0,2,java.awt.Color.BLACK));

		}


	}




}