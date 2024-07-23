package code.matheus.game;

import code.matheus.game.entity.Player;
import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Location;
import code.matheus.lib.graphics.Sprite;
import code.matheus.lib.graphics.Square;
import code.matheus.lib.window.ResponsivePanel;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.File;

public class GameManager extends ResponsivePanel {
    private final @NotNull Square square;
    private final @NotNull Player player;

    public GameManager() {
        player = new Player("Carlos", new Location((getWindowReference().getWidth() - 16) / 2, (getWindowReference().getHeight() - 16) / 2), new Dimension(16, 16), new Sprite(new File("src/main/resources/assets/characters/ninja.png")));
        square = new Square(new Location((getWindowReference().getWidth() - 100) / 2, (getWindowReference().getHeight() - 100) / 2), new Dimension(100, 100));
    }

    @Override
    public void resizeComponents() {
        player.updatePosition(new Location(calculateX(), calculateY()));
        player.updateDimension(new Dimension(calculateWidth(), calculateHeight()));
        //player.updateDimension(new Dimension((int) (getObjectDimensionReference().getWidth() * calculateProportion()),(int) (getObjectDimensionReference().getHeight() * calculateProportion())));
        square.updatePosition(new Location(calculateX(), calculateY()));
        square.updateDimension(new Dimension(calculateWidth(), calculateHeight()));
        //square.updateDimension(new Dimension((int) (getObjectDimensionReference().getWidth() * calculateProportion()),(int) (getObjectDimensionReference().getHeight() * calculateProportion())));
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