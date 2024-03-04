package com.vladproduction.vp06_if;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class GradeCalculatorTest {

    private GradeCalculator gradeCalculator = new GradeCalculator();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams(){

        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams(){

        System.setOut(System.out);
    }

    @Test
    public void gradeA_Test(){
        gradeCalculator.grades(100);
        assertEquals("Grade: A", outContent.toString().trim());
    }

    @Test
    public void gradeB_Test(){
        gradeCalculator.grades(81);
        assertEquals("Grade: B", outContent.toString().trim());
    }

    @Test
    public void gradeC_Test(){
        gradeCalculator.grades(76);
        assertEquals("Grade: C", outContent.toString().trim());
    }

    @Test
    public void gradeD_F_Test(){
        gradeCalculator.grades(67);
        assertEquals("Grade: D or F", outContent.toString().trim());
    }

}