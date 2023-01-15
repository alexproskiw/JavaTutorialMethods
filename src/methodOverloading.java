public class methodOverloading {

    public static void main(String[] args) {

        System.out.println("70 inches = " + convertToCentimeters(70) + " cm");
        System.out.println("72 inches = " + convertToCentimeters(72) + " cm");
        System.out.println("74 inches = " + convertToCentimeters(74) + " cm");
        System.out.println("5ft, 10 inches = " + convertToCentimeters(5,10) + " cm");
        System.out.println("6ft, 0 inches = " + convertToCentimeters(6,0) + " cm");
        System.out.println("6ft, 2 inches = " + convertToCentimeters(6,2) + " cm");
    }

    public static double convertToCentimeters(int heightInches) {

        double heightCentimeters = heightInches * 2.54;
        return heightCentimeters;
    }

    public static double convertToCentimeters(int heightFeet, int heightRemainingInches) {

        int heightInches = (heightFeet * 12) + heightRemainingInches;
        double heightCentimeters = convertToCentimeters(heightInches);
        return heightCentimeters;
    }
}
