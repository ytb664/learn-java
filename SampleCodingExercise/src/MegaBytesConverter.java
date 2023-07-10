public class MegaBytesConverter {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(-134);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        int megabytes = kilobytes / 1024;
        int theRest = kilobytes % 1024;

        if (kilobytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilobytes + " KB = " + megabytes
                + " MB and " + theRest + " KB");
        }
    }
}
