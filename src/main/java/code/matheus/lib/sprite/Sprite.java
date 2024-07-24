package code.matheus.lib.sprite;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Objects;

public class Sprite {
    private @NotNull Image image;

    public Sprite(File file) {
        ImageIcon reference = new ImageIcon(file.getPath());
        image = reference.getImage();
    }

    public Sprite(@NotNull Image image) {
        this.image = image;
    }

    public @NotNull Image getImage() {
        return image;
    }

    public void setImage(@NotNull Image image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sprite sprite = (Sprite) o;
        return Objects.equals(image, sprite.image);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(image);
    }
}
