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

class Square extends Shape {
    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    String name() {
        return "Square";
    }

    @Override
    double area() {
        return side * side;
    }
}

class Triangle extends Shape {
    private final double base;
    private final double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    String name() {
        return "Triangle";
    }

    @Override
    double area() {
        return base * height / 2;
    }
}

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    double total = 0;
    for (int i = 0; i < n; i++) {
        String[] parts = IO.readln().trim().split(" "); // e.g. ["circle", "2"] or ["triangle", "4", "5"]
        String type = parts[0];
        Shape shape = null;
        if (type.equals("circle")) {
            shape = new Circle(Double.parseDouble(parts[1]));
        } else if (type.equals("square")) {
            shape = new Square(Double.parseDouble(parts[1]));
        } else if (type.equals("triangle")) {
            shape = new Triangle(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
        }

        IO.println(shape.name() + ": " + String.format(Locale.US, "%.2f", shape.area()));
        total += shape.area();
    }
    IO.println("Total area: " + String.format(Locale.US, "%.2f", total));
}
