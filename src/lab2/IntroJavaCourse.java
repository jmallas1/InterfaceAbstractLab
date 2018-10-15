package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements Course {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
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

    @Override
    public final String getCourseName(){ return courseName; }

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

    @Override
    public final String getCourseNumber() { return courseNumber; }

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

    @Override
    public final Double getCredits() { return credits; }

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

    @Override
    public final String getPrerequisites() {
        return prerequisites;
    }
}
