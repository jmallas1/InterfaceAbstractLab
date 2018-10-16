package org.jrm.test.lab2;

import lab2.IntroJavaCourse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroJavaCourseTest {

    IntroJavaCourse ijc2;

    @BeforeEach
    void setUp() {
        ijc2 = new IntroJavaCourse("Introduction to Java", "100-049", 4d, "Introduction to Programming");
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void setCourseName()
    {
        ijc2.setCourseName("Underwater Basket Weaving");
        assertEquals("Underwater Basket Weaving", ijc2.getCourseName(), "Changed name");
    }

    @Test
    void getCourseName()
    {
        assertEquals("Introduction to Java", ijc2.getCourseName(), "Unchanged name");
    }

    @Test
    void setCourseNumber()
    {
        ijc2.setCourseNumber("123-456-789");
        assertEquals("123-456-789", ijc2.getCourseNumber(), "Changed course number");
        assertThrows(IllegalArgumentException.class, () -> ijc2.setCourseName(null), "Throws exception on null");
    }

    @Test
    void getCourseNumber()
    {
        assertEquals("100-049", ijc2.getCourseNumber(), "Unchanged course number");
    }

    @Test
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ijc2.setCredits(6d), "Credits cannot exceed 4");
        assertThrows(IllegalArgumentException.class, () -> ijc2.setCredits(-1d), "Credits cannot be less than 0");
        Double x = 2d;
        ijc2.setCredits(x);
        assertEquals(x, ijc2.getCredits(), "Changed credits");
    }

    @Test
    void getCredits()
    {
        Double x = 4d;
        assertEquals(x, ijc2.getCredits(), "Credits are unchanged");
    }

    @Test
    void setPrerequisites()
    {
        assertThrows(IllegalArgumentException.class, () -> ijc2.setPrerequisites(null), "Throws exception on null");
        assertThrows(IllegalArgumentException.class, () -> ijc2.setPrerequisites(""), "Throws exception on empty string");
        ijc2.setPrerequisites("MUCH PROGRAMMING WIN");
        assertEquals("MUCH PROGRAMMING WIN", ijc2.getPrerequisites(), "Prerequisites changed");
    }

    @Test
    void getPrerequisites()
    {
        assertEquals("Introduction to Programming", ijc2.getPrerequisites(), "Unchanged prerequisites");
    }
}