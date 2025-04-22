package controllers;

import models.Person;
import views.ShowConsole;

public final class MetodosBusqueda {
    private ShowConsole showConsole;
    private Person[] people;

    public MetodosBusqueda(Person[] persons) {
        showConsole = new ShowConsole();
        this.people = persons;
    }

    public int busquedaLineal(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    public int findPersonByCode(int code) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson() {
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con código " + codeToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public int findPersonByName(String name) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public void showPersonByName() {
        String nameToFind = showConsole.inputName();
        int indexPerson = findPersonByName(nameToFind);
        if (indexPerson >= 0) {
            showConsole.showMessage("Persona con nombre " + nameToFind + " encontrada");
            showConsole.showMessage(people[indexPerson].toString());
        } else {
            showConsole.showMessage("Persona no encontrada");
        }
    }

    public int busquedaBinariaPorEdad(int[] edades, int elemento) {
        int bajo = 0;
        int alto = edades.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = edades[centro];

            System.out.print("$");
            for (int i = bajo; i <= alto; i++) {
                System.out.print(edades[i]);
                if (i < alto) {
                    System.out.print("|");
                }
            }
            System.out.println("$");

            System.out.println("bajo = " + bajo + " \t alto = " + alto + " \t centro = " + centro + 
                              " \t valorCentro = " + valorCentro + " \t -> " + 
                              (valorCentro == elemento ? "ENCONTRADO" : (valorCentro < elemento ? "DERECHA" : "IZQUIERDA")));

            if (valorCentro == elemento) {
                return centro;
            } else if (valorCentro < elemento) {
                bajo = centro + 1;
            } else {
                alto = centro - 1;
            }
        }
        return -1;
    }

    public void buscarPorEdad() {
        int[] edades = new int[people.length];
        for (int i = 0; i < people.length; i++) {
            edades[i] = people[i].getEdad();
        }
        java.util.Arrays.sort(edades);

        int edadBuscada = showConsole.inputEdad();

        int indice = busquedaBinariaPorEdad(edades, edadBuscada);

        if (indice != -1) {
            for (Person persona : people) {
                if (persona.getEdad() == edadBuscada) {
                    showConsole.showMessage("La persona con la edad " + edadBuscada + " es " + persona.getName());
                    break;
                }
            }
        } else {
            showConsole.showMessage("No se encontró una persona con la edad " + edadBuscada);
        }
    }
}