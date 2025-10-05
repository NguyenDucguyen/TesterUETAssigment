package com.showtime;

public class Bomberman {
    public static int tinhDiem(int bricks, int enemies, int time) {

        final int BRICK_POINT = 10;
        final int ENEMY_POINT = 100;

        int brickScore = bricks * BRICK_POINT;
        int enemyScore = enemies * ENEMY_POINT;

        if (enemies >= 5) {
            enemyScore = (int)(enemyScore * 1.5);
        }

        int totalScore = brickScore + enemyScore;

        if (time < 60) {
            totalScore = (int)(totalScore * 1.2);
        } else if (time <= 180) {
            totalScore = (int)(totalScore * 1.1);
        }
        return totalScore;
    }
}
