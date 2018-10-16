package lab1;

import org.jrm.util.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate working with abstract classes
 * While abstract classes can seem like a good idea at the time, I feel that they are really
 * only useful when you know your code isn't ever going to change. Implementing class inheritance
 * feels like you're signing a never ending contract with all of the classes that inherit
 * from your base class. If you do have to make a change in the future, you not only need to
 * worry about the impacts to your own code, but every other class that extended your code. This
 * seems like an anti-pattern to me and as I don't like the idea of massive regression testing,
 * I rarely use class inheritance.
 *
 * @author Jared Mallas
 * @version 1.0
 */
public class MainLab1
{
    public static void main(String[] args)
    {
        int outputClassPicker = 1;
        Outputter out;

        List<Course> courses = new ArrayList();

        if (outputClassPicker == 1)
        {
            out = new TermOutputter();
        }
        else
        {
            out = new PopOutputter();
        }

        try
        {
            courses.add(new IntroToProgrammingCourse("Introduction to programming", "100-025", 5d, ""));
            courses.add(new IntroJavaCourse("Introduction to java", "100-050", 4d, "Introduction to Programming"));
            courses.add(new AdvancedJavaCourse("Advanced java", "100-100", 4d, "Introduction to Java"));
        }
        catch (IllegalArgumentException ex)
        {
            out.report(ex.getMessage());
        }

        for (Course aCourse : courses)
        {
            out.report(aCourse.getCourseName() + " " + aCourse.getCourseNumber() + " " + aCourse.getPrerequisites() + " " + aCourse.getCredits());
            // System.out.println();
        }
    }
}
