package code.matheus.lib.window;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Element;
import code.matheus.lib.graphics.Location;
import org.jetbrains.annotations.NotNull;

public interface Layout {
    @NotNull Dimension getDimensionReference(@NotNull Element element);

    @NotNull Location getLocationReference(@NotNull Element element);
}
