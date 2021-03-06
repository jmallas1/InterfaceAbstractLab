package lab2;

/**
 * Class model for Advanced Java course. Implements methods from Course interface
 * Interface implementation should force getting and setting of the following instance properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 * @author      Jared Mallas
 * @version     1.1
 */
public class AdvancedJavaCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
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
    public void setCourseName(String courseName) throws IllegalArgumentException
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
    public String getCourseName(){ return courseName; }

    /**
     * Forced override of setCourseNumber. Forces non-null value by way of throwing an exception.
     * @param courseNumber String representation of a course number
     * @throws IllegalArgumentException when null or empty string is passed
     */
    @Override
    public void setCourseNumber(String courseNumber) throws IllegalArgumentException
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
    public String getCourseNumber() { return this.courseNumber; }

    /**
     * Forced override for setCredits forcing a range between 0.5 and 4.0
     * @param credits Double representation of credits
     * @throws IllegalArgumentException when credits less than 0.5 or credits greater than 4.0
     */
    @Override
    public void setCredits(Double credits) throws IllegalArgumentException
    {
        if(credits > 0.5 && credits <= 4.0)
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
     * Forced override of setPrerequisites forcing a non-null and non-empty string
     * @param prerequisites String representation of prerequisites.
     * @throws IllegalArgumentException when null or empty string is passed
     */
    @Override
    public void setPrerequisites(String prerequisites) throws IllegalArgumentException
    {
        if(prerequisites != null && prerequisites.length() > 0)
        {
            this.prerequisites = prerequisites;
        }
        else
        {
            throw new IllegalArgumentException("Invalid pre-requisite");
        }
    }

    /**
     * forced override of getPrerequisites
     * @return String representation of prerequisites
     */
    @Override
    public String getPrerequisites() { return this.prerequisites; }
}
