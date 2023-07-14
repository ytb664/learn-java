public class Example {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int restOfMin = minutes % 60;
        int restOfSec = seconds % 60;

        return hours + "h " + restOfMin + "m " + restOfSec + "s ";
    }
}
