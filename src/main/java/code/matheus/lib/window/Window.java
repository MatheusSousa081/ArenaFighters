package code.matheus.lib;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public final class Window {
    private static final @NotNull JFrame jframe = new JFrame();

    public static void initialize() {
        jframe.setTitle("Launcher");
        jframe.setSize(1250, 730);
        jframe.setVisible(true);
        jframe.setLocationRelativeTo(null);
        jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
    }
}
