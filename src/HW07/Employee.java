package HW07;

public class Employee extends Person {

    double salary;
    public Employee(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    public boolean isSameName(Employee employee) {
        return  (employee.name.equals(name));

    }
}
