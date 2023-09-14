package OverridengOverloading;

public class Persona {
    private int age;
    private String name;
    private String email;

    public Persona(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Age: " + age + ", Name: " + name + ", Email: " + email;
    }
}
