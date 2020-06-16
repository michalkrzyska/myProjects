package com.michalkrzyska;

import java.util.Scanner;

public class Main {
    TicTacToe ticTacToe = new TicTacToe();


    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        boolean winFlag = false;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        ticTacToe.printRulesTable();
        try {
        while (!winFlag) {
            boolean xCorrectChoice = true;
            boolean oCorrectChoice = true;

                while (xCorrectChoice) {
                    if (ticTacToe.changeFieldX(scanner.nextInt())) {
                        xCorrectChoice = false;
                        ticTacToe.printTable();
                    } else {
                        System.out.println("Please choose field, by typing number from 1 to 9");
                    }
                }
                counter++;

                if (ticTacToe.winX()) {
                    winFlag = true;
                    System.out.println("xxxxxxxxxxxxxxxx X WON! xxxxxxxxxxxxxxxx");
                }
                if (counter >= 9) {
                    winFlag = true;
                    System.out.println("xxxxxxxxxxxxxxxx DRAW! xxxxxxxxxxxxxxxx");
                }
                while (oCorrectChoice) {
                    if (ticTacToe.changeField0(scanner.nextInt())) {
                        oCorrectChoice = false;
                        ticTacToe.printTable();
                    } else {
                        System.out.println("Please choose field, by typing number from 1 to 9");
                    }
                }
                counter++;
                if (ticTacToe.winO()) {
                    winFlag = true;
                    System.out.println("xxxxxxxxxxxxxxxx O WON! xxxxxxxxxxxxxxxx");
                }
                xCorrectChoice = true;
                oCorrectChoice = true;
            }
        }catch (Exception e ){
            System.out.println("YOU PLAYED YOURSELF, IT'S A SIMPLE CONSOLE GAME, I DONT HAVE TIME FOR ALL YOUR ERROR HANDLING, BUDDY!\n START OVER, GUY!");
        }


    }


}

