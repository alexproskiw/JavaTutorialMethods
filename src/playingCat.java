public class playingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 24));
        System.out.println(isCatPlaying(false, 25));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 45));
        System.out.println(isCatPlaying(false, 46));
        System.out.println(isCatPlaying(true, 24));
        System.out.println(isCatPlaying(true, 25));
        System.out.println( isCatPlaying(true, 35));
        System.out.println(isCatPlaying(true, 36));
        System.out.println(isCatPlaying(true, 45));
        System.out.println(isCatPlaying(true, 46));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        // cats play if the temperature is between 25 and 35
        // or between 25 and 45 in the summer

        boolean isPlaying = false;

        if (!summer && (temperature >= 25) && (temperature <= 35)) {
            isPlaying = true;
        }

        if (summer && (temperature >= 25) && (temperature <= 45)) {
            isPlaying = true;
        }

        return isPlaying;
    }
}
