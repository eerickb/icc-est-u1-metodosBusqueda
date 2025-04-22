package models;

public class Person {
    private int code;
    private String name;
    private int edad;

    public Person(int code, String name, int edad) {
        this.code = code;
        this.name = name;
        this.edad = edad;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [Code=" + code + ", Name=" + name + ", Edad=" + edad + "]";
    }
}