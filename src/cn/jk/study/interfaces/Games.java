package cn.jk.study.interfaces;

import cn.jk.study.util.Print;

/**
 * Created by jiakang on 2018/5/31.
 */
interface Game {boolean move();}
interface GameFactory {Game getGame();}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    @Override
    public boolean move() {
        Print.print("Checkers move "+moves);
        return ++moves != MOVES;
    }
}

class CheckerFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Checkers();
    }
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;
    @Override
    public boolean move () {
        Print.print("Chess move "+moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while(s.move()) {
        }
    }

    public static void main (String... args) {
        playGame(new CheckerFactory());
        playGame(new ChessFactory());
    }
}
