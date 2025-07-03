package game.model.combat.weapon;

import game.model.entity.player.Player; 
import game.model.inventory.InventoryItem;

public abstract class Weapon extends InventoryItem {

    protected float damageMult, speedMult, areaMult;
	protected float cooldown, currentCooldown;

    public Weapon(Player player) {
		super(player);
	}

    protected abstract void attack();

    public void use(){
        if(this.currentCooldown <= 0){
            this.attack();
        }
    }

	public float getDamageMult() {
		return damageMult;
	}

	public void setDamageMult(float damageMult) {
		this.damageMult = damageMult;
	}

	public float getSpeedMult() {
		return speedMult;
	}

	public void setSpeedMult(float speedMult) {
		this.speedMult = speedMult;
	}

	public float getAreaMult() {
		return areaMult;
	}

	public void setAreaMult(float areaMult) {
		this.areaMult = areaMult;
	}

	public float getCooldown() {
		return cooldown;
	}

	public void setCooldown(float cooldown) {
		this.cooldown = cooldown;
	}

	public float getCurrentCooldown() {
		return currentCooldown;
	}
}
