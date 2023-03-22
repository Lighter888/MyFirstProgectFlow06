package HW07;

public class Salary {

    public double getSum(Employee[] employeesArray) {
        double sum = 0;
        for (Employee employee : employeesArray) {
            sum += employee.salary;

        }
        return sum;
    }
}
