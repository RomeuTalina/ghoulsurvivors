package game.view;

import javax.swing.JFrame;

public class GameWindow extends JFrame {

    private GamePanel panel;

    public GameWindow() {
        this.setTitle("Ghoul Survivors - Super Duper Hyper Mega Early WIP v0.00.0");
        this.setFocusable(true);
        this.setBounds(200, 200, 800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = new GamePanel();
        this.add(this.panel);
        this.panel.startGameThread();
        this.setVisible(true);
        this.panel.requestFocusInWindow();
    }
}
