package org.jrm.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroToProgrammingCourseTest {

    lab1.IntroToProgrammingCourse ipc1;
    lab2.IntroToProgrammingCourse ipc2;

    @BeforeEach
    void setUp() {
        ipc1 = new lab1.IntroToProgrammingCourse("Introduction to Programming", "100-024");
        ipc2 = new lab2.IntroToProgrammingCourse("Introduction to Programming", "100-025");
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