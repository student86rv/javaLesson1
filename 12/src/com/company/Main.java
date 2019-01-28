package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static class Ball {
    }

    private static class Board {

        List<Ball> balls = new ArrayList<>();

        public Board() {
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count() {
            return balls.size();
        }
    }

    public static void main(String[] args) {

        Board board = new Board();
        System.out.println(board.count());
    }
}
