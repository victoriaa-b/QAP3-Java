package Question1;

public class collegeStudent extends student {
    private String major;
    private int year;

    // Constructor
    public collegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.year = year;
        this.major = major;

    }

    // getters and setters
    public String getMajor(){
        return major;
    }
    public int getYear(){
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public void setYear(int year) {
        this.year = year;
    }

    // toString method display
    // display name of the college student, their year and their major
    public String toString() {
        return super.toString() + "\nYear: " + year + "\nMajor: " + major;
    }
}

