public class GradeCalculator {

    public static void main(String[] args) {

        GradeService service =
                new GradeService();



        service.addStudent(
                new Students(
                        101,
                        "Rahul",
                        95));



        service.addStudent(
                new Students(
                        102,
                        "Priya",
                        88));



        service.addStudent(
                new Students(
                        103,
                        "Aman",
                        72));



        service.addStudent(
                new Students(
                        104,
                        "Neha",
                        61));



        service.displayReports();



        System.out.println(
                "\nAverage Marks: "
                        + service.calculateAverage());



        Students topper =
                service.findTopper();

        System.out.println(
                "\n----- TOPPER -----");

        topper.display();
    }
}