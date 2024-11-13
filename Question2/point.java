package Question2;

public class point {
    private float x = 0.0f;
    private float y = 0.0f;

    // construtors
    public point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public point(){

    }
    
    // getters and setters 

    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public float[] getXY() {  // want to get x and y since coordiates
        return new float[] { x, y };
    }
    
    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y =y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

        // toString display x and r coordinates of the point
         @Override
    public String toString() {
        return String.format("Point: (x= %.1f, y= %.1f)", x, y);
    }
}
