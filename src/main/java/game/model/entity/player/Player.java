package game.model.entity.player;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

import game.model.GameModel;
import game.model.entity.Entity;
import game.model.inventory.InventoryItem;
import game.view.WindowConstants;

public abstract class Player extends Entity {

    protected ArrayList<InventoryItem> inventory;
    protected InventoryItem selectedItem = null;

    public Player(GameModel model, float speed) {
        super(model, speed);
        this.pos.x = 400;
        this.pos.y = 300;

        inventory = new ArrayList<>();
    }

    public void addItem(InventoryItem item){
        this.inventory.add(item); 
    }

    public void useItem(){
        this.selectedItem.use();
    }

    @Override
    protected void update(double deltaTime) {
        if (this.model.keyHandler.up) {
            this.pos.y -= this.speed * 200 * deltaTime;
        }
        if (this.model.keyHandler.down) {
            this.pos.y += this.speed * 200 * deltaTime;
        }
        if (this.model.keyHandler.left) {
            this.pos.x -= this.speed * 200 * deltaTime;
        }
        if (this.model.keyHandler.right) {
            this.pos.x += this.speed * 200 * deltaTime;
        }
    }

    @Override
    protected void draw(Graphics2D g2) {
        g2.setColor(Color.WHITE);
        g2.drawRect((int) this.pos.x - WindowConstants.TILE_SIZE / 2, (int) this.pos.y - WindowConstants.TILE_SIZE / 2,
                WindowConstants.TILE_SIZE, WindowConstants.TILE_SIZE);
    }
   
}
