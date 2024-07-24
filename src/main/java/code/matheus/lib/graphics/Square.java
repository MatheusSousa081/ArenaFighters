package code.matheus.lib.graphics;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class Square implements Element{
    private @NotNull Location location;
    private @NotNull Dimension dimension;

    public Square(@NotNull Location location, @NotNull Dimension dimension) {
        this.location = location;
        this.dimension = dimension;
    }

    @Override
    public @NotNull Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(@NotNull Location location) {
        this.location = location;
    }

    @Override
    public @NotNull Dimension getDimension() {
        return dimension;
    }

    @Override
    public void setDimension(@NotNull Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public void draw(@NotNull Graphics2D graphics2D, @NotNull Location location, @NotNull Dimension dimension) {
        graphics2D.draw3DRect(location.getX(), location.getY(), dimension.getWidth(), dimension.getHeight(), true);
    }

    @Override
    public String toString() {
        return "Square{" +
                "location=" + location +
                ", dimension=" + dimension +
                '}';
    }
}
