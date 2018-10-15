package lab2;

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
