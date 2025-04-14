public class App {
    private MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

    public static void main(String[] args) {
        App app = new App();
        int[] arreglo = {8, 10, 50, 30, 2, 19};
        int elementoBuscado = 30;

        System.out.println("Arreglo: ");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
        System.out.println("\nElemento buscado: " + elementoBuscado);

        int resultado = app.metodosBusqueda.busquedaLineal(arreglo, elementoBuscado);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}