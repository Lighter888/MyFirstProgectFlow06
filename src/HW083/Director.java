package HW083;

public class Director extends Manager{

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public double getSalaryDirector() {
        double salaryDirector = getBaseSalary() + (getBaseSalary() * ((getNumberOfSubordinates() * 1.00) / (100 * 9)));
        if (!(salaryDirector == 0)) {
            return salaryDirector;
        } else return getBaseSalary();
    }
}
