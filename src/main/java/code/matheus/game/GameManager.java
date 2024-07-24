package code.matheus.game;

import code.matheus.game.entity.Player;
import code.matheus.lib.graphics.*;
import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.sprite.Sprite;
import code.matheus.lib.window.ResponsiveLayout;
import code.matheus.lib.window.ResponsivePanel;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.File;

public class GameManager extends ResponsivePanel {
    private final @NotNull ResponsiveLayout responsiveLayout;
    private final @NotNull Element player;
    private final @NotNull Element square;


    public GameManager() {
        responsiveLayout = new ResponsiveLayout();
        player = new Player("Carlos", new Location(430, 140), new Dimension(32, 32), new Sprite(new File("src/main/resources/assets/characters/ninja.png")));
        square = new Square(new Location(350, 175), new Dimension(100, 100));
        responsiveLayout.addReference(player);
        responsiveLayout.addReference(square);
    }

    @Override
    public void resizeComponents() {
        resizeComponent(player);
        resizeComponent(square);
    }

    public void resizeComponent(@NotNull Element element) {
        element.setDimension(new Dimension(calculateWidth(responsiveLayout.getDimensionMap().get(element)), calculateHeight(responsiveLayout.getDimensionMap().get(element))));
        element.setLocation(new Location(calculateX(responsiveLayout.getLocationMap().get(element)), calculateY(responsiveLayout.getLocationMap().get(element))));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        square.draw(graphics2D, square.getLocation(), square.getDimension());
        player.draw(graphics2D, player.getLocation(), player.getDimension());
        graphics2D.dispose();
    }
}