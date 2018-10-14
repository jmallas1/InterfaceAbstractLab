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
        ipc1 = new lab1.IntroToProgrammingCourse("Introduction to Programming", "100-024");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getCourseNumber() {
    }

    @Test
    void getCredits() {
    }

    @Test
    void getCourseName() {
    }
}