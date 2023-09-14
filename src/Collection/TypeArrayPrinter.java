package Collection;

class TypeArrayPrinter {
    // Обобщенный метод, который печатает элементы массива.
    public <E> void printArray(E[] data) {
        for (E item : data) {
            System.out.println(item); // Печатает каждый элемент массива.
        }
    }
}

class TypeArrayPrinterTest {
    public static void main(String[] args) {
        String[] items = {"Привет", "Java"}; // Создание массива строк.
        Integer[] years = {2000, 3000};      // Создание массива целых чисел.

        TypeArrayPrinter typeArrayPrinter = new TypeArrayPrinter(); // Создание экземпляра TypeArrayPrinter.
        typeArrayPrinter.printArray(items);     // Вызов метода printArray для печати элементов массива items.
        typeArrayPrinter.printArray(years);     // Вызов метода printArray для печати элементов массива years.
    }
}
