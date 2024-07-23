package code.matheus.lib.graphics;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Range;

import java.util.Objects;

public final class Dimension {
    @Range(from = 0, to = 3840)
    private int width;
    @Range(from = 0, to = 2160)
    private int height;

    public Dimension(@Range(from = 0, to = 3840) int width, @Range(from = 0, to = 2160) int height) {
        this.width = width;
        this.height = height;
    }

    public Dimension(@NotNull Dimension dimension) {
        this.width = dimension.getWidth();
        this.height = dimension.getHeight();
    }

    @Range(from = 0, to = 3840)
    public int getWidth() {
        return width;
    }

    public void setWidth(@Range(from = 0, to = 3840) int width) {
        this.width = width;
    }

    @Range(from = 0, to = 2160)
    public int getHeight() {
        return height;
    }

    public void setHeight(@Range(from = 0, to = 2160) int height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimension dimension = (Dimension) o;
        return width == dimension.width && height == dimension.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return width + "w, " + height + "h";
    }
}