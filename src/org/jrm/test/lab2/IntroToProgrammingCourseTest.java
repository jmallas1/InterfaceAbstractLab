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
    void setCredits()
    {
        assertThrows(IllegalArgumentException.class, () -> ipc2.setCredits(-1d), "Credits must be non-zero");
    }

    @Test
    void setPrerequisites()
    {
        ipc2.setPrerequisites(null);

        assertEquals("", ipc2.getPrerequisites(), "Prerequisites of null yeild empty string");
    }
}