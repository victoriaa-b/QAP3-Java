package Question1;

public class student extends person {
    protected String myIdNum;
    protected double myGPA;

    // Constructor
    public student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender);
        myIdNum = idNum;
        myGPA = gpa;
    }

    // getters and setters 
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA(){
        return myGPA;
    }

    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString display
    // need to show ID num and student gpa 
     public String toString() {
        return super.toString() + "\nID Number: " + myIdNum + "\nGPA: " + myGPA;
    }

}
