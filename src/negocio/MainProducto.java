package negocio;

public class MainProducto {
    public static void main(){
        System.out.println("-Numero de Objetos antes de crearlos: " + Producto.getTotalCreados());

        Producto p1 = new Producto("Mouse", 20, "Tecnología");

        System.out.println("-Numero de Objetos después de crear 1: " + Producto.getTotalCreados());

        Producto p2 = new Producto("Cuaderno", 3.5, "Papelería");
        Producto p3 = new Producto("Audífonos", 45, "Tecnología");

        System.out.println("-Numero de Objetos después de crear 3: " + Producto.getTotalCreados());
        System.out.println("\n === PRODUCTOS ===");
        mostrarInformacion(p1);
        mostrarInformacion(p2);
        mostrarInformacion(p3);

        System.out.println("\n====== RESULTADOS CONTADOR =====");
        System.out.println("Total de productos creados: " + Producto.getTotalCreados());



    }

    public static void mostrarInformacion(Producto p){
        System.out.println("> ID: " + p.getId());
        System.out.println("> Nombre: " + p.getNombre());
        System.out.println("> Precio: $ " + p.getPrecio());
        System.out.println("> Categoría: " + p.getCategoria());
        System.out.println("---------------------------------------");

    }



}
