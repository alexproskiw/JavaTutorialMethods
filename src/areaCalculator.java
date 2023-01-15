public class areaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(10));
        System.out.println(area(-5));
        System.out.println(area(2,3));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1, 10));
        System.out.println(area(10, -1));
        System.out.println(area(-1, -1));

    }

    public static double area(double radius) {
        // area of a circle

        if (radius < 0) {
            return -1;
        }

        return (Math.PI * radius * radius);
    }

    public static double area(double x, double y) {
        // area of a rectangle

        if (x < 0 || y < 0) {
            return -1;
        }

        return (x * y);
    }
}
