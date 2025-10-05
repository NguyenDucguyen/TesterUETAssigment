package com.showtime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BoundaryValueTest {

    private void printCase(int id, int enemies, int bricks, int time, Integer expected, int actual) {
        boolean passed = (expected != null && expected == actual);
        System.out.printf("%-5d %-10d %-10d %-10d %-15s %-15d %-10s%n",
                id, enemies, bricks, time,
                expected == null ? "Invalid" : expected.toString(),
                actual,
                passed ? "Passed" : "Not Passed");
    }

    @Test
    void testCase1() {
        int actual = Bomberman.tinhDiem(500, 25, 150);
        printCase(1, 25, 500, 150, 9625, actual);
        assertEquals(9625, actual);
    }

    @Test
    void testCase2() {
        int actual = Bomberman.tinhDiem(500, 0, 150);
        printCase(2, 0, 500, 150, 5500, actual);
        assertEquals(5500, actual);
    }

    @Test
    void testCase3() {
        int actual = Bomberman.tinhDiem(500, 1, 150);
        printCase(3, 1, 500, 150, 5610, actual);
        assertEquals(5610, actual);
    }

    @Test
    void testCase4() {
        int actual = Bomberman.tinhDiem(500, 49, 150);
        printCase(4, 49, 500, 150, 10945, actual);
        assertEquals(10945, actual);
    }

    @Test
    void testCase5() {
        int actual = Bomberman.tinhDiem(500, 50, 150);
        printCase(5, 50, 500, 150, 11110, actual);
        assertEquals(11110, actual);
    }

    @Test
    void testCase6() {
        int actual = Bomberman.tinhDiem(0, 25, 150);
        printCase(6, 25, 0, 150, 4125, actual);
        assertEquals(4125, actual);
    }

    @Test
    void testCase7() {
        int actual = Bomberman.tinhDiem(1, 25, 150);
        printCase(7, 25, 1, 150, 4136, actual);
        assertEquals(4136, actual);
    }

    @Test
    void testCase8() {
        int actual = Bomberman.tinhDiem(999, 25, 150);
        printCase(8, 25, 999, 150, 15014, actual);
        assertEquals(15014, actual);
    }

    @Test
    void testCase9() {
        int actual = Bomberman.tinhDiem(1000, 25, 150);
        printCase(9, 25, 1000, 150, 15125, actual);
        assertEquals(15125, actual);
    }

    @Test
    void testCase10() {
        int actual = Bomberman.tinhDiem(500, 25, 0);
        printCase(10, 25, 500, 0, null, actual);
        // invalid expected => không assertEquals
    }

    @Test
    void testCase11() {
        int actual = Bomberman.tinhDiem(500, 25, 1);
        printCase(11, 25, 500, 1, 10500, actual);
        assertEquals(10500, actual);
    }

    @Test
    void testCase12() {
        int actual = Bomberman.tinhDiem(500, 25, 299);
        printCase(12, 25, 500, 299, 8750, actual);
        assertEquals(8750, actual);
    }

    @Test
    void testCase13() {
        int actual = Bomberman.tinhDiem(500, 25, 300);
        printCase(13, 25, 500, 300, 8750, actual);
        assertEquals(8750, actual);
    }
}
