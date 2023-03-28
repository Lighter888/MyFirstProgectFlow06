package HW083;

public class Director extends Manager{

    public Director(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
    @Override
    public double getSalary() {
        double salaryDirector = super.getSalary() + (super.getSalary() * ((getNumberOfSubordinates() * 1.00) / (100 * 9)));
        if (!(salaryDirector == 0)) {
            return salaryDirector;
        } else return getSalary();
    }
}
