package Question1;

public class demo {
    public static void main(String[] args) {
        // printing out different objects in the console 

        //person
        person aJ = new person("AJ Jay", 27, "M");
        System.out.println(aJ);

        // student
        student harry = new student("Harry Smith", 5, "M", "ES123", 3.8);
        System.out.println(harry);

        // Teacher
        teacher mrsAnie = new teacher ("Mrs Anie", 25, "F", "Java", 60000);
        System.out.println(mrsAnie);

        // college student
        collegeStudent emily = new collegeStudent("Emily Neil", 23, "F", "UN2025", 4.0, 5, "History");
        System.out.println(emily);
    }
}
