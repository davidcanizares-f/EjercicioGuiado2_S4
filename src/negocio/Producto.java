package negocio;

public class Producto {

    private String nombre;
    private double precio;
    private String categoria;
    private int id;
    private static int contador =0;

    public Producto(String nombre, double precio, String categoria){
        setNombre(nombre);
        setPrecio(precio);
        setCategoria(categoria);
        contador++;
        this.id = contador;
    }

    public static int getTotalCreados(){
        return contador;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        }

    }
    public String getNombre() {
        return nombre;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            precio = 0;
        }
        this.precio = precio;

    }
    public double getPrecio() {
        return precio;
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isBlank()) {
            this.categoria = categoria;
        }

    }
    public String getCategoria() {
        return categoria;
    }

    public int getId(){
        return id;
    }

    /*public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            porcentaje = 0;
            System.out.println("[!] El porcentaje ingresado fue negativo o mayor a 100.");
        } else {
            System.out.println("[!] Aplicando descuento del " + porcentaje + "%...");
            double descuento = precio * (porcentaje / 100);
            this.precio = precio - descuento;
        }

    }*/
}