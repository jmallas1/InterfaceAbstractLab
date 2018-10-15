package org.jrm.test.lab1;

import lab1.AdvancedJavaCourse;
import lab1.Course;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course someCourse;

    @BeforeEach
    void setUp()
    {
        someCourse = new AdvancedJavaCourse("Advanced Java", "100-100", 4d, "Introduction to Programming");
        someCourse.setCredits(4d); // Assume "happy path" in setUp & overridden method..
        someCourse.setPrerequisites("Much java wins"); // Assume "happy path" in setUp & overridden method...
    }

    @Test
    void setCourseName() {
        someCourse.setCourseName("Underwater basket weaving");
        assertEquals("Underwater basket weaving", someCourse.getCourseName(), "New name");
        assertThrows(IllegalArgumentException.class, () -> someCourse = new AdvancedJavaCourse(null, "100-200", 4d, "Introduction to Programming"), "Courses must have a non-null name");
    }

    @Test
    void getCourseName()
    {
        assertEquals("Advanced Java", someCourse.getCourseName(), "Actual name");
    }

    @Test
    void setCourseNumber()
    {
        someCourse.setCourseNumber("123-456");
        assertEquals("123-456", someCourse.getCourseNumber(), "New number");
        assertThrows(IllegalArgumentException.class, () -> someCourse = new AdvancedJavaCourse("Advanced Java", "", 4d, "Introduction to Programming"), "Courses must have a non-null number");
    }

    @Test
    void getCourseNumber()
    {
        assertEquals("100-100", someCourse.getCourseNumber(), "Actual number");
    }

    @Test
    void getCredits() {
        Double x = 4d;
        assertEquals(x, someCourse.getCredits(), "Should be a 4 credit course");
    }

    @Test
    void getPrerequisites() {
        assertEquals("Much java wins", someCourse.getPrerequisites(), "Prereqs work");
    }
}