package org.jrm.test.lab1;

import lab1.IntroJavaCourse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroJavaCourseTest {

    IntroJavaCourse ijc1;

    @BeforeEach
    void setUp() {
        ijc1 = new lab1.IntroJavaCourse("Introduction to Java", "100-049", 4d, "Introduction to Programming");
    }

    @AfterEach
    void tearDown() {
    }

    // Test overridden methods
    @Test
    void setPrerequisites()
    {
        ijc1.setPrerequisites(null);
        assertEquals("", ijc1.getPrerequisites(), "Null should default to empty string");
    }

    @Test
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ijc1.setCredits(6d), "Credits cannot exceed 4.0");
    }
}