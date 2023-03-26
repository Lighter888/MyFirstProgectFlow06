package HW083;

public class Utilities {

    public String findEmployee(HW083.Employee[] employeesArray, String name) {
        for (HW083.Employee employee : employeesArray) {
            if (name.equals(employee.getName())) {
                return name;
            }
        }
        return "Не найдено";
    }
    public String findEmployeeDetail(HW083.Employee[] employeesArray, String str) {
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
    public double getSumSalary(HW083.Employee[] employeesArray) {
        double sum = 0;
        for (HW083.Employee employee : employeesArray)
            sum += employee.getBaseSalary();
        return sum;
    }

    public double findMinSalary(HW083.Employee[] employeesArray) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < employeesArray.length; i++) {
            if (min > employeesArray[i].getBaseSalary()) {
                min = employeesArray[i].getBaseSalary();
            }
        }
        return min;
    }
    public double findMaxSalary(HW083.Employee[] employeesArray) {
        double max = Integer.MIN_VALUE;
        for (int i = 0; i < employeesArray.length; i++) {
            if (max < employeesArray[i].getBaseSalary()) {
                max = employeesArray[i].getBaseSalary();
            }
        }
        return max;
    }
    public int findMinNumberOfSubordinates(Manager[] managersArray) {
        int min = managersArray[0].getNumberOfSubordinates();
        for (Manager manager : managersArray) {
            if (min > manager.getNumberOfSubordinates()) {
                min = manager.getNumberOfSubordinates();
            }
        }
        return  min;
    }

    public int findMaxNumberOfSubordinates(Manager[] managersArray) {
        int max = managersArray[0].getNumberOfSubordinates();
        for (Manager manager : managersArray) {
            if (max < manager.getNumberOfSubordinates()) {
                max = manager.getNumberOfSubordinates();
            }
        }
        return  max;
    }
    public double findMaxBonusOfManagers(Manager[] managersArray) {
        double maxBonus = managersArray[0].getSalaryManager() - managersArray[0].getBaseSalary();
        for (Manager manager : managersArray) {
            if (maxBonus < (manager.getSalaryManager() - manager.getBaseSalary())) {
                maxBonus = (manager.getSalaryManager() - manager.getBaseSalary());
            }
        }
        return maxBonus;
    }
    public double findMinBonusOfManagers(Manager[] managersArray) {
        double minBonus = managersArray[0].getSalaryManager() - managersArray[0].getBaseSalary();
        for (Manager manager : managersArray) {
            if (minBonus > (manager.getSalaryManager() - manager.getBaseSalary())) {
                minBonus = (manager.getSalaryManager() - manager.getBaseSalary());
            }
        }
        return minBonus;
    }

}

