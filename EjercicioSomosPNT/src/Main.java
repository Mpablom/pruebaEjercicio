import entities.Bebida;
import entities.Fruta;
import entities.Producto;
import entities.Shampoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Bebida bebida1 = new Bebida("Coca-Cola Zero", 1.5, 20);
        Bebida bebida2 = new Bebida("Coca-Cola", 1.5, 18);
        Shampoo shampoo = new Shampoo("Shampoo Sedal", "500ml", 19);
        Fruta fruta = new Fruta("Frutillas", 64, "kilo");

        List<Producto> productos = cargarProductos(bebida1, bebida2, shampoo, fruta);
        imprimirProductos(productos);

        String linea = crearLinea();
        String masCaro = obtenerProductoMasCaro(productos);
        String masBarato = obtenerProductoMasBarato(productos);

        System.out.println(linea + "\n" + masCaro + "\n" + masBarato);
    }

    public static List<Producto> cargarProductos(Producto... productos) {
        return new ArrayList<>(Arrays.asList(productos));
    }

    public static String obtenerProductoMasCaro(List<Producto> productos) {
        Producto productoMasCaro = Collections.max(productos);
        return "Producto más caro: " + productoMasCaro.getName();
    }

    public static String obtenerProductoMasBarato(List<Producto> productos) {
        Producto productoMasBarato = Collections.min(productos);
        return "Producto más barato: " + productoMasBarato.getName();
    }

    public static String crearLinea() {
        int longitudMaxima = 29;
        return IntStream.range(0, longitudMaxima).mapToObj(i -> "=").collect(Collectors.joining());
    }

    public static void imprimirProductos(List<Producto> productos) {
        productos.forEach(System.out::println);
    }
}