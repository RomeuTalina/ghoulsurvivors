package game.model.inventory;

import game.model.entity.player.Player;

public abstract class InventoryItem implements Usable{
    
    protected Player player;

    public InventoryItem(Player player){
        this.player = player;  
    }
}
