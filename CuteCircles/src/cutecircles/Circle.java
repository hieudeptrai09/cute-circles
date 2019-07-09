package cutecircles;

public class Circle implements Comparable<Circle> {

    private final int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * 3.14 * radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public int compareTo(Circle o) {
        if (this.radius < o.radius) {
            return -1;
        } else if (this.radius > o.radius) {
            return 1;
        } else {
            return 0;
        }
    }
}
