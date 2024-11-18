package Question3;

public class ellipse extends shape {
    protected double a;
    protected double b;

    // Constructor
    public ellipse(double a, double b) {
        super("Ellipse");
        this.a = Math.max(a, b);
        this.b = Math.min(a, b);
    }

    // getters for area 
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // perimeter for ellipse
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }

    // scale the ellipse
    @Override
    public void scale(double factor) {
        this.a *= factor;
        this.b *= factor;
    }
}