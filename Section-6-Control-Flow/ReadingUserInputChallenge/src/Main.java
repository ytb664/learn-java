import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double sum = 0;

        do {
            try {
                System.out.println("Enter number #" + count + ":");
//                sum += Integer.parseInt(scanner.nextLine());
                sum += Double.parseDouble(scanner.nextLine());
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        } while (count <= 5);

        System.out.println("The sum of the 5 numbers = " + sum);
    }
}
