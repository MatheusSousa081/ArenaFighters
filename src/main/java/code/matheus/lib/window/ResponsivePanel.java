package code.matheus.lib.window;

import code.matheus.game.GameWindow;
import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Location;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public abstract class ResponsivePanel extends JPanel {
    private final @NotNull Dimension windowReference;
    private final @NotNull Dimension objectDimensionReference;
    private final @NotNull Location objectLocationReference;

    public ResponsivePanel() {
        windowReference = GameWindow.getInitialDimension();
        objectLocationReference = new Location(windowReference.getWidth() / 2,windowReference.getHeight() / 2);
        objectDimensionReference = new Dimension(32, 32);
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resizeComponents();
                revalidate();
                repaint();
            }
        });
    }

    public @NotNull Dimension getObjectDimensionReference() {
        return objectDimensionReference;
    }

    public @NotNull Dimension getWindowReference() {
        return windowReference;
    }

    public @NotNull Location getObjectLocationReference() {
        return objectLocationReference;
    }

    public abstract void resizeComponents();

    public int calculateX() {
        return (getWidth() * objectLocationReference.getX()) / windowReference.getWidth();
    }

    public int calculateY() {
        return (getHeight() * objectLocationReference.getY()) / windowReference.getHeight();
    }

    public int calculateWidth() {
        return (getWidth() * objectDimensionReference.getWidth()) / windowReference.getWidth();
    }

    public int calculateHeight() {
        return (getHeight() * objectDimensionReference.getHeight()) / windowReference.getHeight();
    }

    public double calculateProportion() {
        int widthProportion = getWidth() / windowReference.getWidth();
        int heightProportion = getHeight() / windowReference.getHeight();
        System.out.println("w: " + widthProportion);
        System.out.println("h: " + heightProportion + "\n");
        int min = Math.min(widthProportion, heightProportion);
        if (min <= 0) {
            return 1;
        } else {
            return min;
        }
    }
}