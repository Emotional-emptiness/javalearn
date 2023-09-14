package Excepsion;

import java.io.FileNotFoundException;
import java.util.Objects;

public class ExcepsionsLecture {
    public static void main(String[] args) {
        try {
            method1("someText");
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }   finally {
            System.out.println("end");
        }
    }

    private static void method1(String someText) throws FileNotFoundException, ClassNotFoundException {
        if (Objects.isNull(someText)) {
            throw new ClassNotFoundException();
        }
        throw new FileNotFoundException("File with name: " + someText + " not found");
    }
    private static void method2() {
        throw new RuntimeException("some problems");
    }
}
