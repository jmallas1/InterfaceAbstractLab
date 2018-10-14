package lab1;

/**
 * Describe responsibilities here.
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

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    /* public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    } */

    /* public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }
    */
}
