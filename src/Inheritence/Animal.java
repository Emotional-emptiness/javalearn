package Inheritence;

public class Animal {
    public void commands() {
        writeEatCommand();
    }
    public void dog() {
        System.out.println("is a dog");
    }
    public void cat() {
        System.out.println("is a cat");
    }

    private void writeEatCommand() {
        System.out.println("eating...");
    }
}

