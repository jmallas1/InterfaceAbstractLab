package org.jrm.test;

import static org.junit.jupiter.api.Assertions.*;

class AdvancedJavaCourseTest {

    lab1.AdvancedJavaCourse ajc1;
    lab2.AdvancedJavaCourse ajc2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        ajc1 = new lab1.AdvancedJavaCourse("Advanced Java", "100-099");
        ajc2 = new lab2.AdvancedJavaCourse("Advanced Java", "100-100");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getPrerequisites() {
        assertNotNull(ajc1);
        assertNotNull(ajc2);
    }

    @org.junit.jupiter.api.Test
    void getCourseName() {
        assertEquals("Advanced Java", ajc1.getCourseName(), "Name should be Advanced Java");
        assertEquals("Advanced Java", ajc2.getCourseName(), "Name should be Advanced Java");
    }

    @org.junit.jupiter.api.Test
    void getCourseNumber() {
        assertEquals("100-099", ajc1.getCourseNumber(), "Number should be 100-099");
        assertEquals("100-100", ajc2.getCourseNumber(), "Number should be 100-100");
    }
}