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
        Manager manager4 = new Manager("Max", 120000);

        Director director1 = new Director("Alan", 100000, 23);

        System.out.println(manager1.getSalary());

        System.out.println(director1.getSalary());

        System.out.println(Utilities.findEmployee(new Employee[] {employee1, employee2}, "Max"));

        System.out.println(Utilities.findEmployeeDetail(new Employee[] {employee1, employee2}, "w"));

        System.out.println(Utilities.getSumSalary(new Employee[] {employee1, employee2}));

        System.out.println("Минимальная заплата " + Utilities.findMinSalary(new Employee[] {employee1, employee2}));

        System.out.println("Максимальная заплата " + Utilities.findMaxSalary(new Employee[] {employee1, employee2}));

        System.out.println(Utilities.findMinNumberOfSubordinates(new Manager[] {manager1, manager2, manager3}));

        System.out.println(Utilities.findMaxNumberOfSubordinates(new Manager[] {manager1, manager2, manager3}));

        Employee[] array = {manager1, manager2, manager3, worker1, employee1};

        Manager[] arrayManagers = {manager1, manager2, manager3, manager4};

        System.out.println(manager2.getSalary() - manager2.getBaseSalary());

        System.out.println("Сумма запрлат всех работников " + Utilities.getSumSalary(array));

        System.out.println("Максимальный бонус у менеджера " + Utilities.findMaxBonusOfManagers(arrayManagers));

        System.out.println("Минимальный бонус у менеджера " + Utilities.findMinBonusOfManagers(arrayManagers));








    }
}

