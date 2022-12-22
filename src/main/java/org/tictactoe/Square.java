package org.tictactoe;

public class Square {
    public enum SquareStatus {
        EMPTY, PLAYER1, PLAYER2;
    }
    SquareStatus status;
    private final int x;
    private final int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        status = SquareStatus.EMPTY;
    }

    public SquareStatus getStatus() {
        return status;
    }
}
