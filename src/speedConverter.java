public class speedConverter {

    public static void main(String[] args) {
        kilometersToMilesPerHour(1.5);
        kilometersToMilesPerHour(10.25);
        kilometersToMilesPerHour(-5.6);
        kilometersToMilesPerHour(25.42);
        kilometersToMilesPerHour(75.114);
    }

    public static void kilometersToMilesPerHour(double kph) {
        double mphToKphConversion = 1.609;
        long mph = Math.round(kph / mphToKphConversion);

        if (mph < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kph + " km/h = " + mph + " mi/h");
        }
    }
}