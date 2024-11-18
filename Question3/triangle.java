package Question3;


public class triangle extends shape {
    protected double side1;
    protected double side2;
    protected double side3;

    // Constructor
    // sides need to all be vaild 
    public triangle(double side1, double side2, double side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // getters for area of the triangle
    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // getter for perimeter of the triangel 
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}