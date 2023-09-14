package Inheritence;

public class Cat extends Animal {

    @Override
    public void commands() {
        super.cat();
        System.out.println("Eat as a cat food");
        super.commands();
    }
}
