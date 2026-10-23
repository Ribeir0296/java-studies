void main() {
    String[] parts = IO.readln().trim().split(" ");
 
    double width = Double.parseDouble(parts[0]);
    double height = Double.parseDouble(parts[1]);

    double area = width * height;
    double perimeter = 2 * (width + height);

    System.out.printf(java.util.Locale.US, "Area: %.2f%nPerimeter: %.2f%n", area, perimeter);
}
