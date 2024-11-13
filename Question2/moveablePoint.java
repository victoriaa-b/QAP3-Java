package Question2;

public class moveablePoint extends point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // constructors
    public moveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // take parent 
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint(float xSpeed, float ySpeed) {
        super(0.0f, 0.0f); 
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint() {
        super(0.0f, 0.0f);
    }

    // getters and setters
    public float getXSpeed() {
        return xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString to display the x and y coordinates of the point and speed
    @Override
    public String toString() {
        return String.format("%s, Speed: (xSpeed= %.1f, ySpeed= %.1f)", super.toString(), xSpeed, ySpeed);
    }

    // needed in order to update position
    public moveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}

