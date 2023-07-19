public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }

        int digit = number % 10;
        int sum = digit;

        for (int i = number; i > 0; i /= 10) {
            if (i / 10 != 0) {
                continue;
            }

            digit = i % 10;
            sum += digit;
        }

        return sum;
    }
}
