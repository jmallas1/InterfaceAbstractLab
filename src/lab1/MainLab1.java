package lab1;

import java.util.ArrayList;
import java.util.List;

public class MainLab1
{
    public static void main(String[] args)
    {
        List<Course> courses = new ArrayList();

        courses.add(new IntroToProgrammingCourse("Introduction to programming", "100-025", 4d, "" ));
        courses.add(new IntroJavaCourse("Introduction to java", "100-050", 5d, "Introduction to Programming"));
        courses.add(new AdvancedJavaCourse("Advanced java", "100-100", 5d, "Introduction to Java"));

        for (Course aCourse : courses)
        {
            System.out.println(aCourse.courseName + " " + aCourse.getCourseNumber() + " " + aCourse.getPrerequisites() + " " + aCourse.getCredits());
        }
    }
}
