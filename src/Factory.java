import java.util.Arrays;
import java.util.Optional;

public class Factory {

    Employee [] employees;
    int numOfEmps;

    public Factory() {
        this.employees = new Employee[EMAXEMPS.Max.getMax()];
        this.numOfEmps = 0;
    }

    public boolean addEmployee(Employee e){
        if (numOfEmps != employees.length){
            employees[numOfEmps] = e;
            numOfEmps++;
            System.out.println("The worker or manager add to the Factory!");
            return true;
        }
        System.out.println("unfortunately the Factory is Full ! ");
        return false;
    }


    public int numOfWorker(){
        System.out.println("Number of worker in the Factory is : " + numOfEmps);
        return numOfEmps;
    }

    public Manger mostManager(){
        int bigger = 0;
        Manger bigBoss = null;
        for(Employee employee : employees){
                if (employee instanceof Manger) {
                    if (((Manger) employee).getNumOfWorker() > bigger) {
                        bigger = ((Manger) employee).getNumOfWorker();
                        bigBoss = ((Manger) employee);
                    }
                }
        }
        System.out.println("The manger with the most of worker is : " + bigBoss.getName() + " with number of worker : " + bigger);
        return bigBoss;
    }


    public Optional<Employee> minHours(){

        Optional<Employee> lazyWorker = Arrays.stream(employees).filter(employee -> employee instanceof Worker)
                .reduce((employee, employee2) ->
                        ((Worker)employee).getHours() < ((Worker)employee2).getHours() ? employee : employee2);

        System.out.println("The lazy worker is : " + lazyWorker);
        return lazyWorker;
    }


    public Employee biggestSalary(){
        double biggestSalary = 0 ;
        Employee employee = null;

        for ( Employee e : employees ){
            if (e instanceof Manger) {
                if (((Manger) e).salary() > biggestSalary) {
                    biggestSalary = e.salary();
                    employee = e;
                }
            }else if (e instanceof Worker){
                if (((Worker) e).salary() > biggestSalary) {
                    biggestSalary = e.salary();
                    employee = e;
                }
            }
        }
        System.out.println("the biggest salary employee is : " + employee.getName());

        return employee;
    }

    public Employee getByName(String eName){
        int index = 0;
        for (Employee employee : employees){
            if (index <numOfEmps) {
                if (employee.getName().equals(eName) ) {
                    System.out.println(employee);
                    return employee;
                }
                index++;
            }
        }
        System.out.println("The employee don't work here!");
        return null;
    }

    public double salaryByName(String name){
        int index = 0 ;
        double salary;
        for(Employee employee : employees){
            if (index < numOfEmps){
                if (employee.getName().equals(name)){
                    if (employee instanceof Manger){
                        salary = ((Manger) employee).salary() * 30;
                        System.out.println(salary);
                        return salary;
                    }else if (employee instanceof Worker){
                        salary = ((Worker) employee).salary() * 30;
                        System.out.println(salary);
                        return salary;
                    }
                }
                index++;
            }
        }
        System.out.println("This worker don't work here !");
        return 0;
    }

    @Override
    public String toString() {
        int index = 0;
        System.out.println("*************************************************************************************");
        System.out.println("Workers in factory : ");
        for (Employee employee : employees) {
            if (index < numOfEmps) {
                System.out.println("\n" + employee);
                index++;
            }
        }
        return "*************************************************************************************";
    }
}
