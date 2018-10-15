package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements Course {
    private String courseName;
    private String courseNumber;
    private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    @Override
    public void setCourseName(String courseName) {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public void setCourseNumber(String courseNumber) {

    }

    @Override
    public String getCourseNumber() {
        return null;
    }

    @Override
    public void setCredits(Double credits) {

    }

    @Override
    public Double getCredits() {
        return null;
    }

    @Override
    public void setPrerequisites(String prerequisites) {

    }

    @Override
    public String getPrerequisites() {
        return null;
    }
}
