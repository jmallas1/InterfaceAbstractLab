package lab1;

/**
 * Class model for intro to programing course. Inherits MOST methods and properties from superclass "Course"
 * Any class should be able to get and set the following properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 * Methods for setting credits and prerequisites are overridable for varying "business need"
 *
 * @author      Jared Mallas
 * @version     1.1
 */
public class IntroToProgrammingCourse extends Course
{

    public IntroToProgrammingCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    @Override
    public void setCredits(Double credits)
    {
        if(credits >= 0.5 || credits <= 4.0)
        {
            this.credits = credits;
        }
        else
        {
            throw new IllegalArgumentException("Invalid credit definition");
        }
    }

    /**
     * Overridden method allows prerequisites to be null or an empty string.
     * If "null" is passed, prerequisites will be set to ""
     * @param prerequisites String representation of prerequisites.
     */
    @Override
    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null)
        {
            this.prerequisites = "";
        }
        else
        {
            this.prerequisites = prerequisites;
        }
    }
}
