package Imutable;

import java.util.Arrays;

public class Main {
    //immutable - неизменяемы объект
    //mutable - изменяемый объект
    public static void main(String[] args) {
//        String changed = "123" + "hello" + "world";
//        String newString = changed.replace("1", "error");
////        System.out.println("changed.replace = " + changed.replace("1", "error"));
//        System.out.println("changed = " + changed);
//        System.out.println("newString = " + newString);
        Student student = new Student("Oleksandr", "Yanov");
        String[] lessons = student.getLessons();
        lessons[1] = "Math"; // пытаемся изменить элемент массива
        System.out.println("student.getLessons() = " + Arrays.toString(student.getLessons()));
        student.setFirstName("Oleg"); // пытаемся изменить имя
        student.setLastName("Ivanovskiy"); // пытаемся изменить фамилию
        System.out.println("student.getFirstName() = " + student.getFirstName());
        System.out.println("student.getLastName() = " + student.getLastName());
    }
}
