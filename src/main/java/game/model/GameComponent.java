package game.model;

import java.awt.Graphics2D;

public abstract class GameComponent {

    protected GameModel model;

    public GameComponent(GameModel model) {
        this.model = model;
        this.model.addComponent(this);
    }

    protected abstract void update(double deltaTime);

    protected abstract void draw(Graphics2D g2);

}
