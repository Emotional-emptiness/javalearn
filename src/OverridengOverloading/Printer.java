package OverridengOverloading;

public class Printer {
    public String print(String toPrint) {
        System.out.println("Print from String: " + toPrint);
        return toPrint;
    }
    public void print(String toPrint, String string) {
        System.out.println("Print from String: " + toPrint);
    }
    public int print(int toPrint) {
        System.out.println("Print from Integer: " + toPrint);
        return toPrint;
    }
}
