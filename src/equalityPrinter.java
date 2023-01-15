public class equalityPrinter {

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(1, -1, 2);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int num1, int num2, int num3) {
        boolean anyLessThanZero = (num1 < 0) || (num2 < 0) || (num3 < 0);
        boolean equals12 = (num1 == num2);
        boolean equals13 = (num1 == num3);
        boolean equals23 = (num2 == num3);

        if(anyLessThanZero) {
            System.out.println("Invalid Value");
        } else if (equals12 && equals13 && equals23) {
            System.out.println("All numbers are equal");
        } else if (!equals12 && !equals13 && !equals23) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
