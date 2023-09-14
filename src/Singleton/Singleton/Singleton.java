package Singleton.Singleton;
//Ключевые моменты следующие:
//
//        мы делаем приватный конструктор. Тогда к этому конструктору можно обратиться лишь изнутри этого же класса, другие классы не смогут получить доступ;
//        внутри класса создаем единственный объект класса, и сохраняем эту ссылку;
//        делаем публичный статический метод, с помощью которого и получаем ссылку на единственный объект класса.

public class Singleton {
    private static final Singleton database = new Singleton();

    private Singleton() {
        System.out.println("loading...");
        //Инициализируем соединение с базой данных
    }

    public static Singleton getInstance() {
        return database;
    }

    public Object getData() {
        return null;
    }
}


