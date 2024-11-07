package Question1;

public class person {
    protected String myName;
    protected int myAge;
    protected String myGender;  // it can be male or female 

    // Constructor 
    public person(String name, int age, String gender) {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    // getters and setters 
    public String getName() {
        return myName;
    }

    public int getAge(){
        return myAge;
    }

    public String getGender(){
        return myGender;
    }

    public void setName(String name){
        myName = name;
    }

    public void setAge(int age){
        myAge = age;
    }

    // toString method displays 
    // need to show the name, age and gender 
    public String toString(){
        return "\n" + "Name:" + myName + "\nAge" + myAge + "\nGender: " + myGender;
    }
    
}
