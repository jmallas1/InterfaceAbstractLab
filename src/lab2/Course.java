package lab2;

/**
 * Interface for Course
 * Forces getter and setters for the following properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 * @author Jared Mallas
 * @version 1.0
 */
public interface Course
{
    void setCourseName(String courseName);
    String getCourseName();

    void setCourseNumber(String courseNumber);
    String getCourseNumber();

    void setCredits(Double credits);
    Double getCredits();

    void setPrerequisites(String prerequisites);
    String getPrerequisites();
}
