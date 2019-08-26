package com.epam.mikhail_gorbachenko.java.lesson1.task2;

import com.epam.mikhail_gorbachenko.java.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Написать программу, осуществляющую обработку строк
 * Вариант 6:
 * Ввести n слов с консоли. Найти слово, состоящее только из цифр. Если таких слов больше одного, найти второе из них.
 */

public class Option6 {

    public static void main(String[] args) throws IOException {
        ArrayList<String> inputText = Utils.StringTools.consoleInput(true);

        Option6 app = new Option6();
        app.printDigitWord(inputText);
    }

    void printDigitWord(ArrayList<String> list){
        LinkedList<String> digitWords = new LinkedList<>();

        for (String word: list) {
                if(Utils.StringTools.isDigitWord(word)){
                    digitWords.add(word);
            }
        }

        if (digitWords.isEmpty()){
            System.out.println("It seems like digit word not found");
        } else if (digitWords.size()>1) {
            System.out.println("Second digit word was \""+ digitWords.get(1) +"\"");
        } else {
            System.out.println("First and only digit word was \""+ digitWords.get(0) +"\"");
        }

    }

}
