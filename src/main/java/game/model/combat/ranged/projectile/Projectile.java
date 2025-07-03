package game.model.combat.ranged.projectile;

import java.awt.Graphics2D;

import game.model.GameComponent;
import game.model.GameModel;
import utility.Vector2;

public abstract class Projectile extends GameComponent{

    protected float lifetime;
    protected float speed;
    protected int damage;
    protected float area;
    protected Vector2 pos;
    protected Vector2 movementVector;

	public Projectile(GameModel model, Vector2 pos, Vector2 target) {
		super(model);
        this.pos = pos;
        this.movementVector = target.sub(this.pos).normalize();
	}

    public abstract Projectile newInstance(GameModel model, Vector2 pos, Vector2 target);
    
	@Override
	public void update(double deltaTime) {
        
            Vector2 step = movementVector.mult(speed * (float) deltaTime * 200);
            this.pos = this.pos.add(step);

            if(this.lifetime <= 0){
                this.model.removeComponent(this);
            }
            
            lifetime -= deltaTime;
    }

	public abstract void draw(Graphics2D g2); 
}
