package problem6;

public class Circle implements Forme {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSurface() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Circle{radius=" + this.radius + "}";
    }
}
