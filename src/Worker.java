public class Worker extends Employee{

    private double wagePerHour;

    private int hours;

    public Worker(){}

    public Worker(String name,double wagePerHour,int hours) {
        super(name);
        this.wagePerHour =wagePerHour;
        this.hours = hours;
    }

    public double getWagePerHour() {
        return wagePerHour;
    }

    public void setWagePerHour(double wagePerHour) {
        this.wagePerHour = wagePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }


    @Override
    public double salary() {
        return wagePerHour * hours;
    }

    @Override
    public String toString() {
        return super.toString() + " wage Per Hour is : " +wagePerHour + " Time work is : " + hours ;
    }
}

