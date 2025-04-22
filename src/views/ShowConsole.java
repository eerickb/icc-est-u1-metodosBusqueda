package views;

import java.util.Scanner;

public final class ShowConsole {
    private Scanner scanner;

    public ShowConsole() {
        this.scanner = new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {
        System.out.println("*** Métodos de Búsqueda ***");
    }

    public int inputCode() {
        System.out.println("Ingrese un código: ");
        int code = scanner.nextInt();
        scanner.nextLine();
        return code;
    }

    public String inputName() {
        System.out.println("Ingrese un nombre: ");
        return scanner.nextLine();
    }

    public String[] inputPerson(int index) {
        System.out.println("Ingrese Persona " + (index + 1) + ":");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        String edad = scanner.nextLine();
        return new String[]{nombre, edad};
    }

    public int inputEdad() {
        System.out.println("\nValor la personada de la edad: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}