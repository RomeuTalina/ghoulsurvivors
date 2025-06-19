package game.model.entity.enemies;

import game.model.GameModel;
import game.model.entity.Entity;
import utility.Vector2;

public abstract class Enemy extends Entity {

    private Vector2 target;
    private Vector2 movementVector;

    public Enemy(GameModel model, float speed) {
        super(model, speed);
    }

    @Override
    public void update(double deltaTime) {

        target = this.model.getPlayerPosition();
        movementVector = target.sub(this.pos).normalize();

        this.pos.x += movementVector.x * this.speed * 100 * deltaTime;
        this.pos.y += movementVector.y * this.speed * 100 * deltaTime;
    }
}
