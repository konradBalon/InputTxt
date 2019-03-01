package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputText {
    private String inputWord;
    private List wordsList = new ArrayList();
    private String filePath;

    public List getWordsList() {
        return wordsList;
    }

    public InputText (String filePath) {this.filePath= filePath;};
    public InputText (){}


    public void TextReader() {
        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            inputWord = fileReader.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!!");
        } catch (IOException e) {
            System.out.println("can't read the data!!!");
        }
        while (inputWord != null) {    //petla zapisuje slowa do listy
            try {
                wordsList.add(inputWord);
                inputWord = fileReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Can't close the file!!");
        }


    }


}