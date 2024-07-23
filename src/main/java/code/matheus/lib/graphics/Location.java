package code.matheus.lib.graphics;

import org.jetbrains.annotations.Range;

import java.util.Objects;

public final class Location {
    @Range(from = 0, to = 3480)
    private int x;
    @Range(from = 0, to = 2160)
    private int y;

    public Location(@Range(from = 0, to = 3480) int x, @Range(from = 0, to = 2160) int y) {
        this.x = x;
        this.y = y;
    }

    @Range(from = 0, to = 3480)
    public int getX() {
        return x;
    }

    public void setX(@Range(from = 0, to = 3480) int x) {
        this.x = x;
    }

    @Range(from = 0, to = 2160)
    public int getY() {
        return y;
    }

    public void setY(@Range(from = 0, to = 2160) int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
