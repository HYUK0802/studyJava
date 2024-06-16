package Chapter5.ch06;

public class GenericPrinter<T> {

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
