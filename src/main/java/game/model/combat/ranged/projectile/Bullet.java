package game.model.combat.ranged.projectile;

import game.model.GameModel;
import utility.Vector2;

public class Bullet extends Projectile{

    private float damageMult, speedMult, areaMult;

	public Bullet(GameModel model, Vector2 pos, Vector2 target) {
		super(model, pos, target);
        this.speed = 2;
        this.damage = 6;
        this.lifetime = 1.5f;
	}

    public void setDamageMult(float damageMult){

    }
    
}
