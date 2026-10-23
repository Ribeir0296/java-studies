abstract class Shape {
    abstract String name();

    abstract double area();
}

// Example: a complete shape.
class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    String name() {
        return "Circle";
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// TODO: create class Square extends Shape (one side) and class Triangle extends Shape (base and height)

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    double total = 0;
    for (int i = 0; i < n; i++) {
        String[] parts = IO.readln().trim().split(" "); // e.g. ["circle", "2"] or ["triangle", "4", "5"]
        String type = parts[0];
        Shape shape = null;
        if (type.equals("circle")) {
            shape = new Circle(Double.parseDouble(parts[1]));
        }
        // TODO: create a Square for "square" and a Triangle for "triangle"

        // TODO: print the shape as  Name: area  (2 decimals) and add its area to total
    }
    // TODO: print  Total area: <total>  (2 decimals)
}
