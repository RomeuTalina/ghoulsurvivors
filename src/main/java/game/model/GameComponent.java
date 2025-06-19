package game.model;

import java.awt.Graphics2D;

public abstract class GameComponent {

    protected GameModel model;

    public GameComponent(GameModel model) {
        this.model = model;
    }

    public abstract void update(double deltaTime);

    public abstract void draw(Graphics2D g2);

}
