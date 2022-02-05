package com.boreasoft.jobqueue.visual.panel;


import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MotionPanel extends JPanel{

    private Point initialClick;
    private JFrame parent;

    public MotionPanel(final JFrame parent){
        
        this.parent = parent;

        addMouseListener(new MouseAdapter() {
    
            public void mousePressed(MouseEvent e) {
    
                initialClick = e.getPoint();
                getComponentAt(initialClick);
    
            }
        });

    
        addMouseMotionListener(new MouseMotionAdapter() {
            
            @Override
            public void mouseDragged(MouseEvent e) {

                int thisX = parent.getLocation().x;
                int thisY = parent.getLocation().y;

                int xMoved = e.getX() - initialClick.x;
                int yMoved = e.getY() - initialClick.y;

                int X = thisX + xMoved;
                int Y = thisY + yMoved;
            
                try {
                    parent.setLocation(X, Y);
                } catch (Exception except) {}
            }
        });
    }


}