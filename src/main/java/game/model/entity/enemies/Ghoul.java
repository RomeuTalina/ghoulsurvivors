package game.model.entity.enemies;

import java.awt.Color;
import java.awt.Graphics2D;

import game.model.GameModel;
import game.view.WindowConstants;
import utility.Vector2;

public class Ghoul extends Enemy {

    public Ghoul(GameModel model, float speed, Vector2 pos) {
        super(model, speed);
        this.pos = pos;
    }

    @Override
    public void draw(Graphics2D g2) {

        g2.setColor(Color.RED);
        g2.drawRect((int) this.pos.x - WindowConstants.TILE_SIZE / 2, (int) this.pos.y - WindowConstants.TILE_SIZE / 2,
                WindowConstants.TILE_SIZE, WindowConstants.TILE_SIZE);
    }
}
