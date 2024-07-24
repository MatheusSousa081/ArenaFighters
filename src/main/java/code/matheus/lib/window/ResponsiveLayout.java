package code.matheus.lib.window;

import code.matheus.lib.graphics.Dimension;
import code.matheus.lib.graphics.Element;
import code.matheus.lib.graphics.Location;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class ResponsiveLayout implements Layout{
    private final @NotNull Map<Element, Dimension> dimensionMap;
    private final @NotNull Map<Element, Location> locationMap;

    public ResponsiveLayout() {
        dimensionMap = new HashMap<>();
        locationMap = new HashMap<>();
    }

    public void addReference(Element element) {
        dimensionMap.put(element, element.getDimension());
        locationMap.put(element, element.getLocation());
    }

    public @NotNull Map<Element, Dimension> getDimensionMap() {
        return dimensionMap;
    }

    public @NotNull Map<Element, Location> getLocationMap() {
        return locationMap;
    }

    @Override
    public @NotNull Dimension getDimensionReference(@NotNull Element element) {
        return dimensionMap.get(element);
    }

    @Override
    public @NotNull Location getLocationReference(@NotNull Element element) {
        return locationMap.get(element);
    }
}
