package Inheritence;

public class Dog extends Animal {
    public void bark() {
        System.out.println("bark...");
    }
    @Override
    public void commands() {
        super.dog();
        System.out.println("Eat as s dog food");
        super.commands();
    }
}
