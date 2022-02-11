package com.boreasoft.jobqueue.visual.component;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import java.awt.Cursor;
import javax.swing.JFrame;
import java.awt.Frame;

public class ToolBar extends JPanel {

	//Selected, default, hover
	private final Color palette[] = {new Color(40,40,40),new Color(58,58,58),new Color(45,45,45)};

	private final Color background = new Color(73,73,73);

	private PanelButton buttons[];

	private int currentPanel = -1;



	public ToolBar(JFrame parent) {

		build();
		loadComponents(parent);

	}


	private void build() {

		this.setLayout(null);
		this.setBounds(0,25,150,580);
		this.setBackground(background);

	}


	private void loadComponents(JFrame parent) {

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


		FunctionButton exitButton = new FunctionButton(new Color[] {new Color(35,97,255),new Color(24,67,175),new Color(17,48,127)},
			new Runnable(){
				public void run() {
					System.exit(0);
				}
			}
		);
		exitButton.setBounds(15,10,55,55);
		this.add(exitButton);

		//Default,Entered,Pressed
		FunctionButton minimizeButton = new FunctionButton(new Color[] {new Color(99,255,127),new Color(79,204,100),new Color(55,142,70)},
			new Runnable(){
				public void run() {

					parent.setState(Frame.ICONIFIED);
			
				}
			}
		);
		minimizeButton.setBounds(80,65,55,55);
		this.add(minimizeButton);

		
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





	class FunctionButton extends JPanel {

		private final Color COLORS[];
		private final Runnable FUNCTION;

		public FunctionButton(final Color COLORS[],final Runnable FUNCTION) {


			this.COLORS = COLORS;

			this.FUNCTION = FUNCTION;

			this.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK));

			this.addMouseListener(new MouseListener(){ 
	    		
	    		@Override
	    		public void mouseReleased(MouseEvent e) {

	    			setBackground(COLORS[1]);	

	    		}

	    		@Override
	   			public void mousePressed(MouseEvent e) {

	   				setBackground(COLORS[2]);	

	   			}

	    		@Override
	    		public void mouseExited(MouseEvent e) {

					setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					setBackground(COLORS[0]);	    			

	    		}


	   			@Override
	   			public void mouseEntered(MouseEvent e) {

	   				setCursor(new Cursor(Cursor.HAND_CURSOR));
	   				setBackground(COLORS[1]);

	   			}

	    		@Override
	    		public void mouseClicked(MouseEvent e) {

					 FUNCTION.run();   			

	    		}
			
			});

			this.setBackground(COLORS[0]);


		}


	}








	class PanelButton extends JPanel {

		private final int buttonId;

		public PanelButton (final int buttonId,int parentWidth) {

			this.buttonId = buttonId;

			this.setBorder(BorderFactory.createMatteBorder(1,0,0,1,java.awt.Color.BLACK));

			this.setBackground(palette[0]);

			this.setSize(parentWidth,parentWidth);

			this.addMouseListener(new MouseListener(){ 
	    		
	    		@Override
	    		public void mouseReleased(MouseEvent e) {}

	    		@Override
	   			public void mousePressed(MouseEvent e) {

	   				changer(buttonId);

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
	    		}
			
			});

		}


		public void focus() {

			this.setBackground(palette[0]);
			this.setBorder(BorderFactory.createMatteBorder(1,0,0,0,java.awt.Color.BLACK));

		}

		public void lostFocus() {

			this.setBackground(palette[1]);
			this.setBorder(BorderFactory.createMatteBorder(1,0,0,1,java.awt.Color.BLACK));

		}


	}




}