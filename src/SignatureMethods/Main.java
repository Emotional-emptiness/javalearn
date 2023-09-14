package SignatureMethods;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("White", "HP", 30, 100);
        System.out.println("printer.getPrinterColor() = " + printer.getPrinterColor());
        System.out.println("printer.getMark() = " + printer.getMark());
        System.out.println("printer.getTypeSpeed() = " + printer.getTypeSpeed());
        System.out.println("printer.getPaintVolume() = " + printer.getPaintVolume());
    }
}
