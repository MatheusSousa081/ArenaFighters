package code.matheus.game;

import org.jetbrains.annotations.NotNull;

public final class Game {
    private static final @NotNull GameWindow window = GameWindow.create("Teste");
    private static final @NotNull GameManager manager = new GameManager();

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        window.addPanel(manager);
        System.out.println("Tempo para iniciar: " + (System.currentTimeMillis() - time) + "ms!");
    }
}
