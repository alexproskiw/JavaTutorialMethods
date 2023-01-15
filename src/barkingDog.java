public class barkingDog {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true,8));
        System.out.println(shouldWakeUp(true,-1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        // return true if the dog is barking and it's before 8 or after 22 hours

        boolean wakeUp = false;
        boolean wakeUpTime = ((0 <= hourOfDay) && (hourOfDay < 8)) || (hourOfDay == 23);

        if (barking && wakeUpTime) {
            wakeUp = true;
        }

        return wakeUp;
    }
}
