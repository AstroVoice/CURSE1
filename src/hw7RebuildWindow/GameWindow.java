package hw7RebuildWindow;

import javax.swing.*;

public class GameWindow extends JFrame {
    private static final int WIN_WIDTH = 507;
    private static final int WIN_HEIGHT = 555;
    private static final int WIN_POSX = 650;
    private static final int WIN_POSY = 250;
    GameWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Крестики нолики");

        JButton keyStart = new JButton("Начать игру");
        JButton keyOver = new JButton("Выйти");
    }
}
