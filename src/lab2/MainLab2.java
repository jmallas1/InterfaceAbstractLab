package lab2;

import org.jrm.util.Outputter;
import org.jrm.util.PopOutputter;
import org.jrm.util.TermOutputter;

import java.util.ArrayList;
import java.util.List;

public class MainLab2
{
    int outputClassPicker = 0
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
        out.report(aCourse.courseName + " " + aCourse.getCourseNumber() + " " + aCourse.getPrerequisites() + " " + aCourse.getCredits());
        // System.out.println();
    }
}
}
