package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class  RandomWord {

    Random random = new Random();
    private List lista = new ArrayList<String>();

    public RandomWord(){}
    private String randomWord;

    InputText inputText = new InputText("listaSlow.txt");  //mozna podac sciezke do pliku jako argument

    public String randomize () {
        inputText.TextReader();
        lista = inputText.getWordsList();
        randomWord= lista.get(random.nextInt(4)-0).toString();



        System.out.println(randomWord);

    return randomWord;
   }



    }

