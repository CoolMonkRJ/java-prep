import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private int marks;

    //make constructor
    public Student(int id, String name, int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    //getter methods
    public int getId(){
        return id;
    }
    public String getNAme(){
        return name;
    }
    public int getMarks(){
        return marks;
    }

    //method to print student details
    public void display() {
        System.out.println(
                "ID:" + id +
                        ",Name:" + name +
                        ", Marks :" + marks);
    }
}
