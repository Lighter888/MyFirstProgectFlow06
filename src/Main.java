import HW083.*;

public class Main {
    public static void main(String[] args) {

//        Задача 7.2
//        Employee employee1 = new Employee("Max", 33, 'M', 10.00);
//
//        System.out.println(employee1.getSalary(100));
//
//        Manager manager1 = new Manager("David", 56, 'M', 10.00, 3);
//
//        System.out.println(manager1.getSalary(100));

        Employee employee1 = new Employee("Anrew", 40000);

        Employee employee2 = new Employee("Max", 55000);

        Worker worker1 = new Worker("Rendy", 45000);

        Manager manager1 = new Manager("Michael", 65000, 22 );
        Manager manager2 = new Manager("Howie", 76000, 66);
        Manager manager3 = new Manager("Alex", 66000, 2);

        Director director1 = new Director("Alan", 100000, 23);

        System.out.println(manager1.getSalaryManager());
        System.out.println(director1.getSalaryDirector());

        Utilities util = new Utilities();

        System.out.println(util.findEmployee(new Employee[] {employee1, employee2}, "Max"));

        System.out.println(util.findEmployeeDetail(new Employee[] {employee1, employee2}, "w"));

        System.out.println(util.getSumSalary(new Employee[] {employee1, employee2}));

        System.out.println("Минимальная заплата " + util.findMinSalary(new Employee[] {employee1, employee2}));

        System.out.println("Максимальная заплата " + util.findMaxSalary(new Employee[] {employee1, employee2}));

        System.out.println(util.findMinNumberOfSubordinates(new Manager[] {manager1, manager2, manager3}));

        System.out.println(util.findMaxNumberOfSubordinates(new Manager[] {manager1, manager2, manager3}));

        System.out.println((manager1.getSalaryManager()) - manager1.getBaseSalary());
        System.out.println((manager2.getSalaryManager()) - manager2.getBaseSalary());
        System.out.println((manager3.getSalaryManager()) - manager3.getBaseSalary());

        System.out.println("Максимальный бонус у менеджера " + util.findMaxBonusOfManagers(new Manager[] {manager1, manager2, manager3}));
        System.out.println("Минимальный бонус у менеджера " + util.findMinBonusOfManagers(new Manager[] {manager1, manager2, manager3}));






    }
}

