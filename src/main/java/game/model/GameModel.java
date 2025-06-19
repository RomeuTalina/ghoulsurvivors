package game.model;

import java.awt.Graphics2D;
import java.util.ArrayList;

import game.controller.KeyHandler;
import game.model.entity.player.Player;
import utility.Vector2;

public class GameModel {

    private ArrayList<GameComponent> components;

    private Player player;

    public KeyHandler keyHandler;

    public GameModel(KeyHandler keyHandler) {
        this.components = new ArrayList<>();
        this.keyHandler = keyHandler;
    }

    public void update(double deltaTime) {

        for (GameComponent component : components) {
            component.update(deltaTime);
        }
    }

    public void draw(Graphics2D g2) {
        for (GameComponent component : components) {
            component.draw(g2);
        }
    }

    public void addComponent(GameComponent newComponent) {
        components.add(newComponent);
    }

    public void addPlayer(Player player) {
        components.add(player);
        this.player = player;
    }

    public Vector2 getPlayerPosition() {
        return this.player.getPos();
    }
}