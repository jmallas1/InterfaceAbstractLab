package lab2;

import javax.swing.JOptionPane;

/**
 * Class model for Advanced Java course. Implements methods from Course interface
 *
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

    @Override
    public String getCourseName(){ return courseName; }

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

    @Override
    public String getCourseNumber() { return this.courseNumber; }

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

    @Override
    public Double getCredits() {
        return this.credits;
    }

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

    @Override
    public String getPrerequisites() { return this.prerequisites; }
}
