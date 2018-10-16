package org.jrm.test.lab2;

import lab2.IntroToProgrammingCourse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroToProgrammingCourseTest {

    IntroToProgrammingCourse ipc2;

    @BeforeEach
    void setUp() {
        ipc2 = new IntroToProgrammingCourse("Introduction to Programming", "100-024", 3d,null);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setCourseName()
    {
        ipc2.setCourseName("Underwater basket weaving");
        assertEquals("Underwater basket weaving", ipc2.getCourseName(), "Changed course name");
    }

    @Test
    void getCourseName()
    {
        assertEquals("Introduction to Programming", ipc2.getCourseName(), "Unchanged course name");
    }

    @Test
    void setCourseNumber()
    {
        ipc2.setCourseNumber("123-456-789");
        assertEquals("123-456-789", ipc2.getCourseNumber(), "Changed course number");
    }

    @Test
    void getCourseNumber()
    {
        assertEquals("100-024", ipc2.getCourseNumber(), "Unchanged course number");
    }

    @Test
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ipc2.setCredits(6d), "Credits should not exceed 5");
        assertThrows(IllegalArgumentException.class, () -> ipc2.setCredits(.25d), "Credits should not be less than .5");
        Double x = 3d;
        ipc2.setCredits(x);
        assertEquals(x, ipc2.getCredits(), "Changed credits");
    }

    @Test
    void getCredits()
    {
        Double x = 3d;
        assertEquals(x, ipc2.getCredits(), "Unchanged credits");
    }

    @Test
    void setPrerequisites()
    {
        ipc2.setPrerequisites("");
        assertEquals("", ipc2.getPrerequisites(), "Empty string yields empty string");
        ipc2.setPrerequisites(null);
        assertEquals("", ipc2.getPrerequisites(), "Empty string yields empty string");
        ipc2.setPrerequisites("GED");
        assertEquals("GED", ipc2.getPrerequisites(), "Changed prerequisites");
    }

    @Test
    void getPrerequisites()
    {
        assertEquals("", ipc2.getPrerequisites(), "Unchanged prerequisites");
    }
}