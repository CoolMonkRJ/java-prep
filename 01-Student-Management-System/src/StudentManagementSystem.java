import java.util.ArrayList;
public class StudentManagementSystem {
    public static void main( String[] args){
        ArrayList<Student> students = new ArrayList<>(); // used array list cause size is not fixed

        //add students

        students.add(new Student(101,"Rahul",85));
        students.add(new Student(102,"Rohit",93));
        students.add(new Student(103,"Himanshu",78));
        students.add(new Student(104,"Nirmal",97));

        //print all students

        System.out.println("------ ALL STUDENTS-------");
        for(Student s : students){
            s.display();
        }

        //find studnet by id

        int searchid =102;

        Student foundStudent = null;

        for(Student s : students){
            if(s.getId()== searchid){
                foundStudent = s;
                break;
            }
        }

        System.out.println(("\n ------- FIND BY ID ---------"));
        if(foundStudent != null){
            foundStudent.display();
        }
        else{
            System.out.println("Student Not Found");
        }

        // Find Top Scorer

        Student topScorer = students.getFirst();
        for(Student s : students){
            if(s.getMarks() > topScorer.getMarks()){
                topScorer = s;
            }
        }
        System.out.println("\n ------- Top Scorrer---------");
        topScorer.display();

        // Calculate Average
        int totalMarks =0;

        for(Student s: students){
            totalMarks+=s.getMarks();
        }

        int avg = totalMarks/ students.size();
        System.out.println("\n Average Marks ="+ avg);

        //Count Student Above 90

        int count =0;
        for(Student s: students){
            if(s.getMarks() >90){
                count++;
            }
        }
        System.out.println("Students Above 90="+count);
    }
}
