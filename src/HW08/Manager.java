package HW08;

public class Manager extends Employee{

    private int countWorkers;

    public Manager(String name, int age, char gender, double rate, int countWorkers) {
        super(name, age, gender, rate);
        this.countWorkers = countWorkers;
    }

    public int getCountWorkers() {
        return countWorkers;
    }

    public void setCountWorkers(int countWorkers) {
        this.countWorkers = countWorkers;
    }

    public double getSalary(int days) {
        return ((getRate() * days) * (1 + 0.01 * getCountWorkers()));
    }
}
