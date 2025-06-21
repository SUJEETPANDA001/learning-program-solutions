package MVCPatternExample;
/*
 * Name :- Sujeet Panda
 * mail :- sujeetpanda001@gmail.com
 * Superset ID: 6380391
 */
public class MVCTest {
    public static void main(String[] args) {
        Student model = new Student("Alice", "S123", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Bob");
        controller.setStudentGrade("B+");
        controller.updateView();
    }
}