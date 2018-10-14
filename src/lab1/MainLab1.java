package lab1;

import java.util.ArrayList;
import java.util.List;

public class MainLab1
{
    public static void main(String[] args)
    {
        List<Course> courses = new ArrayList();

        try
        {
            courses.add(new IntroToProgrammingCourse("Introduction to programming", "100-025", 5d, ""));
            courses.add(new IntroJavaCourse("Introduction to java", "100-050", 4d, "Introduction to Programming"));
            courses.add(new AdvancedJavaCourse("Advanced java", "100-100", 5d, "Introduction to Java"));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }

        for (Course aCourse : courses)
        {
            System.out.println(aCourse.courseName + " " + aCourse.getCourseNumber() + " " + aCourse.getPrerequisites() + " " + aCourse.getCredits());
        }
    }
}
