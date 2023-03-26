package HW083;

public class Manager extends Employee{

    private int numberOfSubordinates;
    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalaryManager() {
        double salaryManager = getBaseSalary() + (getBaseSalary() * ((getNumberOfSubordinates() * 1.00) / (100 * 3)));
        if (!(salaryManager == 0)) {
            return salaryManager;
        } else return getBaseSalary();
    }
}
