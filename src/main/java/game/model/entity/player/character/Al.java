package game.model.entity.player.character;

import game.model.GameModel;
import game.model.combat.ranged.weapon.Gun;
import game.model.entity.player.Player;

public class Al extends Player {
    
    public Al(GameModel model) {
        super(model, 1.2f);
        addItem(new Gun(this));
        this.selectedItem = this.inventory.get(0);
    }
}
