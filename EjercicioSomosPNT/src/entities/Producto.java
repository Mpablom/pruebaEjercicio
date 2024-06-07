package entities;

public interface Producto extends Comparable<Producto> {
    String getName();
    int getPrecio();

    @Override
    default int compareTo(Producto other) {
        return Integer.compare(this.getPrecio(), other.getPrecio());
    }
}
