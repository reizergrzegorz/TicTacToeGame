package org.tictactoe;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        Display display = new Display();
        Coordinates coordinates = new Coordinates();
        Player player1 = new Player(1);
        Player player2 = new Player(2);


        int x = coordinates.changeColInputToIndex();
        int y = coordinates.changeRowInputToIndex();
        board.placePlayerChoice(x, y, player1);
        display.displayBoard(board);
        x = coordinates.changeColInputToIndex();
        y = coordinates.changeRowInputToIndex();
        board.placePlayerChoice(x, y, player2);
        display.displayBoard(board);













    }
}