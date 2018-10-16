package lab2;

import org.jrm.util.Outputter;
import org.jrm.util.PopOutputter;
import org.jrm.util.TermOutputter;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to demonstrate working with interface inheritance
 * I prefer working with interfaces over abstract classes (or inheritance from concrete classes
 * for that matter). When I first learned about polymorphism, it was easiest for me to think of java
 * references as pointers. (My first low-level language was C) A polymorphic object allowed me to "handle"
 * it differently depending on context. This applies to interface as well as class inheritance. I find that
 * the primary difference between implementing an interface and extending a class is that the author of the
 * new object gets to decide *how* the inheritance is handled whereas with class inheritance puts that power
 * in the hands of the author of the "extended" class. Most of my experience with inheritance was producing
 * other java dependencies where I didn't know how exactly they'd be used, so I didn't want to have too
 * much of an opinion as to how. I believe interfaces grants the implementor more options which
 * is generally a "good thing."
 *
 * @author Jared Mallas
 * @version 1.0
 */public class MainLab2
{
    public static void main (String [] args)
    {
        int outputClassPicker = 1;
        Outputter out;

        List<Course> courses = new ArrayList<>();

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
