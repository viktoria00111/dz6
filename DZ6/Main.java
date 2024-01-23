package DZ6;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        StudentGroure groure1 = new StudentGroure("Группа 1");
        StudentGroure groure2 = new StudentGroure("Группа 2");
        StudentGroure groure3 = new StudentGroure("Группа 3");

        Course course1 = new Course();
        course1.addGroupe(groure1);
        course1.addGroupe(groure2);

        Course course2 = new Course();
        course2.addGroupe(groure3);

        CourseServis courseServis = new CourseServis();
        Controller controller = new Controller(courseServis);

        List<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);
        controller.sortCourses(courses);

        int count = 1;
        for (Course course : courses){
            System.out.println("Поток " + count);
            count++;
            for (StudentGroure groure : course){
                System.out.println(" - " + groure.getName());
            }
        }
    }
}