package game.model.combat.ranged.weapon;


import game.model.GameModel;
import game.model.combat.ranged.projectile.Bullet;
import game.model.combat.weapon.ranged.RangedWeapon;
import game.model.entity.player.Player;
import utility.Vector2;

public class Gun extends RangedWeapon {

    public Gun(Player player) {
		super(player);
        this.projectile = new Bullet(null, null, null);
	}

    @Override
	public void attack(Vector2 target) {
        if (this.currentCooldown <= 0) {
             
        }
    }

    public void use(){
        this.attack(GameModel.cursorCoordinates);
    }
}
