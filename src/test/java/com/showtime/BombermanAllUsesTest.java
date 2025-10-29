package com.showtime;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class BombermanAllUsesTest {

    // 1) bricks (0,2) -> dùng T8
    @Test
    public void test_bricks_0_2() {
        int result = Bomberman.tinhDiem(2, 4, 59);
        assertEquals(504, result);
    }

    // 2) enemies (0,2) -> dùng T5
    @Test
    public void test_enemies_0_2() {
        int result = Bomberman.tinhDiem(4, 4, 80);
        assertEquals(484, result);
    }

    // 3) enemies (0,3[T]) -> dùng T6
    @Test
    public void test_enemies_0_3T() {
        int result = Bomberman.tinhDiem(5, 7, 181);
        assertEquals(1100, result);
    }

    // 4) enemies (0,3[F]) -> dùng T2
    @Test
    public void test_enemies_0_3F() {
        int result = Bomberman.tinhDiem(2, 3, 100);
        assertEquals(352, result);
    }

    // 5) time (0,6[T]) -> dùng T1
    @Test
    public void test_time_0_6T() {
        int result = Bomberman.tinhDiem(1, 5, 30);
        assertEquals(912, result);
    }

    // 6) time (0,6[F]) -> dùng T4
    @Test
    public void test_time_0_6F() {
        int result = Bomberman.tinhDiem(3, 8, 60);
        assertEquals(1353, result);
    }

    // 7) time (0,8[T]) -> dùng T7
    @Test
    public void test_time_0_8T() {
        int result = Bomberman.tinhDiem(6, 5, 120);
        assertEquals(891, result);
    }

    // 8) time (0,8[F]) -> dùng T3
    @Test
    public void test_time_0_8F() {
        int result = Bomberman.tinhDiem(0, 0, 200);
        assertEquals(0, result);
    }

    // 9) BRICK_POINT (1,2) -> dùng T1
    @Test
    public void test_BRICK_POINT_1_2() {
        int result = Bomberman.tinhDiem(1, 5, 30);
        assertEquals(912, result);
    }

    // 10) ENEMY_POINT (1,2) -> dùng T5
    @Test
    public void test_ENEMY_POINT_1_2() {
        int result = Bomberman.tinhDiem(4, 4, 80);
        assertEquals(484, result);
    }

    // 11) brickScore (2,5) -> dùng T6
    @Test
    public void test_brickScore_2_5() {
        int result = Bomberman.tinhDiem(5, 7, 181);
        assertEquals(1100, result);
    }

    // 12) enemyScore (2,4) -> dùng T1
    @Test
    public void test_enemyScore_2_4() {
        int result = Bomberman.tinhDiem(1, 5, 30);
        assertEquals(912, result);
    }

    // 13) enemyScore (2,5) -> dùng T5
    @Test
    public void test_enemyScore_2_5() {
        int result = Bomberman.tinhDiem(4, 4, 80);
        assertEquals(484, result);
    }

    // 14) enemyScore (4,5) -> dùng T7
    @Test
    public void test_enemyScore_4_5() {
        int result = Bomberman.tinhDiem(6, 5, 120);
        assertEquals(891, result);
    }

    // 15) totalScore (5,7) -> dùng T8
    @Test
    public void test_totalScore_5_7() {
        int result = Bomberman.tinhDiem(2, 4, 59);
        assertEquals(504, result);
    }

    // 16) totalScore (5,9) -> dùng T2
    @Test
    public void test_totalScore_5_9() {
        int result = Bomberman.tinhDiem(2, 3, 100);
        assertEquals(352, result);
    }

    // 17) totalScore (5,10) -> dùng T4
    @Test
    public void test_totalScore_5_10() {
        int result = Bomberman.tinhDiem(3, 8, 60);
        assertEquals(1353, result);
    }

    // 18) totalScore (7,10) -> dùng T1
    @Test
    public void test_totalScore_7_10() {
        int result = Bomberman.tinhDiem(1, 5, 30);
        assertEquals(912, result);
    }

    // 19) totalScore (9,10) -> dùng T7
    @Test
    public void test_totalScore_9_10() {
        int result = Bomberman.tinhDiem(6, 5, 120);
        assertEquals(891, result);
    }
}
