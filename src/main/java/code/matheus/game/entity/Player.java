package code.matheus.game.entity;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Element;
import code.matheus.lib.graphics.Location;
import code.matheus.lib.sprite.Sprite;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public class Player implements Element{
    private @NotNull String name;
    private @NotNull Dimension dimension;
    private @NotNull Location location;
    private @NotNull Sprite sprite;

    public Player(@NotNull String name, @NotNull Location location, @NotNull Dimension dimension, @NotNull Sprite sprite) {
        this.name = name;
        this.location = location;
        this.dimension = dimension;
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

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", dimension=" + dimension +
                ", location=" + location +
                '}';
    }
}