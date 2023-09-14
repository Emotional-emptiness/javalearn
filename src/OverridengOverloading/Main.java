package OverridengOverloading;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(18, "Oleksander", "124gmail.com");
        System.out.println("persona.toString() = " + persona.toString());

        Printer printer = new Printer();
        printer.print("25");
        printer.print(10);
    }
}