package Collection;

import java.util.Objects;

public class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return " {Employee: id = " + id + ", name = " + name + "} ";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return  true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return  false;
        }
        Employee employee = (Employee) obj;

        return this.id == employee.id && Objects.equals(this.name, employee.name);
    }
}
