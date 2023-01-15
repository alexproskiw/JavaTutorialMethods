public class secondsAndMinutes {

    public static void main(String[] args) {
        System.out.println(getDurationString(-1));
        System.out.println(getDurationString(3599));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(3601));
        System.out.println(getDurationString(59,59));
        System.out.println(getDurationString(60,0));
        System.out.println(getDurationString(60,1));
        System.out.println(getDurationString(129,33));
        System.out.println(getDurationString(-1, 12));
        System.out.println(getDurationString(1,-1));
        System.out.println(getDurationString(1,60));
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "This time is invalid";
        }

        int remainingSeconds = seconds % 60;
        int totalMinutes = (seconds - remainingSeconds) / 60;
        int remainingMinutes = totalMinutes % 60;
        int hours = (totalMinutes - remainingMinutes) / 60;
        String time = hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        return time;
    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "This time is invalid";
        }

        int totalSeconds = (minutes * 60) + seconds;
        return getDurationString(totalSeconds);

    }
}
