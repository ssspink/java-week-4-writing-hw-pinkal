package programme_26_encapsulation;

public class Encapsulate
{


    //private variables declare these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;
    //set method for name to access private variable name
    public void SetName(String name){
        this.name =name;


    }

    // get method for name to access private variables age
    public String getName(){
        return name;
    }
    //   // get method for roll to access private variable rollNo
    public int getRollNo() {
        return rollNo;
    }

    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variable age
    public void setAge(int age) {
        this.age = age;
    }



}