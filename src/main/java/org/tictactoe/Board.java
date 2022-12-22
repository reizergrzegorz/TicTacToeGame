package org.tictactoe;

public class Board {
    private final int boardSize = 3;

    private final String[] chars = {"A ", "B ", "C "};

    Square [][] board;

    public Board() {
        board = new Square[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = new Square(i,j);
            }
        }
    }

    public void placePlayerChoice(int x, int y, Player player){
        if (player.getPlayerNumber() == 1) {
            board[x][y].status = Square.SquareStatus.PLAYER1;
        } else {
            board[x][y].status = Square.SquareStatus.PLAYER2;
        }
    }

    @Override
    public String toString() {
        String boardAsString = "    1     2     3";
        boardAsString += "\n";
        for (int i = 0; i < boardSize; i++) {
            boardAsString += chars[i] + " ";
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] != null) {
                    switch (board[i][j].getStatus()) {
                        case EMPTY:
                            boardAsString += " - " + " | ";
                            break;
                        case PLAYER1:
                            boardAsString += " X " + " | ";
                            break;
                        case PLAYER2:
                            boardAsString += " O " + " | ";
                            break;
                    }
                }
            }
            boardAsString += "\n";
        }
        return boardAsString;
    }
}