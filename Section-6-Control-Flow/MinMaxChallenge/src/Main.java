import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double min = 0;
        double max = 0;
        int count = 0;
        boolean isNumber = true;

        do {
            try {
                System.out.println("Enter a number, or any character to exit:");
                double number = Double.parseDouble(scanner.nextLine());

                if (count == 0 || number < min) {
                    min = number;
                } else if (count == 0 || number > max) {
                    max = number;
                }

                count++;
            } catch (NumberFormatException e) {
                isNumber = false;
            }

        } while (isNumber);

        if (count > 0) {
            System.out.println("Min = " + min + " and Max = " + max);
        } else {
            System.out.println("No Valid Data Entered");
        }
    }
}
