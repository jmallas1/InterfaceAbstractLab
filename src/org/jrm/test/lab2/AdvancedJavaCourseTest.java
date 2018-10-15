package org.jrm.test.lab2;

import lab2.AdvancedJavaCourse;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedJavaCourseTest
{
    AdvancedJavaCourse ajc2;

    @BeforeEach
    void setUp() {
        ajc2 = new AdvancedJavaCourse("Advanced Java", "100-099", 4d, "Introduction to Java");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getPrerequisites() {
        assertNotNull(ajc2);
    }

    @org.junit.jupiter.api.Test
    void getCourseName() {
        assertEquals("Advanced Java", ajc2.getCourseName(), "Name should be Advanced Java");
    }

    @org.junit.jupiter.api.Test
    void getCourseNumber() {
        assertEquals("100-099", ajc2.getCourseNumber(), "Number should be 100-099");
    }

    @org.junit.jupiter.api.Test
    void setCredits() {
        assertThrows(IllegalArgumentException.class, () -> ajc2.setCredits(5d), "Credits cannot exceed 4.0");
        assertThrows(IllegalArgumentException.class, () -> ajc2.setCredits(.4d), "Credits cannot be less than .5");
    }

}