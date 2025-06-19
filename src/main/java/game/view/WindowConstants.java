package game.view;

/**
 * Sets some important settings for the game window.
 */
public class WindowConstants {

    // Screen Settings

    /**
     * Original size for the tile sprites.
     */
    private static final int ORIGINAL_TILE_SIZE = 16;

    /**
     * The size modifier for the tiles.
     */
    private static final int SCALE = 3;

    /**
     * The final value for the tile rendering size.
     */
    public static final int TILE_SIZE = ORIGINAL_TILE_SIZE * SCALE;

    /**
     * The max width of the screen, in columns.
     */
    public static final int MAX_COLUMNS = 16;

    /**
     * The max height of the screen, in rows.
     */
    public static final int MAX_ROWS = 16;

    /**
     * Screen width in pixels.
     */
    public static final int SCREEN_WIDTH = MAX_COLUMNS * TILE_SIZE;

    /**
     * Screen width in pixels.
     */
    public static final int SCREEN_HEIGHT = MAX_ROWS * TILE_SIZE;

    /**
     * Frame Rate
     */
    public static int FPS = 60;
}