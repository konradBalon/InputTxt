package com.company;

import java.util.Scanner;

public class Main {
    public String haslo;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = "";
         String haslo="";

        System.out.println("Podaj literę: ");

        RandomWord randomWord = new RandomWord();
        haslo = randomWord.randomize();

        inputString = scanner.next();
        if (haslo.contains(inputString))
        {
            System.out.println();
            System.out.println(" haslo zawiera ta litere");
        }
        else {
            System.out.println("sprobuj jeszcze raz");
        }


    }
}
