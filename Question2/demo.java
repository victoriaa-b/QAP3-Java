package Question2;

public class demo {
    public static void main(String[] args) {
        moveablePoint moveablePoint = new moveablePoint(1.0f, 2.0f,  0.2f,  0.1f);
        
        // Printing to the console
        System.out.println("Initial: " + moveablePoint + "\n");
        moveablePoint.move(); 
        System.out.println("When move is compeleted: " + moveablePoint + "\n");
    }
}
