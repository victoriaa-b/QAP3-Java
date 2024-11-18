package Question3;

public class demo {
    public static void main(String[] args) {
        // array to hold all of the shapes
        shape[] shapes = new shape[4];

 
        shapes[0] = new circle(6); 
        shapes[1] = new ellipse(2, 5); 
        shapes[2] = new triangle(2, 6, 8);
        shapes[3] = new equilateralTriangle(12);


        for (shape s : shapes) {
            // display shapes details 
            System.out.println(s);
        }
    }
}
