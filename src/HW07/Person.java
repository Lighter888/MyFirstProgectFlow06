package HW07;

public class Person {

    String Name;
    int Age;
    String Gender;

    public Person(String Name, int Age, String Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }

    public String getName() {
        if (Gender.equals("Male")) {
            return "Mr " + Name;
        } else {
            return "Mrs " + Name;
        }
    }



}
