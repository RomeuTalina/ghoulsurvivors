package game.model.combat.ranged.weapon;


import game.model.GameModel;
import game.model.combat.ranged.projectile.Bullet;
import game.model.combat.weapon.ranged.RangedWeapon;
import game.model.entity.player.Player;

public class Gun extends RangedWeapon {

    public Gun(Player player) {
		super(player);
	}

    @Override
    public void attack(){
        new Bullet(this.player.getModel(), this.player.getPos(), GameModel.cursorCoordinates);
    }

}
