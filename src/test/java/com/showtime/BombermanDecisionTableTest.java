package com.showtime;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BombermanDecisionTableTest {

    // Test case 1
    @Test
    public void testCase1() {
        int result = Bomberman.tinhDiem(10, 2, 50);
        assertEquals(340, result);
    }

    // Test case 2
    @Test
    public void testCase2() {
        int result = Bomberman.tinhDiem(5, 3, 120);
        assertEquals(385, result);
    }

    // Test case 3
    @Test
    public void testCase3() {
        int result = Bomberman.tinhDiem(8, 1, 200);
        assertEquals(180, result);
    }

    // Test case 4
    @Test
    public void testCase4() {
        int result = Bomberman.tinhDiem(12, 6, 40);
        assertEquals(1332, result);
    }

    // Test case 5
    @Test
    public void testCase5() {
        int result = Bomberman.tinhDiem(4, 7, 100);
        assertEquals(1201, result);
    }

    // Test case 6
    @Test
    public void testCase6() {
        int result = Bomberman.tinhDiem(3, 10, 300);
        assertEquals(1530, result);
    }

    // Test case 7
    @Test
    public void testCase7() {
        int result = Bomberman.tinhDiem(15, 0, 50);
        assertEquals(180, result);
    }

    // Test case 8
    @Test
    public void testCase8() {
        int result = Bomberman.tinhDiem(20, 0, 150);
        assertEquals(220, result);
    }

    // Test case 9
    @Test
    public void testCase9() {
        int result = Bomberman.tinhDiem(25, 0, 250);
        assertEquals(250, result);
    }

    // Test case 10
    @Test
    public void testCase10() {
        int result = Bomberman.tinhDiem(0, 5, 30);
        assertEquals(900, result);
    }

    // Test case 11
    @Test
    public void testCase11() {
        int result = Bomberman.tinhDiem(0, 2, 100);
        assertEquals(220, result);
    }

    // Test case 12
    @Test
    public void testCase12() {
        int result = Bomberman.tinhDiem(0, 4, 300);
        assertEquals(400, result);
    }
}
