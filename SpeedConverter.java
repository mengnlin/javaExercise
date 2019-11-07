public class SpeedConverter {
    public static void main(String[] arg) {
        printConversion(10.25);
    }

    public static long toMilesPerHours(double kilometerPerHour) {
        long miles = -1;
        double converter = 1.609d;
        if (kilometerPerHour > 0) {
            miles = Math.round(kilometerPerHour / converter);
        }
        return miles;
    }

    public static void printConversion(double kilometerPerHour) {
        long miles = toMilesPerHours(kilometerPerHour);
        System.out.println(kilometerPerHour + " km/h=" + miles + " miles/h");
    }
}