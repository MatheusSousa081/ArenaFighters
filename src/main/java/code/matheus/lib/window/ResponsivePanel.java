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

    public ResponsivePanel() {
        windowReference = GameWindow.getInitialDimension();
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                resizeComponents();
                revalidate();
                repaint();
            }
        });
    }

    public @NotNull Dimension getWindowReference() {
        return windowReference;
    }

    public abstract void resizeComponents();

    public int calculateX(@NotNull Location location) {
        System.out.println("x -" + location.getX());
        System.out.println("x_x -> " + (getWidth() * location.getX()) / windowReference.getWidth());
        return (getWidth() * location.getX()) / windowReference.getWidth();
    }

    public int calculateY(@NotNull Location location) {
        System.out.println("y -" + location.getY());
        System.out.println("y_y ->" + (getHeight() * location.getY()) / windowReference.getHeight());
        return (getHeight() * location.getY()) / windowReference.getHeight();
    }

    public int calculateWidth(@NotNull Dimension dimension) {
        System.out.println("w -" + dimension.getWidth());
        System.out.println("w_w -> " + (getWidth() * dimension.getWidth()) / windowReference.getWidth());
        return (getWidth() * dimension.getWidth()) / windowReference.getWidth();
    }

    public int calculateHeight(@NotNull Dimension dimension) {
        System.out.println("h -" + dimension.getHeight());
        System.out.println("h_h -> " + (getHeight() * dimension.getHeight()) / windowReference.getHeight());
        return (getHeight() * dimension.getHeight()) / windowReference.getHeight();
    }

    public int calculateProportion() {
        int widthProportion = getWidth() / windowReference.getWidth();
        int heightProportion = getHeight() / windowReference.getHeight();
        int min = Math.min(widthProportion, heightProportion);
        if (min <= 0) {
            return 1;
        } else {
            return min;
        }
    }
}