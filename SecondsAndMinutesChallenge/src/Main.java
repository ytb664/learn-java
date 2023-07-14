public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        int hours = minutes / 60;
        minutes %= 60;
        seconds %= 60;

        if (seconds >= 0) {
            return hours + "h " + minutes + "m " + seconds + "s";
        }
        return "seconds must be zero or more";
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;
        minutes %= 60;

        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            return hours + "h " + minutes + "m " + seconds + "s";
        } else if (minutes < 0) {
            return "minutes must be zero or more";
        }
        return "second must be between 0 and 59";
    }
}
