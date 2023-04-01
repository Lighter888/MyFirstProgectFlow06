package HW083;

import java.util.Objects;

public class Utilities {

    public static String findEmployee(HW083.Employee[] employeesArray, String name) {
        for (HW083.Employee employee : employeesArray) {
            if (name.equals(employee.getName())) {
                return name;
            }
        }
        return "Не найдено";
    }
    public static String findEmployeeDetail(HW083.Employee[] employeesArray, String str) {
        if (str.isEmpty()) {
            return "Не найдено";
        }
        for (HW083.Employee employee : employeesArray) {
            if (employee.getName().contains(str)) {
                return employee.getName();
            }
        }
        return "Не найдено";
    }
    public static double getSumSalary(Employee[] employeesArray) {
        double sum = 0;
        for (Employee employee : employeesArray)
            sum += employee.getSalary();
        return sum;
    }

    public static double findMinSalary(HW083.Employee[] employeesArray) {
        double min = Double.POSITIVE_INFINITY;
        for (Employee employee : employeesArray) {
            if (min > employee.getSalary()) {
                min = employee.getSalary();
            }
        }
        return min;
    }
    public static double findMaxSalary(HW083.Employee[] employeesArray) {
        double max = Double.NEGATIVE_INFINITY;
        for (Employee employee : employeesArray) {
            if (max < employee.getSalary()) {
                max = employee.getSalary();
            }
        }
        return max;
    }
    public static int findMinNumberOfSubordinates(Manager[] managersArray) {
        int min = managersArray[0].getNumberOfSubordinates();
        for (Manager manager : managersArray) {
            if (min > manager.getNumberOfSubordinates()) {
                min = manager.getNumberOfSubordinates();
            }
        }
        return  min;
    }
    public static int findMaxNumberOfSubordinates(Manager[] managersArray) {
        int max = managersArray[0].getNumberOfSubordinates();
        for (Manager manager : managersArray) {
            if (max < manager.getNumberOfSubordinates()) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return  max;
    }
    public static double findMaxBonusOfManagers(Manager[] array) {
        double maxBonus = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < array.length ; i++) {
            double bonus = array[i].getBaseSalary() * (array[i].getNumberOfSubordinates() *  1.00) / (100 * 3);
            if (maxBonus < bonus) {
                maxBonus = bonus;
            }
        }
        return maxBonus;
    }
    public static double findMinBonusOfManagers(Manager[] managers) {
        double minBonus = Double.POSITIVE_INFINITY;
        for (Manager manager :managers) {
            double bonus = manager.getBaseSalary() * (manager.getNumberOfSubordinates() * 1.00) / (100 * 3);
            if (minBonus > bonus) {
                minBonus = bonus;
            }
        }
        return minBonus;
    }
}

