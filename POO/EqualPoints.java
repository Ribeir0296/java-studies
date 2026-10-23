class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return x == other.x && y == other.y;
    }

    @Override
    public int hashCode() {
        return 31 * x + y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

void main() {
    int n = Integer.parseInt(IO.readln().trim());
    List<Point> points = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        String[] p = IO.readln().trim().split(" ");
        points.add(new Point(Integer.parseInt(p[0]), Integer.parseInt(p[1])));
    }
    Set<Point> unique = new HashSet<>(points);
    Map<Point, Integer> counts = new LinkedHashMap<>();
    for (Point p : points) {
        counts.merge(p, 1, Integer::sum);
    }
    Point most = points.get(0);
    for (Point p : counts.keySet()) {
        if (counts.get(p) > counts.get(most)) most = p;
    }
    IO.println("Points read: " + n);
    IO.println("Unique points: " + unique.size());
    IO.println("Most repeated: " + most + " x" + counts.get(most));
    IO.println("Contains (0, 0): " + unique.contains(new Point(0, 0)));
}
