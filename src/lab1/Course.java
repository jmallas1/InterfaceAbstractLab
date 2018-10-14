package lab1;

public abstract class Course
{
    String courseName;
    String courseNumber;
    Double credits;
    String prerequisites;

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public final String getCourseName() { return courseName; }

    public final void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    public final String getCourseNumber() { return courseNumber; }

    public void setCredits(Double credits) throws IllegalArgumentException
    {
        if(credits > 0.5 && credits <= 4.0)
        {
            this.credits = credits;
        }
        else
        {
            throw new IllegalArgumentException("Course must be worth more than .5 and less than 4.0 credits");
        }
    }
    public final Double getCredits() { return credits; }

    public void setPrerequisites(String prerequisites)
    {
        if(prerequisites != null && prerequisites.length() > 0)
        {
            this.prerequisites = prerequisites;
        }
        else
        {
            throw new IllegalArgumentException("Course must have pre-requisites");
        }
    }
    public final String getPrerequisites() {
        return prerequisites;
    }
}
