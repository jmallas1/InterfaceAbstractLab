package org.jrm.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntroJavaCourseTest {

    lab1.IntroJavaCourse ijc1;
    lab2.IntroJavaCourse ijc2;

    @BeforeEach
    void setUp() {
        ijc1 = new lab1.IntroJavaCourse("Introduction to Java", "100-049");
        ijc2 = new lab2.IntroJavaCourse("Introduction to Java", "100-050");
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
    void getPrerequisites() {
    }
}