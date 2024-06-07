package entities;

public class Bebida implements Producto {

    private Long id;
    private String name;
    private double litros;
    private int precio;

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
    public double getLitros() {
        return litros;
    }
    public void setLitros(double d) {
        this.litros = d;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Bebida() {
        super();
    }
    public Bebida(String name, double litros, int precio) {
        super();
        this.name = name;
        this.litros = litros;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Nombre: " + name + " /// Litros: " + litros + " /// Precio: $" + precio ;
    }

}
