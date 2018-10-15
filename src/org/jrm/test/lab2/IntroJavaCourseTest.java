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

    // Test overridden methods
    @Test
    void setPrerequisites()
    {
        ijc2.setPrerequisites(null);
        assertEquals("", ijc2.getPrerequisites(), "Null should default to empty string");
    }

    @Test
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ijc2.setCredits(6d), "Credits cannot exceed 4.0");
    }
}