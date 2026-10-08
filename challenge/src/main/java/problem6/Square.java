package problem6;

public class Square implements Forme {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSurface() {
        return this.side * this.side;
    }

    public String toString() {
        return "Square{side=" + this.side + "}";
    }
}
