public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " +
                getClass().getSimpleName());
        runEngine();
    }

    //    public Car(String description) {
//        description = description.toLowerCase();
//        String rest = description.substring(1);
//        char initial = description.toUpperCase().charAt(0);
//
//        this.description = initial + rest;
//    }
//
//    public void startEngine() {
//
//        String instanceType = this.getClass().getSimpleName();
//        System.out.println(description + ", " +
//                instanceType + " car is starting the engine");
//    }
//
//    public void drive() {
//
//        String instanceType = this.getClass().getSimpleName();
//        System.out.println("Driving " + instanceType);
//    }
//
//    protected void runEngine(int distance) {
//
//        System.out.println("Engine is running, to achieve destination we need: ");
//    }
//
//    public static Car getCar(String type, String description) {
//
//        return switch (type.toUpperCase().charAt(0)) {
//            case 'G' -> new GasPoweredCar(description, 6);
//            case 'E' -> new ElectricCar(description, 60);
//            case 'H' -> new HybridCar(description, 60, 6);
//            default ->  new Car(description);
//        };
//    }
}

class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLiter,
                         int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
    }
}

//class GasPoweredCar extends Car {
//
//    private double avgKmPerLitre;
//    private int cylinders;
//
//    public GasPoweredCar(String description, int cylinders) {
//        super(description);
//        this.cylinders = cylinders <= 0 ? -1 : cylinders;
//        this.avgKmPerLitre = Math.round((100.0 / cylinders));
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//        System.out.printf("> %s%n".repeat(3),
//                "COOL NOISE",
//                "Attracting Attention",
//                "Engine ON");
//        System.out.println("-".repeat(10));
//    }
//
//    @Override
//    public void drive() {
//        super.drive();
//        String textBlock = """
//                > With a Stick Shift
//                Using $avgKmPerLitreKM/L of gas""".replace("$avgKmPerLitre",
//                String.valueOf(Math.round(avgKmPerLitre)));
//        System.out.println(textBlock + "\n" + "-".repeat(10));
//    }
//
//    @Override
//    protected void runEngine(int distance) {
//        super.runEngine(distance);
//        System.out.println(Math.round(distance / avgKmPerLitre) + "L of Gas");
//    }
//}
//
//class ElectricCar extends Car {
//
//    private double avgKmPerCharge;
//    private int batterySize;
//
//    public ElectricCar(String description, int batterySize) {
//        super(description);
//        this.batterySize = batterySize <= 0 ? -1 : batterySize;
//        this.avgKmPerCharge = batterySize * 0.15d;
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//        System.out.printf("> %s%n".repeat(3),
//                "No Noise",
//                "Smooth Start",
//                "Infotainment System Said Engine ON");
//        System.out.println("-".repeat(10));
//    }
//
//    @Override
//    public void drive() {
//        super.drive();
//        String textBlock = "> Starting Auto-Pilot";
//        System.out.println(textBlock + "\n" + "-".repeat(10));
//    }
//
//    @Override
//    protected void runEngine(int distance) {
//        super.runEngine(distance);
//        System.out.println(Math.round(distance / avgKmPerCharge) + "x of Charging");
//    }
//}
//
//class HybridCar extends Car {
//
//    private double avgKmPerLitre;
//    private int batterySize;
//    private int cylinders;
//
//    public HybridCar(String description, int batterySize, int cylinders) {
//        super(description);
//        this.batterySize = batterySize <= 0 ? -1 : batterySize;
//        this.cylinders = cylinders <= 0 ? -1 : cylinders;
//        this.avgKmPerLitre = ((batterySize * 0.15d) + (100.0 / cylinders)) / 2;
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//        System.out.printf("> %s%n".repeat(2),
//                "Light Noise",
//                "the Gas powered engine is on");
//        System.out.println("-".repeat(10));
//    }
//
//    @Override
//    protected void runEngine(int distance) {
//        super.runEngine(distance);
//        System.out.println(Math.round(distance / avgKmPerLitre) + "L of Gas");
//    }
//}