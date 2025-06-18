package window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.sql.Time;
import java.time.Instant;

import javax.swing.JPanel;

import control.KeyHandler;

public class GamePanel extends JPanel implements Runnable {

    private Thread gameThread;

    private int posX = 10;
    private int posY = 10;

    private double lastFPS;

    private KeyHandler keyHandler = new KeyHandler();

    public GamePanel() {
        this.setPreferredSize(new Dimension(WindowConstants.SCREEN_WIDTH, WindowConstants.SCREEN_HEIGHT));
        this.setDoubleBuffered(true);
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(keyHandler);
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
                update();
                repaint();
                delta--;
            }
        }
    }

    public void update() {

        if (keyHandler.up)
            posY -= 1;
        if (keyHandler.down)
            posY += 1;
        if (keyHandler.left)
            posX -= 1;
        if (keyHandler.right)
            posX += 1;
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.BLACK);

        g2.drawRect(0, 0, WindowConstants.SCREEN_WIDTH, WindowConstants.SCREEN_HEIGHT);

        g2.setColor(Color.white);

        g2.drawRect(posX, posY, WindowConstants.TILE_SIZE, WindowConstants.TILE_SIZE);

        g2.drawString(String.format("FPS: %.1f", lastFPS), 10, 10);
    }
}
