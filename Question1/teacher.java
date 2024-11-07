package Question1;

public class teacher extends person {
    private String subject; // Example "Python"
    private double salary;

    // Constructor 
    public teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // getters and setters
    public String getSubject() {
        return subject;
    }

    public double getSalary(){
        return salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // toString method to display
    // it needs to show the name of the teacher, their subject, and their current salary
    public String toString() {
    String formatSalary = String.format("$%.2f", salary);
        return super.toString() + "\nSubject: " + subject + "\nSalary: " + formatSalary;
    }

}
