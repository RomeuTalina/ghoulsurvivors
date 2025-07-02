package game.controller;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import game.model.GameModel;

public class MouseHandler extends MouseInputAdapter{

    @Override
    public void mouseDragged(MouseEvent e){
        GameModel.cursorCoordinates.x = e.getX();
        GameModel.cursorCoordinates.y = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e){
    } 
}
