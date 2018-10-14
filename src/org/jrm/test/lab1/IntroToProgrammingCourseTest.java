package org.jrm.test.lab1;

import lab1.IntroToProgrammingCourse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroToProgrammingCourseTest {

    IntroToProgrammingCourse ipc1;

    @BeforeEach
    void setUp() {
        ipc1 = new lab1.IntroToProgrammingCourse("Introduction to Programming", "100-024", 3d,null);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ipc1.setCredits(-1d), "Credits must be non-zero");
    }

    @Test
    void setPrerequisites()
    {
        ipc1.setPrerequisites(null);

        assertEquals("", ipc1.getPrerequisites(), "Prerequisites of null yeild empty string");
    }
}