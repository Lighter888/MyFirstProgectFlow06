import HW07.Employee;
import HW07.Person;
import HW07.Salary;
import HW072.Fighter;
import HW072.Kata;

public class Main {
    public static void main(String[] args) {

//        Person Person1 = new Person("Max", 34, "Male");
//        Person Person2 = new Person("Alla", 55, "Female");
//
//        System.out.println(Person1.getName());
//        System.out.println(Person2.getName());
//
//        Employee employee1 = new Employee("Fadit", 32,"Male", 1212.00);
//        Employee employee2 = new Employee("Fadit", 44, "Male", 100.44);
//
//        System.out.println(employee1.isSameName(employee2));
//
//        Employee[] employees = {employee1, employee2};
//
//        Salary salary = new Salary();
//
//        System.out.println(salary.getSum(employees));


        Fighter fighter1 = new Fighter("Lew", 10, 2);
        Fighter fighter2 = new Fighter("Harry", 5, 4);

        System.out.println(Kata.declareWinner(fighter1,fighter2, "Harry"));

    }
}

