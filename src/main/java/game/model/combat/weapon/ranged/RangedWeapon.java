package game.model.combat.weapon.ranged;

import game.model.combat.ranged.projectile.Projectile;
import game.model.combat.weapon.Weapon;
import game.model.entity.player.Player;
import utility.Vector2;

public abstract class RangedWeapon extends Weapon{ 

    protected Projectile projectile;
    
    public RangedWeapon(Player player) {
		super(player);
	}

	@Override
	protected void attack(Vector2 target) {
        this.projectile.newInstance(this.player.getModel(), this.player.getPos(), target);
	}
}
