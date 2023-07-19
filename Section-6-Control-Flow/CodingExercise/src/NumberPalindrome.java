public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(1121));
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome(int number) {

        int num = number;
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;

            if (reverse == 0) {
                reverse += lastDigit;
            } else {
                reverse *= 10;
                reverse += lastDigit;
            }

            number /= 10;
        }

        return reverse == num;
    }
}