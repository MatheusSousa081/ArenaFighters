package code.matheus.game.entity;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Element;
import code.matheus.lib.graphics.Location;
import code.matheus.lib.graphics.Sprite;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class Player implements Element {
    private @NotNull String name;
    private @NotNull Dimension dimension;
    private @NotNull Location location;
    private @NotNull Sprite sprite;

    public Player(@NotNull String name, @NotNull Location location, @NotNull Dimension dimension, @NotNull Sprite sprite) {
        this.name = name;
        this.dimension = dimension;
        this.location = location;
        this.sprite = sprite;
    }

    public @NotNull String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public @NotNull Sprite getSprite() {
        return sprite;
    }

    public void setSprite(@NotNull Sprite sprite) {
        this.sprite = sprite;
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
    public @NotNull Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(@NotNull Location location) {
        this.location = location;
    }

    @Override
    public void draw(@NotNull Graphics2D graphics2D, @NotNull Location location, @NotNull Dimension dimension) {
        graphics2D.drawImage(sprite.getImage(), location.getX(), location.getY(), dimension.getWidth(), dimension.getHeight(), null);
        graphics2D.drawString(name,location.getX() - 8, location.getY());
        graphics2D.dispose();
    }

    public void updatePosition(@NotNull Location location) {
        this.location.setX(location.getX());
        this.location.setY(location.getY());
    }

    public void updateDimension(@NotNull Dimension dimension) {
        this.dimension.setWidth(dimension.getWidth());
        this.dimension.setHeight(dimension.getHeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Objects.equals(name, player.name) && Objects.equals(dimension, player.dimension) && Objects.equals(location, player.location) && Objects.equals(sprite, player.sprite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dimension, location, sprite);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dimension=" + dimension +
                ", location=" + location +
                '}';
    }
}