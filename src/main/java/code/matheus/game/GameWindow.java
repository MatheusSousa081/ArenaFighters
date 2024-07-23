package code.matheus.game;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.window.Window;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public final class GameWindow extends Window {
    private static GameWindow INSTANCE;
    private static final @NotNull Dimension INITIAL_DIMENSION = new Dimension(800, 450);

    private GameWindow(@NotNull String title, @NotNull Dimension dimension) {
        super(title, dimension);
    }

    public static GameWindow create(@NotNull String title, @NotNull Dimension dimension) {
        if (INSTANCE == null) {
            return new GameWindow(title, dimension);
        }
        return INSTANCE;
    }

    public static GameWindow create(@NotNull String title) {
        if (INSTANCE == null) {
            return new GameWindow(title, INITIAL_DIMENSION);
        }
        return INSTANCE;
    }

    public static GameWindow getINSTANCE() {
        return INSTANCE;
    }

    public static @NotNull Dimension getInitialDimension() {
        return INITIAL_DIMENSION;
    }

    public void addPanel(Component component) {
        getContentPane().add(component);
    }
}
