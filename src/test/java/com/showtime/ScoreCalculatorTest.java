package com.showtime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreCalculatorTest {

    private Bomberman calculator;

    @BeforeEach
    void setUp() {
        calculator = new Bomberman();
    }

    // Test Case 1: (3)F -> (6)T. enemies=4 (<5), time=59 (<60)
    @Test
    void testPath_1_F_T() {
        int bricks = 1;
        int enemies = 4;
        int time = 59; // time < 60 (TRUE)
        int expected = 492;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 1 (F, T) failed");
    }

    // Test Case 2: (3)F -> (6)F -> (8)F. enemies=4 (<5), time=181 (>180)
    @Test
    void testPath_2_F_F_F() {
        int bricks = 1;
        int enemies = 4;
        int time = 181;
        int expected = 410;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 2 (F, F, F) failed");
    }

    // Test Case 3: (3)F -> (6)F -> (8)T. enemies=4 (<5), time=60 (60-180)
    @Test
    void testPath_3_F_F_T() {
        int bricks = 1;
        int enemies = 4;
        int time = 60;
        int expected = 451;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 3 (F, F, T) failed");
    }

    // Test Case 4: (3)T -> (6)T. enemies=5 (>=5), time=59 (<60)
    @Test
    void testPath_4_T_T() {
        int bricks = 1;
        int enemies = 5;
        int time = 59;
        int expected = 912;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 4 (T, T) failed");
    }


    @Test
    void testPath_5_T_F_T() {
        int bricks = 1;
        int enemies = 5;
        int time = 60;
        int expected = 836;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 5 (T, F, T) failed");
    }

    // Test Case 6: (3)T -> (6)F -> (8)F. enemies=5 (>=5), time=181 (>180)
    @Test
    void testPath_6_T_F_F() {
        int bricks = 1;
        int enemies = 5;
        int time = 181;
        int expected = 760;
        assertEquals(expected, calculator.tinhDiem(bricks, enemies, time), "Test Case 6 (T, F, F) failed");
    }
}
