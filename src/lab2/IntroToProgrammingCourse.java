package lab2;

/**
 * Class model for intro to programming course. Implements methods from Course interface
 * Implementation forces getters and setters of the following instance properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 *
 * @author      Jared Mallas
 * @version     1.1
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroToProgrammingCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    /**
     * Setter for courseName which doesn't allow null or empty string
     * @param courseName Name of course
     * @throws IllegalArgumentException when null or empty string is attempted
     */
    @Override
    public final void setCourseName(String courseName) throws IllegalArgumentException
    {
        if(courseName != null && !courseName.equals(""))
        {
            this.courseName = courseName;
        }
        else
        {
            throw new IllegalArgumentException("Invalid course name");
        }
    }

    /**
     * Forced override for getCourseName
     * @return String representation of courseName
     */
    @Override
    public final String getCourseName(){ return courseName; }

    /**
     * Forced override of setCourseNumber. Forces non-null value by way of throwing an exception.
     * @param courseNumber String representation of a course number
     * @throws IllegalArgumentException when null or empty string is passed
     */
    @Override
    public final void setCourseNumber(String courseNumber) throws IllegalArgumentException
    {
        if (courseNumber != null && !courseNumber.equals(""))
        {
            this.courseNumber = courseNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid course number");
        }
    }

    /**
     * Forced override of getCourseNumber
     * @return String representation of courseNumber
     */
    @Override
    public String getCourseNumber() {
        return this.courseNumber;
    }

    /**
     * Forced override for setCredits forcing a range between .5 and 5.0
     * @param credits Double representation of credits
     * @throws IllegalArgumentException when credits less than 0.5 or credits greater than 5.0
     */
    @Override
    public void setCredits(Double credits) throws IllegalArgumentException
    {
        if(credits >= 0.5 && credits <= 5.0)
        {
            this.credits = credits;
        }
        else
        {
            throw new IllegalArgumentException("Invalid credit definition");
        }
    }

    /**
     * Forced override of getCredits
     * @return Double representation of credits
     */
    @Override
    public Double getCredits() {
        return this.credits;
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
     * forced override of getPrerequisites
     * @return String representation of prerequisites
     */
    @Override
    public String getPrerequisites() {
        return this.prerequisites;
    }
}
