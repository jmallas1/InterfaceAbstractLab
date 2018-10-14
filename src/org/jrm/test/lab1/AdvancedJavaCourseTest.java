package org.jrm.test.lab1;

import lab1.AdvancedJavaCourse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedJavaCourseTest {

    AdvancedJavaCourse ajc1;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ajc1 = new lab1.AdvancedJavaCourse("Advanced Java", "100-099");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getPrerequisites() {
        assertNotNull(ajc1);
    }

    @org.junit.jupiter.api.Test
    void getCourseName() {
        assertEquals("Advanced Java", ajc1.getCourseName(), "Name should be Advanced Java");
    }

    @org.junit.jupiter.api.Test
    void getCourseNumber() {
        assertEquals("100-099", ajc1.getCourseNumber(), "Number should be 100-099");
    }

    @org.junit.jupiter.api.Test
    void setCredits() {
        assertThrows(IllegalArgumentException.class, () -> ajc1.setCredits(5d), "Credits cannot exceed 4.0");
        assertThrows(IllegalArgumentException.class, () -> ajc1.setCredits(.4d), "Credits cannot be less than .5");
    }
}