import java.util.ArrayList;

public class GradeService {

    private ArrayList<Students> students = new ArrayList<>();

    public void addStudent(Students student){
        students.add(student);
        System.out.println(
                student.getName()
                        + " Added Successfully");
    }

    public String calculateGrade(
            double marks) {

        if (marks >= 90) {
            return "A";
        }

        else if (marks >= 80) {
            return "B";
        }

        else if (marks >= 70) {
            return "C";
        }

        else if (marks >= 60) {
            return "D";
        }

        return "F";
    }

    public void displayReports(){
        System.out.println("\n---------STUDENT REPORT-------");

        for(Students students1 : students){
            System.out.println(
                    "ID :"+students1.getId()+
                            " Name : "+students1.getName() +
                            " Marks :"+students1.getMarks()+
                            " Grade :"+calculateGrade(students1.getMarks())
            );
        }
    }
    public double calculateAverage(){
        double total =0;

        for(Students students1 :students){
            total+=students1.getMarks();
        }
        return total/students.size();
    }

    public Students findTopper(){
        Students topper = students.get(0);

        for(Students students1 : students){
            if(students1.getMarks() >topper.getMarks()){
                topper=students1;
            }
        }
        return topper;
    }
}
