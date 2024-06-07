package entities;

public class Fruta implements Producto {
    private Long id;
    private String name;
    private int precio;
    private String unidadDeVenta;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }
    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }
    public Fruta() {
        super();
    }
    public Fruta(String name, int precio, String unidadDeVenta) {
        super();
        this.name = name;
        this.precio = precio;
        this.unidadDeVenta = unidadDeVenta;
    }
    @Override
    public String toString() {
        return "Nombre: " + name + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadDeVenta;
    }

}