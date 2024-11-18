package Question3;

abstract class shape {
    protected String name;

      // construtor
    public shape(String name) {
        this.name = name;
    }

    // getter and setter

    public abstract double getPerimeter();
    public abstract double getArea();

    // display
     public String toString() {
        return String.format("Shape: %s, Perimeter: %.2f, Area: %.2f" , name, getPerimeter(), getArea());
    }
    
}
