public class SpeedConverter {

    // 1 mile per hours is 1.609 kilometers per hours
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1L;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + Math.round(kilometersPerHour / 1.609) + " mi/h");
        }
    }
}
