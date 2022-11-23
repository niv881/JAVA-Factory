import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    public void mainStart(){
        System.out.println("Welcome to My first Factory ! \n");
        printAction();
        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        boolean shutdown = false;
        while (shutdown != true){
            System.out.println("\n You can always press 10 in order to get back to the Menu..");
            System.out.println("\n Select your action: ");

            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 0:
                        shutdown = true;
                        break;
                    case 1:
                        factory.addEmployee(getNewWorker());

                        break;
                    case 2:
                        factory.addEmployee(getNewManger());
                        break;
                    case 3:
                        System.out.println(factory);
                        break;
                    case 4:
                        factory.numOfWorker();
                        break;
                    case 5:
                        factory.getByName(getName());
                        break;
                    case 6:
                        factory.salaryByName(getName());
                        break;
                    case 7:
                        factory.minHours();
                        break;
                    case 8:
                        factory.biggestSalary();
                        break;
                    case 9:
                        factory.mostManager();
                        break;
                    case 10:
                        printAction();
                        break;
                    default:
                        System.out.println("this number do nothing... please enter  ");

                }
            }catch (InputMismatchException e) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n " +
                        "this is not valid ! \n\n please enter only number between 0-10 " +
                        "\n !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                mainSaver(factory);
            }
        }
    }


    private static void mainSaver(Factory factory){
        System.out.println("Welcome to My first Factory ! \n");
        printAction();
        Scanner scanner = new Scanner(System.in);
        boolean shutdown = false;
        while (shutdown != true){
            System.out.println("\n You can always press 10 in order to get back to the Menu..");
            System.out.println("\n Select your action: ");

            try {
                int action = scanner.nextInt();
                switch (action) {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        factory.addEmployee(getNewWorker());
                        break;
                    case 2:
                        factory.addEmployee(getNewManger());
                        break;
                    case 3:
                        System.out.println(factory);
                        break;
                    case 4:
                        factory.numOfWorker();
                        break;
                    case 5:
                        factory.getByName(getName());
                        break;
                    case 6:
                        factory.salaryByName(getName());
                        break;
                    case 7:
                        factory.minHours();
                        break;
                    case 8:
                        factory.biggestSalary();
                        break;
                    case 9:
                        factory.mostManager();
                        break;
                    case 10:
                        printAction();
                        break;
                    default:
                        System.out.println("this number do nothing... please enter  ");

                }
            }catch (InputMismatchException e) {
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! \n " +
                        "this is not valid ! \n\n please enter only number between 0-10 " +
                        "\n !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                mainSaver(factory);
            }
        }
    }

    private static void printAction(){
        System.out.println("\n please select one of the available actions : ");
        System.out.println(
                "0 - to shutdown the application \n"+
                        " 1 - to add worker to the factory \n"+
                        " 2 - to add manger to the factory \n"+
                        " 3 - to print all employee in the Factory \n"+
                        " 4 - to know how much employee in the factory \n"+
                        " 5 - to find Employee by name \n"+
                        " 6 - to get month salary of employee \n"+
                        " 7 - to get the lazy worker \n"+
                        " 8 - to get the biggest salary employee \n"+
                        " 9 - to get the big boss \n"
        );
    }


    private static Employee getNewWorker(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter new Worker name : ");
        String name = scanner.nextLine();

        System.out.println("Please enter The worker wage per hour : ");
        double wegePerHour = scanner.nextDouble();

        System.out.println("Please enter The worker hours : ");
        int hours = scanner.nextInt();

        return new Worker(name,wegePerHour,hours);
    }

    private static Employee getNewManger(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter new Manger name : ");
        String name = scanner.next();

        System.out.println("Please enter The Manger wage : ");
        double wege = scanner.nextDouble();

        System.out.println("Please enter The number Of Worker : ");
        int numOfWorker = scanner.nextInt();

        return new Manger(name,wege,numOfWorker);
    }

    private static String getName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the employee you want to search : ");
        String name = scanner.nextLine();
        return name;
    }

}
