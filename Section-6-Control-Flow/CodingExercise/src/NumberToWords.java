public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        System.out.println("");

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
    }

    public static void numberToWords(int number) {

        if (number == 0) {
            System.out.println("Zero ");
        }
        if (number < 0) {
            System.out.print("Invalid Value");
        }

        int reversed = reverse(number);
        int revCount = getDigitCount(reversed);
        int oriCount = getDigitCount(number);

        while (reversed != 0) {
            int digit = reversed % 10;

            switch (digit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }

            reversed /= 10;
        }

        for (int i = revCount; i < oriCount; i++) {
            System.out.print("Zero ");
        }

        System.out.println("");
    }

    public static int reverse(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;

            number /= 10;
        }

        return reversed;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;

        do {
            count++;
            number /= 10;
        } while (number != 0);

        return count;
    }
}
