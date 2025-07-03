package game.controller;

import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputAdapter;

import game.model.GameModel;

public class MouseHandler extends MouseInputAdapter{
    
    private GameModel model;    

    public MouseHandler(GameModel model){
        this.model = model; 
    }

    @Override
    public void mouseMoved(MouseEvent e){
        GameModel.cursorCoordinates.x = e.getX();
        GameModel.cursorCoordinates.y = e.getY();
    }

    @Override
    public void mousePressed(MouseEvent e){
        //if (currentScreen == Screens.MENU ou wtv){
        //  Fazer mambos de menu.
        //} else {
        //  Disparar n shi
        //}
        this.model.getPlayer().useItem();
    } 
}
