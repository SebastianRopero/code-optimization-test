public class Store {
    public static void main(String[] args) {

        final int[] precioDeProductos = { 15, 10, 5 }; // Almacenar el precio de los productos como constantes

        final int[] cantidadesVendidas = { 2, 3, 4 }; // Almacenar las cantidades que se vendieron de cada producto como
                                                      // constantes

        final int umbralDeVentas = 50; // Se almacena en una constante el umbral de ventas

        int ventasTotales = 0; // Se define ventas totales como un contador que se va incrementando teniendo en
                               // cuenta los precios y las cantidades

        for (int i = 0; i < precioDeProductos.length; i++) {
            ventasTotales += precioDeProductos[i] * cantidadesVendidas[i];
        } // Se utiliza un bucle para calcular el numero de ventas totales

        System.err.println(ventasTotales);

        if (ventasTotales > umbralDeVentas) {
            System.out.println("Buen desempeño de ventas");
        } else {
            System.out.println("Bajo rendimiento de ventas");
        } // Se compara el numero de ventas totales con el umbral de ventas para verificar
          // si hubo un buen desempeño de ventas o no
    }
}