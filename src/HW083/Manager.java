package HW083;

public class Manager extends Worker{

    private int numberOfSubordinates;

    public Manager(String name, double baseSalary, int numberOfSubordinates) {
        super(name, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public Manager(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        double salaryManager = super.getSalary() + (super.getSalary() * ((getNumberOfSubordinates() * 1.00) / (100 * 3)));
        if (!(salaryManager == 0)) {
            return salaryManager;
        } else return super.getSalary();
    }

    public double getBaseSalary(){
        return super.getSalary();
    }
}
