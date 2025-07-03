package game.model.combat.weapon.ranged;

import game.model.combat.weapon.Weapon;
import game.model.entity.player.Player;

public abstract class RangedWeapon extends Weapon{ 

    public RangedWeapon(Player player) {
		super(player);
	}

    protected abstract void attack();
}
