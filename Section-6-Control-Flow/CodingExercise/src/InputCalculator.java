import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

        public static void inputThenPrintSumAndAverage() {

            Scanner scanner = new Scanner(System.in);

            int count = 0;
            int sum = 0;
            long average = 0;

            while(true) {
                try {
                    sum += Integer.parseInt(scanner.nextLine());
                    count++;
                } catch (NumberFormatException e) {
                    break;
                }
            }

            average = Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + average);
        }
}
