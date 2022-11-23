public abstract class Employee {

    private String name;

    public Employee(){}

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double salary();


    @Override
    public String toString() {
        return "Employee's name : " + name;
    }
}

