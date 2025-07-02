package game.model.combat.weapon;

import game.model.entity.player.Player;
import game.model.inventory.InventoryItem;
import utility.Vector2;

public abstract class Weapon extends InventoryItem {

	protected float cooldown, currentCooldown;

    public Weapon(Player player) {
		super(player);
	}

    protected abstract void attack(Vector2 target);

    public abstract void use();
    
}
