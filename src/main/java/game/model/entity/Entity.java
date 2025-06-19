package game.model.entity;

import game.model.GameComponent;
import game.model.GameModel;
import utility.Vector2;

public abstract class Entity extends GameComponent {

    protected Vector2 pos;
    protected float speed;

    public Entity(GameModel model, float speed) {
        super(model);
        this.speed = speed;
        this.pos = new Vector2();
    }

    public Vector2 getPos() {
        return pos;
    }
}
