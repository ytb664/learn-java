public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        Car ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);
//        Object car = Car.getCar("Gas", "Porsche");
//        GasPoweredCar porsche = (GasPoweredCar) car;
//        porsche.startEngine();
//        porsche.drive();

//        Scanner s = new Scanner(System.in);
//        while (true) {
//            System.out.printf("What's your car type? %s %n",
//                    "'G' for Gas Car, 'E' for Electric, 'H' for Hybrid, 'Q' to quit");
//            String type = s.nextLine();
//
//            if ("Qq".contains(type)) {
//                break;
//            }
//
//            System.out.print("What's your car? ");
//            String description = s.nextLine();
//
//            System.out.print("What's the distance of your destination? ");
//            int distance = Integer.parseInt(s.nextLine());
//
//            Car car = Car.getCar(type, description);
//            car.startEngine();
//            car.drive();
//            car.runEngine(distance);
//        }
    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}
