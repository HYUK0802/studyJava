package Chapter5.ch06;

import Chapter5.ch07.Material;

public class GenericPrinter<T extends Material> {

    private T material;

    public T getMaterial() {
        return material;
    }

    public GenericPrinter<T> setMaterial(T material) {
        this.material = material;
        return this;
    }

    public String toString() {
        return material.toString();
    }
}
