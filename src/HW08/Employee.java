package HW08;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double rate;

    public Employee(String name, int age, char gender, double rate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getRate() {
        return rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getSalary(int days) {
        return (days * getRate());
    }

}



