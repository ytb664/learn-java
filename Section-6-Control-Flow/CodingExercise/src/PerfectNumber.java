public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println(isPerfect(6));
        System.out.println(isPerfect(28));
        System.out.println(isPerfect(5));
        System.out.println(isPerfect(-1));

    }

    public static boolean isPerfect(int number) {

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i != 0) {
                continue;
            }

            sum += i;
        }

        return sum == number && number > 1;
    }
}
