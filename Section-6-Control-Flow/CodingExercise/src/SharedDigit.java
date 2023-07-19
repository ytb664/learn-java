public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(23,12));
        System.out.println(hasSharedDigit(12,15));
        System.out.println(hasSharedDigit(12,43));

    }

    public static boolean hasSharedDigit(int x, int y) {

        if (x < 10 || x > 99 || y < 10 || y > 99) {
            return false;
        }

        int x1 = x % 10;
        int y1 = y % 10;

        x /= 10;
        y /= 10;

        return x == y || x == y1 || x1 == y || x1 == y1;
    }
}
