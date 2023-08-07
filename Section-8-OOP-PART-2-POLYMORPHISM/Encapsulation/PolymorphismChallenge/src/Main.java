import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Object car = Car.getCar("Gas", "Porsche");
//        GasPoweredCar porsche = (GasPoweredCar) car;
//        porsche.startEngine();
//        porsche.drive();

        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.printf("What's your car type? %s %n",
                    "'G' for Gas Car, 'E' for Electric, 'H' for Hybrid, 'Q' to quit");
            String type = s.nextLine();

            if ("Qq".contains(type)) {
                break;
            }

            System.out.print("What's your car? ");
            String description = s.nextLine();

            System.out.print("What's the distance of your destination? ");
            int distance = Integer.parseInt(s.nextLine());

            Car car = Car.getCar(type, description);
            car.startEngine();
            car.drive();
            car.runEngine(distance);
        }
    }
}
