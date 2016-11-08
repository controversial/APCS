public class Line {
    double a, b, c;
    public Line(double a, double b, double c) {
        this.a = a; this.b = b; this.c = c;
    }

    public double getSlope() {
        return -1 * a / b;
    }

    public boolean isOnLine(double x, double y) {
        return a * x + b * y + c == 0;
    }

    public boolean isParallel(Line other) {
        return other.getSlope() == this.getSlope();
    }
}