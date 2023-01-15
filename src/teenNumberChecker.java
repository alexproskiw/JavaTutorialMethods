public class teenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        // produce true if one of the numbers is between 13 and 19

        boolean isNum1Teen = (num1 >= 13) && (num1 <= 19);
        boolean isNum2Teen = (num2 >= 13) && (num2 <= 19);
        boolean isNum3Teen = (num3 >= 13) && (num3 <= 19);
        boolean atLeastOneTeen = isNum1Teen || isNum2Teen || isNum3Teen;
        return atLeastOneTeen;
    }
}
