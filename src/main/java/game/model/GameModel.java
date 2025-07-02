package game.model;

import java.awt.Graphics2D;
import java.util.ArrayList;

import game.controller.KeyHandler;
import game.model.entity.player.Player;
import utility.Vector2;

public class GameModel {

    public static Vector2 cursorCoordinates;

    private ArrayList<GameComponent> components;
    private ArrayList<GameComponent> componentsToAdd;
    private ArrayList<GameComponent> componentsToRemove;

    private Player player;

    public KeyHandler keyHandler;

    public GameModel(KeyHandler keyHandler) {
        this.components = new ArrayList<>();
        this.componentsToAdd = new ArrayList<>();
        this.componentsToRemove = new ArrayList<>();
        this.keyHandler = keyHandler;
    }

    public void update(double deltaTime) {

        for (GameComponent component : components) {
            component.update(deltaTime);
        }

        for(GameComponent component : componentsToRemove){
            this.components.remove(component);
        } 
        this.componentsToRemove.clear();

        for(GameComponent component : componentsToAdd){
            this.components.add(component);
        } 
        this.componentsToAdd.clear();

    }

    public void draw(Graphics2D g2) {
        for (GameComponent component : components) {
            component.draw(g2);
        }
    }

    public void addComponent(GameComponent newComponent) {
        this.componentsToAdd.add(newComponent);
    }

    public void removeComponent(GameComponent component) {
        this.componentsToRemove.add(component);
    }

    public void addPlayer(Player player) {
        components.add(player);
        this.player = player;
    }

    public Vector2 getPlayerPosition() {
        return this.player.getPos();
    }
}
