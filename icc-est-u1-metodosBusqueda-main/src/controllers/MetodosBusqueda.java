package controllers;

import  models.Person;
import views.ShowConsole;

public final class MetodosBusqueda {

    private ShowConsole showConsole;
    private Person [] people;

    public MetodosBusqueda(Person[] persons){
        showConsole = new ShowConsole();
        this.people = persons;
        showPerson();
    }

    public int busquedaLineal(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    /**
     * @param code a buscar
     * @return posicion de la persona encontrada
     */
    public int findPersonByCode(int code){
        for (int i = 0; i < people.length; i++) {
            if (people[i].getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void showPerson(){
        int codeToFind = showConsole.inputCode();
        int indexPerson = findPersonByCode(codeToFind);
        if(indexPerson >= 0){
            showConsole.showMessage(" Persona con codigo " +codeToFind+ " encontrada ");
            showConsole.showMessage(people[indexPerson].toString());
        }else{
            showConsole.showMessage("Persona no encontrada");
        }

    }

    public int findPersonByName(String name){
        return -1;
    }
    public void showPersonByName(){
        String nameTofind = showConsole.inputName();
        int indexPerson = findPersonByName(nameTofind);
    }
}