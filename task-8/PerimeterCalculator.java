public class PerimeterCalculator {

    // Method to calculate the perimeter of a square
    public double calculatePerimeterSquare(double side) {
        return 4 * side;
    }

    // Method to calculate the perimeter of a rectangle
    public double calculatePerimeterRectangle(double length, double breadth) {
        return 2 * (length + breadth);
    }

    // Method to calculate the perimeter of a circle
    public double calculatePerimeterCircle(double radius) {
        return 2 * (22.0 / 7) * radius;
    }

    public static void main(String[] args) {
        PerimeterCalculator perimeter = new PerimeterCalculator();

        // Example for square
        double squareSide = 5.0;
        System.out.println("Perimeter of square: " + perimeter.calculatePerimeterSquare(squareSide));

        // Example for rectangle
        double length = 10.0;
        double breadth = 6.0;
        System.out.println("Perimeter of rectangle: " + perimeter.calculatePerimeterRectangle(length, breadth));

        // Example for circle
        double radius = 7.0;
        System.out.println("Perimeter of circle: " + perimeter.calculatePerimeterCircle(radius));
    }
}
