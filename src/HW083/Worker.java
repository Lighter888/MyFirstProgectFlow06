package HW083;

public class Worker extends Employee{


    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    public double getSalaryWorker() {
        return getBaseSalary();
    }
}
