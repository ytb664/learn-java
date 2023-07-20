public class FactorPrinter {

    public static void main(String[] args) {

        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println("");
    }
}
