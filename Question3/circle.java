package Question3;

public class circle extends shape {
    private double radius;

      // construtor
    public circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // display perimeter from ellispe
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // display the area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
