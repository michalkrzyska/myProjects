package com.michalkrzyska;

import javax.print.DocFlavor;

public class TicTacToe {

    enum Fields {
        X,
        O,
        EMPTY;
    }

    private Fields[][] gameBoard = {{Fields.EMPTY,Fields.EMPTY,Fields.EMPTY,},
                                   {Fields.EMPTY,Fields.EMPTY,Fields.EMPTY,},
                                   {Fields.EMPTY,Fields.EMPTY,Fields.EMPTY,}};
    
    public boolean changeFieldX (int change){
        switch (change){
            case 1:
                if (gameBoard[0][0]==Fields.EMPTY){
                    gameBoard[0][0]=Fields.X;
                    return true;
                } else{
                    return false;
                }
            case 2:
                if (gameBoard[0][1]==Fields.EMPTY){
                    gameBoard[0][1]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 3:
                if (gameBoard[0][2]==Fields.EMPTY){
                    gameBoard[0][2]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 4:
                if (gameBoard[1][0]==Fields.EMPTY){
                    gameBoard[1][0]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 5:
                if (gameBoard[1][1]==Fields.EMPTY){
                    gameBoard[1][1]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 6:
                if (gameBoard[1][2]==Fields.EMPTY){
                    gameBoard[1][2]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 7:
                if (gameBoard[2][0]==Fields.EMPTY){
                    gameBoard[2][0]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 8:
                if (gameBoard[2][1]==Fields.EMPTY){
                    gameBoard[2][1]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            case 9:
                if (gameBoard[2][2]==Fields.EMPTY){
                    gameBoard[2][2]=Fields.X;
                    return true;
                } else{
                    return false;
                }
                
            default:
                return false;
        }
    }
    public boolean changeField0 (int change){
        switch (change){
            case 1:
                if (gameBoard[0][0]==Fields.EMPTY){
                    gameBoard[0][0]=Fields.O;
                    return true;
                } else{
                    return false;
                }
            case 2:
                if (gameBoard[0][1]==Fields.EMPTY){
                    gameBoard[0][1]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 3:
                if (gameBoard[0][2]==Fields.EMPTY){
                    gameBoard[0][2]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 4:
                if (gameBoard[1][0]==Fields.EMPTY){
                    gameBoard[1][0]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 5:
                if (gameBoard[1][1]==Fields.EMPTY){
                    gameBoard[1][1]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 6:
                if (gameBoard[1][2]==Fields.EMPTY){
                    gameBoard[1][2]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 7:
                if (gameBoard[2][0]==Fields.EMPTY){
                    gameBoard[2][0]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 8:
                if (gameBoard[2][1]==Fields.EMPTY){
                    gameBoard[2][1]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            case 9:
                if (gameBoard[2][2]==Fields.EMPTY){
                    gameBoard[2][2]=Fields.O;
                    return true;
                } else{
                    return false;
                }

            default:
                return false;
        }
    }

    public boolean winX () {
        if (gameBoard[0][0] == Fields.X && gameBoard[0][1] == Fields.X && gameBoard[0][2] == Fields.X ) {
            return true;
        } else if (gameBoard[1][0] == Fields.X && gameBoard[1][1] == Fields.X && gameBoard[1][2] == Fields.X ){
            return true;
        }else if (gameBoard[2][0] == Fields.X && gameBoard[2][1] == Fields.X && gameBoard[2][2] == Fields.X ){
            return true;
        } else if (gameBoard[0][0] == Fields.X && gameBoard[1][1] == Fields.X && gameBoard[2][2] == Fields.X ){
            return true;
        }else if (gameBoard[0][2] == Fields.X && gameBoard[1][1] == Fields.X && gameBoard[2][0] == Fields.X ){
            return true;
        }else if (gameBoard[0][0] == Fields.X && gameBoard[1][0] == Fields.X && gameBoard[2][0] == Fields.X ){
            return true;
        }else if (gameBoard[0][1] == Fields.X && gameBoard[1][1] == Fields.X && gameBoard[2][1] == Fields.X ){
            return true;
        }else if (gameBoard[0][2] == Fields.X && gameBoard[1][2] == Fields.X && gameBoard[2][2] == Fields.X ){
            return true;
        } else {
            return false;
        }
    }
    public boolean winO () {
        if (gameBoard[0][0] == Fields.O && gameBoard[0][1] == Fields.O && gameBoard[0][2] == Fields.O ) {
            return true;
        } else if (gameBoard[1][0] == Fields.O && gameBoard[1][1] == Fields.O && gameBoard[1][2] == Fields.O ){
            return true;
        }else if (gameBoard[2][0] == Fields.O && gameBoard[2][1] == Fields.O && gameBoard[2][2] == Fields.O ){
            return true;
        } else if (gameBoard[0][0] == Fields.O && gameBoard[1][1] == Fields.O && gameBoard[2][2] == Fields.O ){
            return true;
        }else if (gameBoard[0][2] == Fields.O && gameBoard[1][1] == Fields.O && gameBoard[2][0] == Fields.O ){
            return true;
        }else if (gameBoard[0][0] == Fields.O && gameBoard[1][0] == Fields.O && gameBoard[2][0] == Fields.O ){
            return true;
        }else if (gameBoard[0][1] == Fields.O && gameBoard[1][1] == Fields.O && gameBoard[2][1] == Fields.O ){
            return true;
        }else if (gameBoard[0][2] == Fields.O && gameBoard[1][2] == Fields.O && gameBoard[2][2] == Fields.O ){
            return true;
        } else {
            return false;
        }
    }

    public void printRulesTable(){
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.println("              Welcome to Tic Tac Toe game");
        System.out.println("Please choose the field, by typing the number into the console");
        System.out.println("|1|2|3|\n" +
                "|4|5|6|\n" +
                "|7|8|9|");
    }
    public void printTable (){
        for (int i =0; i < 3; i++){
            System.out.print("|");
            for (int j=0; j< 3; j++){
                if (gameBoard[i][j] == Fields.EMPTY){
                    System.out.print(" |");
                } else {
                    System.out.print(gameBoard[i][j] + "|");
                }
            }
            System.out.println();
        }
    }
    }



