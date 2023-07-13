public class Main {

    public static void main(String[] args) {

        System.out.println("5ft 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(68) + "cm");
    }

    public static double convertToCentimeters(int inches) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        int feetToInches = feet * 12;
        int totalInches = feetToInches + inches;
        double result = convertToCentimeters(totalInches);

        return result;
    }
}

//1 inch = 2.54 cm
//1 foot = 12 inches