void main() {
    int n = Integer.parseInt(IO.readln().trim());

    for (int i = 0; i < n; i++) {
        String[] parts = IO.readln().trim().split(" ");
        int width = Integer.parseInt(parts[0]);
        int height = Integer.parseInt(parts[1]);

        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(
            "Area: " + rectangle.area() +
            ", Perimeter: " + rectangle.perimeter() +
            ", Square: " + rectangle.isSquare()
        );
    }
}


class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height) 
    {
        this.width = width;
        this.height = height;
    }

    int area() {
        return width * height;
    }

    int perimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
