package code.matheus.lib.window;

import code.matheus.lib.graphics.Dimension;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class Window extends JFrame {
    public Window(@NotNull String title, @NotNull Dimension dimension) {
        initialize(title, dimension);
    }

    private void initialize(@NotNull String title, @NotNull Dimension dimension) {
        setTitle(title);
        setSize(dimension.getWidth(), dimension.getHeight());
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
    }
}