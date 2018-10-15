package lab1;

/**
 * Class model for Intro Java course. Inherits MOST methods and properties from superclass "Course"
 * Any class should be able to get and set the following properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 * Methods for setting credits and prerequisites are overridden in Intro Java for "business need"
 *
 * @author      Jared Mallas
 * @version     1.1
 */
public class IntroJavaCourse extends Course {

    public IntroJavaCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
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

    /**
     * Overridden method allows for credits to escape default boundary of .5-4.0 and instead allows for 0-5.0
     * @param credits Double representation of credits
     * @throws IllegalArgumentException When credits are attempted to be set less than 0 or more than 5.0
     */
    @Override
    public void setCredits(Double credits) throws IllegalArgumentException
    {
        if(credits >= 0 && credits <= 4.0)
        {
            this.credits = credits;
        }
        else
        {
            throw new IllegalArgumentException("Course must be worth more than 0 and less than / equal to 4.0 credits");
        }
    }

}
