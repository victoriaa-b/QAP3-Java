package Question3;

import Question4.scalable; // need to bring in the scalablity
public abstract class shape implements scalable {
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
