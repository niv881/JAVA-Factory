public class Manger extends Employee{

    double wage;

    int numOfWorker;

    public Manger(String name,double wage,int numOfWorker) {
        super(name);
        this.wage = wage;
        this.numOfWorker = numOfWorker;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getNumOfWorker() {
        return numOfWorker;
    }

    public void setNumOfWorker(int numOfWorker) {
        this.numOfWorker = numOfWorker;
    }


    @Override
    public double salary() {
        int worker;
        if (numOfWorker <= 10){
            return wage;
        } else if (10 < numOfWorker && numOfWorker<=20) {
            worker = numOfWorker -10;
            return wage + 50*worker;
        } else if (numOfWorker>20) {
            return wage + 1000;
        }
        return wage;
    }
    @Override
    public String toString(){
        return super.toString() + " wage is : " + wage +  " and number of worker is" + numOfWorker;
    }

}

