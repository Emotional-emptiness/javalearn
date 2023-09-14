package Imutable;

import java.util.Arrays;

public final class Student {
    private final String firstName;
    private final String lastName;
    private final String[] lessons;
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.lessons = new String[]{"Math", "Physic", "Biology"};
    }
    public Student setFirstName(String firstName) {
        return new Student(firstName, lastName);
    }
    public Student  setLastName(String lastName) {
        return new Student(firstName, lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String[] getLessons() {
        return Arrays.copyOf(lessons, lessons.length);
    }
}
