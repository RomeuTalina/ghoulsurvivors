package game.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import game.controller.KeyHandler;
import game.controller.MouseHandler;
import game.model.GameModel;
import game.model.entity.enemies.Ghoul;
import game.model.entity.player.character.Al;
import utility.Vector2;

public class GamePanel extends JPanel implements Runnable {

    private GameModel model;

    private Thread gameThread;

    private KeyHandler keyHandler = new KeyHandler();
    private MouseHandler mouseHandler;

    public GamePanel() {
        this.setPreferredSize(new Dimension(WindowConstants.SCREEN_WIDTH, WindowConstants.SCREEN_HEIGHT));
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(keyHandler);
        // TODO:
        // Remove this and make a new setup so I can have different models for different
        // screens.
        this.model = new GameModel(keyHandler);
        this.mouseHandler = new MouseHandler(this.model);
        this.addMouseListener(mouseHandler);
        this.addMouseMotionListener(mouseHandler);
        this.addMouseWheelListener(mouseHandler);
        this.model.addPlayer(new Al(this.model));
        this.model.addComponent(new Ghoul(this.model, 1, new Vector2(20, 20)));
    }

    public void startGameThread() {
        this.gameThread = new Thread(this);
        this.gameThread.start();
    }

    @Override
    public void run() {

        double drawInterval = 1000000000 / WindowConstants.FPS;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;

        while (gameThread != null) {

            currentTime = System.nanoTime();

            delta += (currentTime - lastTime) / drawInterval;

            lastTime = currentTime;

            if (delta >= 1) {
                model.update(drawInterval / 1000000000);
                repaint();
                delta--;
            }
        }
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.black);
        g2.fillRect(0, 0, WindowConstants.SCREEN_WIDTH, WindowConstants.SCREEN_HEIGHT);

        this.model.draw(g2);
    }
}
