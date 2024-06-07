package entities;

public class Shampoo implements Producto{
    private Long id;
    private String name;
    private String contenido;
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
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Shampoo() {
        super();
    }
    public Shampoo(String name, String contenido, int precio) {
        super();
        this.name = name;
        this.contenido = contenido;
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Nombre: " + name + " /// Contenido: " + contenido + " /// Precio: $" + precio;
    }

}