package lab1;

/**
 * Abstract class model for a generic course.
 * @author Jared Mallas
 * @version 1.0
 */
public abstract class Course
{
    String courseName;
    String courseNumber;
    Double credits;
    String prerequisites;

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
     * Method for retrieving course name
     * @return String representation for courseName
     */
    public final String getCourseName(){ return courseName; }

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
     * Method for retrieving course number
     * @return String representation of course number
     */
    public final String getCourseNumber() { return courseNumber; }

    /**
     * Method for setting credits for a particular course. Assumption has been made that, generally speaking
     * any given course will be a minimum of .5 credits and a maximum of 4 and thus a default method is provided.
     * Exceptions are possible and can be overridden
     * @param credits Double representation of credits
     * @throws IllegalArgumentException When credits are not within range of .5-4.0
     */
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
    public final Double getCredits() { return credits; }

    /**
     * Method for setting prerequisites for a particular course. Assumption has been made that, generally speaking
     * any give course will have some prerequisite and thus a default method is provided.
     * Exceptions are possible and thus, this method can be overridden.
     * @param prerequisites String representation of prerequisites.
     */
    public void setPrerequisites(String prerequisites)
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
    public final String getPrerequisites() {
        return prerequisites;
    }
}
