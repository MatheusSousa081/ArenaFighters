package code.matheus.lib.graphics;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public interface Element {
    @NotNull Location getLocation();

    void setLocation(@NotNull Location location);

    @NotNull Dimension getDimension();

    void setDimension(@NotNull Dimension dimension);

    void draw(@NotNull Graphics2D graphics2D, @NotNull Location location, @NotNull Dimension dimension);
}
