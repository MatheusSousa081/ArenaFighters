package code.matheus.lib.window;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Location;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Reference {
    private final @NotNull Dimension dimension;
    private final @NotNull Location location;

    public Reference(@NotNull Dimension dimension, @NotNull Location location) {
        this.dimension = dimension;
        this.location = location;
    }

    public @NotNull Dimension getDimension() {
        return dimension;
    }

    public @NotNull Location getLocation() {
        return location;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reference reference = (Reference) o;
        return Objects.equals(dimension, reference.dimension) && Objects.equals(location, reference.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, location);
    }
}
