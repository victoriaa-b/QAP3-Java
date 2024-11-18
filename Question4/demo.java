
package Question4;

import Question3.circle;
import Question3.ellipse;
import Question3.equilateralTriangle;
import Question3.shape;
import Question3.triangle;

public class demo {
    // Static method to scale all shapes in the array
    public static void scaleAll(scalable[] scalables, double factor) {
        for (scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }

    public static void main(String[] args) {
        // an array to hold the shapes
        shape[] shapes = new shape[4];
        shapes[0] = new circle(6); 
        shapes[1] = new ellipse(2, 5); 
        shapes[2] = new triangle(2, 6, 8);
        shapes[3] = new equilateralTriangle(12);

        // display the shapes before we use the scales 
        System.out.println("Before scaling:");
        for (shape s : shapes) {
            System.out.println(s);
        }

        // want to scale all of the shapes by 2
        scalable[] scalableShapes = new scalable[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scalableShapes[i] = (scalable) shapes[i];
        }
        scaleAll(scalableShapes, 2);

        // display the shapes details after scaling
        System.out.println("\nAfter scaling:");
        for (shape s : shapes) {
            System.out.println(s);
        }
    }
}
