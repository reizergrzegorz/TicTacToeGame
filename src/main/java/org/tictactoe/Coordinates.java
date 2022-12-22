package org.tictactoe;

public class Coordinates {

    Input input = new Input();


    public int changeRowInputToIndex(){
        int yCoords = 0;
        switch (input.getRowInput().charAt(0)){
            case 'a':
                yCoords = 0;
                break;
            case 'b':
                yCoords = 1;
                break;
            case 'c':
                yCoords = 2;
                break;
        }
        return yCoords;
    }

    public int changeColInputToIndex(){
        int xCoords = input.getColInput() - 1;
        return xCoords;
    }
}
