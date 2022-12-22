package org.tictactoe;

import java.util.Scanner;

public class Input {

    Display display = new Display();

    public String getRowInput(){
        display.displayMessage("Choose row (a, b or c): ");
        Scanner scan = new Scanner(System.in);
        String rowInput = scan.nextLine();
        return rowInput;
    }

    public int getColInput(){
        display.displayMessage("Choose column 1, 2 or 3)");
        Scanner scan = new Scanner(System.in);
        int colInput = scan.nextInt();
        return colInput;
    }
}
