package game.model.combat.ranged.projectile;

import java.awt.Graphics2D;

import game.model.GameComponent;
import game.model.GameModel;
import utility.Vector2;

public class Projectile extends GameComponent{

    protected float lifetime;
    protected float speed;
    protected int damage;
    protected float area;
    protected Vector2 pos;
    protected Vector2 movementVector;

	public Projectile(GameModel model, Vector2 pos, Vector2 target) {
		super(model);
        this.pos = pos;
        this.movementVector = this.pos.sub(target).normalize();
	}

    public Projectile newInstance(GameModel model, Vector2 pos, Vector2 target){
        return new Projectile(model, pos, target);
    }
    
	@Override
	public void update(double deltaTime) {
        
            this.pos = this.pos.add(movementVector);

            if(this.lifetime <= 0){
                this.model.removeComponent(this);
            }
            
            lifetime -= deltaTime;
    }

    @Override
	public void draw(Graphics2D g2) {

	}

}
