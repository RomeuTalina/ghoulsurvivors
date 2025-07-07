package game.model.combat.ranged.projectile;

import java.awt.Graphics2D;

import game.model.GameModel;
import utility.Vector2;

public class Bullet extends Projectile{

    public Bullet(GameModel model, Vector2 pos, Vector2 target) {
		super(model, pos, target);
        this.speed = 3;
        this.damage = 6;
        this.area = 10;
        this.lifetime = 1.5f;
	}

	@Override
	public Projectile newInstance(GameModel model, Vector2 pos, Vector2 target) {
        return new Bullet(model, pos, target);
    }

	@Override
	public void draw(Graphics2D g2) {
        g2.drawOval((int) this.pos.x, (int) this.pos.y, (int) this.area, (int) this.area);
	}
}
