package lab1;

/**
 * Class model for Advanced Java course. Inherits all methods and properties from superclass "Course"
 * Any class should be able to get and set the following properties:
 *     String courseName;
 *     String courseNumber;
 *     Double credits;
 *     String prerequisites;
 * Methods for setting credits and prerequisites are overridable for varying "business need"
 *
 * @author      Jared Mallas
 * @version     1.1
 */
public class AdvancedJavaCourse extends Course {
    // String courseName;  INHERITED FROM SUPERCLASS
    // private String courseNumber;  INHERITED FROM SUPERCLASS
    // private double credits;  INHERITED FROM SUPERCLASS
    // private String prerequisites; INHERITED FROM SUPERCLASS

    public AdvancedJavaCourse(String courseName, String courseNumber, Double credits, String prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }
}
