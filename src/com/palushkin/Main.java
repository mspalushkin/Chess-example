package com.palushkin;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Queen queen = new Queen();
        Position testPosition = new Position(3,10);
        if (queen.isValidMove(testPosition)){
            System.out.println("Ход возможен");
        }else {
            System.out.println("Ход за пределы поля невозможен");
        }

    }
}
