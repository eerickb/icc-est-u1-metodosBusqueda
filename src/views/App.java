package views;

import controllers.MetodosBusqueda;
import models.Person;

public class App {
    public static void main(String[] args) {
        ShowConsole console = new ShowConsole();
        Person[] personas = new Person[9];

        for (int i = 0; i < personas.length; i++) {
            String[] datos = console.inputPerson(i);
            personas[i] = new Person(101 + i, datos[0], Integer.parseInt(datos[1]));
        }

        MetodosBusqueda mB = new MetodosBusqueda(personas);
        mB.buscarPorEdad();
    }
}